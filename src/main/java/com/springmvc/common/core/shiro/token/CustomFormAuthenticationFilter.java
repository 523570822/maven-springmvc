package com.springmvc.common.core.shiro.token;

import com.springmvc.common.core.shiro.token.manager.TokenManager;
import com.springmvc.entity.User;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        // 在这里进行验证码的校验
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        // 取出验证码
        String validateCode=TokenManager.getYZM();



        // 取出页面的验证码
        // 输入的验证和session中的验证进行对比
       String randomcode = httpServletRequest.getParameter("vcode");
       if (randomcode != null && validateCode != null && !randomcode.equals(validateCode)) {
            // 如果校验失败，将验证码错误失败信息，通过shiroLoginFailure设置到request中
            httpServletRequest.setAttribute("shiroLoginFailure", "randomCodeError");
            // 拒绝访问，不再校验账号和密码
            return true;
      }
        return super.onAccessDenied(request, response);
    }
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
    {
        //本次用户登陆账号
        Subject subject = this.getSubject(request, response);
        String account = this.getUsername(request);


        if (isLoginRequest(request, response))
        {
            if (isLoginSubmission(request, response))
            {
           //     subject.logout();
                //本次用户登陆账号



                //之前登陆的用户
             User    user  = (User)subject.getPrincipal();
                String username=null;
             if(user==null){

             }else{
                  username=user.getEmail();
             }



                //如果两次登陆的用户不一样，则先退出之前登陆的用户
                if (account != null && username != null && !account.equals(username))
                {
                    subject.logout();
                }
            }
        }
        boolean bool = super.isAccessAllowed(request, response, mappedValue);
        return bool;
    }
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
                                     ServletResponse response) throws Exception {
        //获取已登录的用户信息
       User activeUser = (User) subject.getPrincipal();
        //获取session
        HttpServletRequest httpServletRequest = WebUtils.toHttp(request);
        HttpSession session = httpServletRequest.getSession();
        //把用户信息保存到session
        session.setAttribute("user", activeUser);
        session.setAttribute("userId", activeUser.getId());
        return super.onLoginSuccess(token, subject, request, response);
    }

}
