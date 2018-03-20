package com.springmvc.service;


import com.springmvc.entity.Role;
import com.springmvc.entity.User;
import com.springmvc.mapper.daomapper.AdMapper;
import com.springmvc.mapper.daomapper.SysUsersMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer>implements UserService {
    @Resource
    private SysUsersMapper mapper;

    @Override
    public BaseMapper<User> getMapper() {
        return mapper;
    }

    @Override
    public Role queryRolesByName(String userName) {
        Example example = new Example(User.class);

        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo("username",userName);
        List<User> dfasd = mapper.selectByExample(example);

        return null;
    }
}
