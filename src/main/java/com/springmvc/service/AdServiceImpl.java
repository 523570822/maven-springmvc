package com.springmvc.service;

import com.springmvc.entity.Ad;
import com.springmvc.mapper.daomapper.AdMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import javax.annotation.Resource;


@Service
public class AdServiceImpl extends BaseServiceImpl<Ad, Integer>implements AdService {
    @Resource
    private AdMapper mapper;

    @Override
    public BaseMapper<Ad> getMapper() {
        return mapper;
    }
}
