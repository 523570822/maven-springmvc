package com.springmvc.service;


import com.springmvc.entity.Role;
import com.springmvc.entity.User;
import com.springmvc.service.base.BaseService;

import java.util.Set;


public interface RoleService extends BaseService<Role,Integer>  {
 public Set<String>  queryRolesByName(String userName);

}
