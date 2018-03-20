package com.springmvc.mapper.daomapper;

import com.springmvc.entity.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface SysRolesMapper extends Mapper<Role> {
    @Select({" SELECT r.role  FROM sys_roles r, sys_users_roles ur, sys_users u WHERE r.id = ur.role_Id AND u.id = ur.user_Id AND u.userName =#{userName}"})
  public Set<String> queryRolesByName (String  userName);


}