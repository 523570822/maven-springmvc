package com.springmvc.service;


import com.springmvc.common.core.PageResult;
import com.springmvc.entity.Permission;
import com.springmvc.entity.PermissionU;
import com.springmvc.service.base.BaseService;

import java.util.List;


public interface PermissionService extends BaseService<Permission,Integer>  {
/* public Set<String>  queryRolesByName(String userName);*/
 public PageResult<PermissionU> getPermissions(Integer page, Integer limit, String searchKey, String searchValue, Integer isDelete);

    public List<Permission> getParentPermissions(int type);

}
