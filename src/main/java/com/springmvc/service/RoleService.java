package com.springmvc.service;


import com.springmvc.common.core.PageResult;
import com.springmvc.entity.Role;
import com.springmvc.service.base.BaseService;

import java.util.Set;


public interface RoleService extends BaseService<Role,Integer>  {
 public Set<String>  queryRolesByName(String userName);
 public PageResult<Role> getRoles(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete);

}
