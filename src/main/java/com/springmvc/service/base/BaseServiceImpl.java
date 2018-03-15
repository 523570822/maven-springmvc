package com.springmvc.service.base;

import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import java.io.Serializable;
import java.util.List;

@Service
    public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

        public abstract BaseMapper<T> getMapper();

        @Override
        public boolean removeByPrimaryKey(ID id) {

            return getMapper().deleteByPrimaryKey(id) > 0;
        }

        @Override
        public boolean add(T record) {
            return getMapper().insert(record) > 0;
        }

        @Override
        public boolean addSelective(T record) {
            return getMapper().insertSelective(record) > 0;
        }

        @Override
        public T findByPrimaryKey(ID id) {
            return getMapper().selectByPrimaryKey(id);
        }

        @Override
        public boolean saveByPrimaryKeySelective(T record) {

            return getMapper().updateByPrimaryKeySelective(record) > 0;
        }

        @Override
        public boolean saveByPrimaryKey(T record) {
            return getMapper().updateByPrimaryKey(record) > 0;
        }

        @Override
        public List<T> findAll() {
            return getMapper().selectAll();
        }

    }

