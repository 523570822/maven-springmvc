package com.springmvc.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springmvc.common.core.PageResult;
import com.springmvc.entity.Role;
import com.springmvc.mapper.daomapper.RoleMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;


import javax.annotation.Resource;
import java.util.Set;


@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer>implements RoleService {
    @Resource
    private RoleMapper mapper;

    @Override
    public BaseMapper<Role> getMapper() {
        return mapper;
    }

    @Override
    public  Set<String> queryRolesByName(String userName) {



        Set<String>  roles = mapper.queryRolesByName(userName);

  //      List<User> dfasd = mapper.selectByExample(example);

        return roles;
    }

    @Override
    public PageResult<Role> getRoles(Integer pageNum, Integer pageSize, String searchKey, String searchValue, Integer isDelete){
        PageResult<Role> result = new PageResult<Role>();
        Example example = new Example(Role.class);
        example.setOrderByClause("create_time asc");
        Example.Criteria criteria = example.createCriteria();
        if(isDelete!=null){
            criteria.andEqualTo("is_delete",isDelete);

        }
        if(searchKey!=null){
            if(searchKey.equals("id")){
                criteria.andLike("id","%"+searchValue+"%");

            }else if(searchKey.equals("name")){
                criteria.andLike("name","%"+searchValue+"%");
            }else if(searchKey.equals("comments")){
                criteria.andLike("comments","%"+searchValue+"%");
            }
        }


        Page<Object> startPage = PageHelper.startPage(pageNum, pageSize);

        result.setData(mapper.selectByExample(example));
       result.setCount(startPage.getTotal());
        return result;
    }
}
