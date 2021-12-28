package com.example.annotation.dao;

import com.example.annotation.pojo.TMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TMsgDao {

    @Select("select * from mydb.t_msg where id=#{id}")
    TMsg findMsgById(@Param("id") int id);

}
