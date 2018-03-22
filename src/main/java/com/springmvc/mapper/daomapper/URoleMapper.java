package com.springmvc.mapper.daomapper;

import com.springmvc.entity.URole;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.Set;

public interface URoleMapper extends Mapper<URole> {
    @Select({"SELECT r.name  FROM u_role r, u_user_role ur, u_user u WHERE r.id = ur.rid AND u.id = ur.uid AND u.nickname=#{userName}"})
    public Set<String> queryRolesByName (String  userName);

}