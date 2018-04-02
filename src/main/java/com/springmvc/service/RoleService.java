package com.springmvc.service;


import com.springmvc.common.core.PageResult;
import com.springmvc.entity.URole;
import com.springmvc.service.base.BaseService;

import java.util.Set;


public interface RoleService extends BaseService<URole,Integer>  {
 public Set<String>  queryRolesByName(String userName);
 public PageResult<URole> getRoles(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete);

}
