package com.springmvc.apiController;

import com.springmvc.entity.Ad;
import com.springmvc.entity.Area;
import com.springmvc.mapper.daomapper.AreaMapper;
import com.springmvc.service.AreaServiceImpl;
import com.springmvc.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

@Controller
@Api(description="自行车",value="/aisini",tags="接口测试")
public class AreaController {
 @Autowired
    private AreaServiceImpl areaService;
 @Autowired
    private RoleService roleService;

    @ResponseBody
    @ApiOperation(value = "asd")
    @RequestMapping(value="/area/adAll1",method = RequestMethod.GET)
    public List<Area> adAll(){
        List<Area> areaList=areaService.findAll();
        return areaList;
    }
    @ResponseBody
    @ApiOperation(value="权限管理接口23",notes = "权限管理接口23")
  //  @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", dataType = "String", name = "userName", value = "用户账号", required = true) })
    @RequestMapping(value="/area/queryRolesByName",method = RequestMethod.POST)
    public Set<String> queryRolesByName(String userName){
        Set<String> ddd = roleService.queryRolesByName(userName);
        ddd.add("dfs");
        return ddd;
    }

}
