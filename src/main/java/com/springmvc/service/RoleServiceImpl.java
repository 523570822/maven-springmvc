package com.springmvc.service;


import com.springmvc.entity.URole;
import com.springmvc.mapper.daomapper.URoleMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;


import javax.annotation.Resource;
import java.util.Set;


@Service
public class RoleServiceImpl extends BaseServiceImpl<URole, Integer>implements RoleService {
    @Resource
    private URoleMapper mapper;

    @Override
    public BaseMapper<URole> getMapper() {
        return mapper;
    }

    @Override
    public  Set<String> queryRolesByName(String userName) {

        Set<String>  roles = mapper.queryRolesByName(userName);

  //      List<User> dfasd = mapper.selectByExample(example);

        return roles;
    }
}
