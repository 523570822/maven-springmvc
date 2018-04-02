package com.springmvc.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springmvc.common.core.PageResult;
import com.springmvc.entity.URole;
import com.springmvc.mapper.daomapper.URoleMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;


import javax.annotation.Resource;
import java.util.List;
import java.util.Set;


@Service
public class RoleServiceImpl extends BaseServiceImpl<URole, Integer>implements RoleService {
    @Resource
    private URoleMapper mapper;

    @Override
    public BaseMapper<URole> getMapper() {
        return mapper;
    }

    @Override
    public  Set<String> queryRolesByName(String userName) {



        Set<String>  roles = mapper.queryRolesByName(userName);

  //      List<User> dfasd = mapper.selectByExample(example);

        return roles;
    }

    @Override
    public PageResult<URole> getRoles(Integer pageNum, Integer pageSize, String searchKey, String searchValue, Integer isDelete){
        PageResult<URole> result = new PageResult<URole>();
        Example example = new Example(URole.class);
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

        List<URole> role = mapper.selectByExample(example);
        Page<Object> startPage = PageHelper.startPage(pageNum, pageSize);

        result.setData(mapper.selectByExample(example));
       result.setCount(startPage.getTotal());
        return result;
    }
}
