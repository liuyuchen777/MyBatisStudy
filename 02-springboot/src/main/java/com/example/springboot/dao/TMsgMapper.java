package com.example.springboot.dao;

import com.example.springboot.pojo.TMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TMsgMapper {
    public TMsg findById(Integer id);
}
