package com.springmvc.service.base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T,ID extends Serializable> {
    boolean removeByPrimaryKey(ID id);

    boolean add(T record);

    boolean addSelective(T record);

    T findByPrimaryKey(ID id);

    boolean saveByPrimaryKeySelective(T record);

    boolean saveByPrimaryKey(T record);

    List<T> findAll();

}
