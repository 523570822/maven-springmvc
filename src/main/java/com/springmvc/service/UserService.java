package com.springmvc.service;
import com.springmvc.entity.UUser;
import com.springmvc.service.base.BaseService;


public interface UserService extends BaseService<UUser,Integer> {
  UUser queryUserByName(String userName);


}
