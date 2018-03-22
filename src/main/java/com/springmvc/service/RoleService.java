package com.springmvc.service;


import com.springmvc.entity.URole;
import com.springmvc.service.base.BaseService;

import java.util.Set;


public interface RoleService extends BaseService<URole,Integer>  {
 public Set<String>  queryRolesByName(String userName);

}
