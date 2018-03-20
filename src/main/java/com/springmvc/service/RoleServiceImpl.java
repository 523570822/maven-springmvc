package com.springmvc.service;


import com.springmvc.entity.Role;

import com.springmvc.mapper.daomapper.SysRolesMapper;

import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;


import javax.annotation.Resource;
import java.util.List;
import java.util.Set;


@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer>implements RoleService {
    @Resource
    private SysRolesMapper mapper;

    @Override
    public BaseMapper<Role> getMapper() {
        return mapper;
    }

    @Override
    public  Set<String> queryRolesByName(String userName) {

        Set<String>  roles = mapper.queryRolesByName(userName);

  //      List<User> dfasd = mapper.selectByExample(example);

        return roles;
    }
}
