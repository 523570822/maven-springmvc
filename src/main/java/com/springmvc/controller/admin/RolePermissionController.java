package com.springmvc.controller.admin;

import com.springmvc.common.controller.BaseController;
import com.springmvc.common.core.PageResult;
import com.springmvc.common.core.ResultMap;
import com.springmvc.common.core.shiro.token.manager.TokenManager;
import com.springmvc.entity.Permission;
import com.springmvc.entity.PermissionU;
import com.springmvc.entity.Role;
import com.springmvc.entity.User;
import com.springmvc.service.PermissionService;
import com.springmvc.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(value  =  "/role ",description="后台用户登陆权限接口",tags = "后台用户登陆权限接口")
@Controller
public class RolePermissionController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(RolePermissionController.class);
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @ResponseBody
    @ApiOperation(value="权限管理接口",notes = "权限管理接口")
    @RequestMapping(value="role/list",method = RequestMethod.GET)
    public PageResult<Role> queryRolesByName(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete){
      /*  if(searchValue != null){
            searchValue = new String(searchValue.getBytes("ISO-8859-1"), "UTF-8");
        }*/
        if(page == null) {
            page = 0;
            limit = 0;
        }
        return roleService.getRoles(page, limit, searchKey, searchValue, isDelete);
    }
    @ResponseBody
    @RequestMapping(value="permission/list",method = RequestMethod.GET)
    public PageResult<PermissionU> queryPermissionByName(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete){
      /*  if(searchValue != null){
            searchValue = new String(searchValue.getBytes("ISO-8859-1"), "UTF-8");
        }*/
        if(page == null) {
            page = 0;
            limit = 0;
        }
        return permissionService.getPermissions(page, limit, searchKey, searchValue, isDelete);
    }

    @ResponseBody
    @RequestMapping(value="permission/parent/{type}",method = RequestMethod.GET)
    public List<Permission> queryParent(@PathVariable int type){



        return permissionService.getParentPermissions(type);
    }

    @ResponseBody
    @RequestMapping(value="api/menu",method = RequestMethod.GET)
    public ResultMap menu(HttpServletRequest request){

        Long id = TokenManager.getUserId();
        return ResultMap.ok().put("menus", permissionService.getMenusByUser(id));

    }

}
