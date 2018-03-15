package com.springmvc.service;


import com.springmvc.entity.Ad;
import com.springmvc.mapper.daomapper.AdMapper;
import com.springmvc.service.base.BaseService;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.BaseMapper;



public interface  AdService extends BaseService<Ad,Integer> {


}
