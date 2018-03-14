package com.springmvc.mapper.daomapper;

import com.springmvc.entity.Ad;
import com.springmvc.entity.AdExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AdMapper {
    @SelectProvider(type=AdSqlProvider.class, method="countByExample")
    long countByExample(AdExample example);

    @DeleteProvider(type=AdSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdExample example);

    @Insert({
        "insert into ad (id, create_date, ",
        "modify_date, version, ",
        "orders, begin_date, ",
        "end_date, path, ",
        "title, type, url, ",
        "ad_position_id, target_id, ",
        "param, content)",
        "values (#{id,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{modifyDate,jdbcType=TIMESTAMP}, #{version,jdbcType=BIGINT}, ",
        "#{orders,jdbcType=INTEGER}, #{beginDate,jdbcType=TIMESTAMP}, ",
        "#{endDate,jdbcType=TIMESTAMP}, #{path,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, #{url,jdbcType=VARCHAR}, ",
        "#{adPositionId,jdbcType=BIGINT}, #{targetId,jdbcType=BIGINT}, ",
        "#{param,jdbcType=VARCHAR}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Ad record);

    @InsertProvider(type=AdSqlProvider.class, method="insertSelective")
    int insertSelective(Ad record);

    @SelectProvider(type=AdSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="orders", property="orders", jdbcType=JdbcType.INTEGER),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_position_id", property="adPositionId", jdbcType=JdbcType.BIGINT),
        @Result(column="target_id", property="targetId", jdbcType=JdbcType.BIGINT),
        @Result(column="param", property="param", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Ad> selectByExampleWithBLOBs(AdExample example);

    @SelectProvider(type=AdSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="orders", property="orders", jdbcType=JdbcType.INTEGER),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_position_id", property="adPositionId", jdbcType=JdbcType.BIGINT),
        @Result(column="target_id", property="targetId", jdbcType=JdbcType.BIGINT),
        @Result(column="param", property="param", jdbcType=JdbcType.VARCHAR)
    })
    List<Ad> selectByExample(AdExample example);

    @UpdateProvider(type=AdSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    @UpdateProvider(type=AdSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Ad record, @Param("example") AdExample example);

    @UpdateProvider(type=AdSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);
}