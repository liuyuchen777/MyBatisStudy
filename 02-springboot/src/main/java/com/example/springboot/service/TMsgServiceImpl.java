package com.example.springboot.service;

import com.example.springboot.dao.TMsgMapper;
import com.example.springboot.pojo.TMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TMsgServiceImpl implements TMsgService{

    @Autowired
    private TMsgMapper tMsgMapper;

    @Override
    public TMsg findById(Integer id) {
        return tMsgMapper.findById(id);
    }
}
