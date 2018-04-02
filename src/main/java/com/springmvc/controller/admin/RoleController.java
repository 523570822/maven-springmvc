package com.springmvc.controller.admin;

import com.springmvc.common.core.PageResult;
import com.springmvc.entity.URole;
import com.springmvc.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@Api(value  =  "/role ",description="后台用户登陆权限接口",tags = "后台用户登陆权限接口")
@Controller
public class RoleController {
    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);
    @Autowired
    private RoleService roleService;
    @ResponseBody
    @ApiOperation(value="权限管理接口",notes = "权限管理接口")
    @RequestMapping(value="api/role/list",method = RequestMethod.GET)
    public PageResult<URole> queryRolesByName(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete){
      /*  if(searchValue != null){
            searchValue = new String(searchValue.getBytes("ISO-8859-1"), "UTF-8");
        }*/
        if(page == null) {
            page = 0;
            limit = 0;
        }
        return roleService.getRoles(page, limit, searchKey, searchValue, isDelete);
    }


}
