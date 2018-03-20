package com.springmvc.apiController;

import com.springmvc.entity.Ad;
import com.springmvc.service.AdServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Api(value  =  "/pet ",description="关于宠物的操作123",tags = "关于宠物的操作123")
@Controller

public class AdApiController {
    @Autowired
    private AdServiceImpl adService;


   @ResponseBody
   @RequestMapping(value="/ad/adAll",method = RequestMethod.GET)
   @ApiOperation(value="一个测试API1",notes = "第一个测试api1")
     public List<Ad> adAll(){
      List<Ad> adList=adService.findAll();
     return adList;
    }
    @ApiOperation("信息软删除")
    @ApiResponses({ @ApiResponse(code = 1, message = "操作成功"),
            @ApiResponse(code = 0, message = "服务器内部异常"),
            @ApiResponse(code =2, message = "权限不足") })

    @ResponseBody
    @RequestMapping(value = "/ad/hello",method = RequestMethod.GET)

    public String hello(@ApiParam(name="topic实体",value="json格式",required=true) @RequestBody Ad ad)
    {
        return "hello";
    }

    @ApiOperation(value="一个测试API2",notes = "第一个测试api1")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", dataType = "Long", name = "id", value = "信息id", required = true) })
    @ResponseBody
    @RequestMapping(value="/adAll1",method = RequestMethod.GET)
    public List<Ad> adAll11(Long id){
        List<Ad> adList=adService.findAll();
        return adList;
    }

}


