package com.springmvc.controller.admin;
import com.springmvc.entity.Ad;
import com.springmvc.service.AdServiceImpl;
import com.springmvc.service.RoleService;
import com.springmvc.shiro.CustomRealm;
import io.swagger.annotations.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

@Api(value  =  "/admin ",description="后台用户登陆权限接口",tags = "后台用户登陆权限接口")
@Controller
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private RoleService roleService;
    @ResponseBody
    @ApiOperation(value="权限管理接口23",notes = "权限管理接口23")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", dataType = "String", name = "userName", value = "用户账号", required = true) })
    @RequestMapping(value="/admin/area/queryRolesByName",method = RequestMethod.POST)
    public Set<String> queryRolesByName(String userName){
        Set<String> ddd = roleService.queryRolesByName(userName);
        ddd.add("dfs");
        return ddd;
    }

    @RequestMapping(value="/admin/login")
    public String login (HttpServletRequest request) throws Exception  {
     /*   Subject subject = this.getSubject(request, response);

        if(){

            }*/

         logger.info("======进入登陆页面======");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("validateCode","123");
        // 如果登录失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        // 根据shiro返回的异常类路径判断，抛出指定异常信息
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");

        if (exceptionClassName != null) {

            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                System.out.println("用户名不存在");
                //throw new CustomException("用户名不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                System.out.println("用户名/密码不正确");
               // throw new CustomException("用户名/密码不正确");
            }else if("randomCodeError".equals(exceptionClassName)){
                System.out.println("验证码错误 ");
             //   throw new CustomException("验证码错误 ");
            }else {
                throw new Exception();// 最终在异常处理器生成未知错误
            }
        }

        // 此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        // 登陆失败还到login页面

        return "login";
    }
    @RequestMapping("/admin/index")
    public String doLogin(HttpServletRequest request){


        return "/views/index";
    }




}
