package com.springmvc.service;


import com.springmvc.entity.User;
import com.springmvc.mapper.daomapper.UserMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer>implements UserService {
    @Resource
    private UserMapper mapper;

    @Override
    public BaseMapper<User> getMapper() {
        return mapper;
    }

    @Override
    public User queryUserByName(String userName) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("email",userName);
        List<User> dfasd = mapper.selectByExample(example);
        if(dfasd==null||dfasd.size()==0){
            return null;
        }
        User user = dfasd.get(0);
            return dfasd.get(0);
    }


    }
