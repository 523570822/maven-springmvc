package com.springmvc.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springmvc.common.core.PageResult;
import com.springmvc.entity.Permission;
import com.springmvc.entity.PermissionU;
import com.springmvc.entity.Role;
import com.springmvc.mapper.daomapper.PermissionMapper;
import com.springmvc.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission, Integer>implements PermissionService {
    @Resource
    private PermissionMapper mapper;

    @Override
    public BaseMapper<Permission> getMapper() {
        return mapper;
    }

 /*   @Override
    public  Set<String> queryRolesByName(String userName) {



        Set<String>  roles = mapper.queryRolesByName(userName);

  //      List<User> dfasd = mapper.selectByExample(example);

        return roles;
    }*/

    @Override
    public PageResult<PermissionU> getPermissions(Integer pageNum, Integer pageSize, String searchKey, String searchValue, Integer isDelete){
        PageResult<PermissionU> result = new PageResult<PermissionU>();
        Example example = new Example(Permission.class);
        example.setOrderByClause("create_time asc");
        Criteria criteria = example.createCriteria();
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
        criteria.andNotEqualTo("id",'0');
       List<PermissionU> role = mapper.getPermissions( searchKey,  searchValue,  isDelete);
        Page<Object> startPage = PageHelper.startPage(pageNum, pageSize);

        result.setData(mapper.getPermissions( searchKey,  searchValue,  isDelete));
       result.setCount(startPage.getTotal());
        return result;
    }

    @Override
    public List<Permission> getParentPermissions(int type) {

        List<Permission> permission =new ArrayList<Permission>();
        Example example = new Example(Permission.class);
       if(type==0){

           // example.setOrderByClause("orderNumber asc");
           Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("parentId",'0');
            criteria.andEqualTo("type",0);
       //    criteria.andNotEqualTo("id","0");


        }else{

            example.setOrderByClause("order_number asc");
            Example.Criteria criteria = example.createCriteria();
            criteria.andNotEqualTo("parentId",'0');
            criteria.andEqualTo("type",0);
            Example.Criteria criteria1 = example.createCriteria();
            criteria1.andEqualTo("parentId",'0');
            criteria1.andEqualTo("type",1);
            example.or(criteria1);
             //criteria.


        }
      permission = mapper.selectByExample(example);

        return permission;

    }

    @Override
    public List<PermissionU> getMenusByUser(Long  userId) {
        List<PermissionU> results = new ArrayList<PermissionU>();
       List<PermissionU> permissions =  mapper.selectPermissionByUserId(userId);
        for(PermissionU one1 : permissions) {
            if("0".equals(one1.getParentId())){
                List<PermissionU> subMenu = new ArrayList<PermissionU>();
                for(PermissionU one2 : permissions) {
                    if(one1.getId().equals(one2.getParentId())) {
                        subMenu.add(one2);
                    }
                }
                one1.setSubMenus(subMenu);
                results.add(one1);
            }
        }

        return results;
    }
}
