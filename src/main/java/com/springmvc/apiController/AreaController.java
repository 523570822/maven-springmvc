package com.springmvc.apiController;

import com.springmvc.entity.Ad;
import com.springmvc.entity.Area;
import com.springmvc.mapper.daomapper.AreaMapper;
import com.springmvc.service.AreaServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(description="自行车123",value="/aisini")
public class AreaController {
 @Autowired
    private AreaServiceImpl areaService;
    @ResponseBody
    @ApiOperation(value = "asd")
    @RequestMapping(value="/area/adAll",method = RequestMethod.GET)
    public List<Area> adAll(){
        List<Area> areaList=areaService.findAll();
        return areaList;
    }


}
