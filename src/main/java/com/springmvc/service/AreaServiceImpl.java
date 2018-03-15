package com.springmvc.service;

import com.springmvc.entity.Ad;
import com.springmvc.entity.Area;
import com.springmvc.mapper.daomapper.AreaMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import javax.annotation.Resource;
@Service
public class AreaServiceImpl extends BaseServiceImpl<Area,Integer> implements AreaService {
@Resource
public AreaMapper areaMapper;

    @Override
    public BaseMapper<Area> getMapper() {
        return areaMapper;
    }
}
