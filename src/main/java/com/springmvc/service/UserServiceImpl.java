package com.springmvc.service;


import com.springmvc.entity.UUser;
import com.springmvc.mapper.daomapper.UUserMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImpl<UUser, Integer>implements UserService {
    @Resource
    private UUserMapper mapper;

    @Override
    public BaseMapper<UUser> getMapper() {
        return mapper;
    }

    @Override
    public UUser queryUserByName(String userName) {
        Example example = new Example(UUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("email",userName);
        List<UUser> dfasd = mapper.selectByExample(example);
        if(dfasd==null||dfasd.size()==0){
            return null;
        }
        UUser user = dfasd.get(0);
            return dfasd.get(0);
    }


    }
