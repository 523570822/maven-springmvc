package com.springmvc.service;
import com.springmvc.entity.User;
import com.springmvc.service.base.BaseService;


public interface UserService extends BaseService<User,Integer> {
  User queryUserByName(String userName);


}
