package com.springmvc.common.dao;

import com.springmvc.common.model.UUserRole;

import java.util.List;
import java.util.Map;



public interface UUserRoleMapper {
    int insert(UUserRole record);

    int insertSelective(UUserRole record);

	int deleteByUserId(Long id);

	int deleteRoleByUserIds(Map<String, Object> resultMap);

	List<Long> findUserIdByRoleId(Long id);
}