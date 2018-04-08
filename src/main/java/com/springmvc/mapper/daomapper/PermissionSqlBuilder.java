package com.springmvc.mapper.daomapper;


import org.apache.ibatis.jdbc.SQL;
import tk.mybatis.mapper.entity.Example;

import tk.mybatis.mapper.entity.Example.Criteria;
import java.util.List;


public class PermissionSqlBuilder {

    public  String getPermissions(String searchKey, String searchValue, Integer isDelete){


        SQL sql = new SQL();
        sql.SELECT("a.*,b.name parentName ").FROM("permission a ");
        sql.JOIN("permission b  ON a.parent_id=b.id  ");
        sql.WHERE("a.id <> '0'");
        if(isDelete!=null){

            sql.WHERE("a.is_delete=#{isDelete}");

        }
        if(searchKey!=null){
            if(searchKey.equals("id")){
          sql.WHERE("a.id like #{searchValue}" );
              //  criteria.andLike("id","%"+searchValue+"%");

            }else if(searchKey.equals("name")){
                sql.WHERE("a.name like #{searchValue}" );
              //  criteria.andLike("name","%"+searchValue+"%");
            }else if(searchKey.equals("comments")){
                sql.WHERE("a.comments like #{searchValue}" );
           //     criteria.andLike("comments","%"+searchValue+"%");
            }
        }

        return sql.toString();




    }


}
