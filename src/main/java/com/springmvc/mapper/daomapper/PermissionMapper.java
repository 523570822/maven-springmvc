package com.springmvc.mapper.daomapper;

import com.springmvc.common.core.PageResult;
import com.springmvc.entity.Permission;
import com.springmvc.entity.PermissionU;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Set;

public interface PermissionMapper extends Mapper<Permission> {
    @SelectProvider(type = PermissionSqlBuilder.class, method = "getPermissions")
    @Results(id = "PermissionU", value = {

            @Result(property = "orderNumber", column = "order_number"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "parentId", column = "parent_id"),
            @Result(property = "isDelete", column = "is_delete")
    })
    public List<PermissionU> getPermissions(String searchKey, String searchValue, Integer isDelete);

    @ResultMap("PermissionU")
 @Select({"SELECT a.* FROM permission a INNER JOIN role_permission b ON a.id = b.pid INNER JOIN role c ON c.id = b.rid INNER JOIN user_role d ON c.id = d.rid INNER JOIN user e ON e.id = d.uid WHERE e.id = #{userId} AND a.id <> '0' AND a.is_delete = 0 AND a.type = 0 ORDER BY order_number"})
    public   List<PermissionU> selectPermissionByUserId(long userId);



}