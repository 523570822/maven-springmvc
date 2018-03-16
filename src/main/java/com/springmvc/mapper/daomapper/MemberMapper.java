package com.springmvc.mapper.daomapper;

import com.springmvc.entity.Member;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface MemberMapper extends Mapper<Member> {
}