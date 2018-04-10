package com.springmvc.common.core.shiro.token;

import com.springmvc.entity.User;
import com.springmvc.service.RoleService;
import com.springmvc.service.UserService;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(CustomRealm.class);
    @Autowired
   private UserService userService;
    @Autowired
    private RoleService roleService;


    /**
     * 用户登陆认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)  {
        logger.info("======用户登陆认证======");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //令牌中可以取出用户名
        String userName = token.getUsername();
        //String userName = authenticationToken.getPrincipal().toString();  //第二种获取用户名写法
        User user = userService.queryUserByName(userName);


        if (user!=null) {
            //AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPswd(), getName());

            return authenticationInfo;
        }
        return null;
    }
    /**
     * 用户授权认证
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("======用户授权认证======");
        String userName = principalCollection.getPrimaryPrincipal().toString();
        // String username = (String) principals.fromRealm(getName()).iterator().next();   //第二种获取用户名写法
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roleService.queryRolesByName(userName));
        return simpleAuthorizationInfo;
    }



    /**
     * 添加角色
     * @param username
     * @param info
     */
    private void addRole(String username, SimpleAuthorizationInfo info) {
      /*  List<Role> roles = roleDao.findByUser(username);
        if(roles!=null&&roles.size()>0){
            for (Role role : roles) {
                info.addRole(role.getRoleName());
            }
        }*/
    }

    /**
     * 添加权限
     * @param username
     * @param info
     * @return
     */
    private SimpleAuthorizationInfo addPermission(String username,SimpleAuthorizationInfo info) {
   /*     List<Permission> permissions = permissionDao.findPermissionByName(username);
        for (Permission permission : permissions) {
            info.addStringPermission(permission.getUrl());//添加权限
        }
        return info;*/
        return null;
    }

}
