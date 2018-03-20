package com.springmvc.service;


import com.springmvc.entity.Ad;
import com.springmvc.entity.Role;
import com.springmvc.entity.User;
import com.springmvc.service.base.BaseService;


public interface UserService extends BaseService<User,Integer> {
 public Role queryRolesByName(String userName);

}
