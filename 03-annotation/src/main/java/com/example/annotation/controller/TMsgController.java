package com.example.annotation.controller;

import com.example.annotation.dao.TMsgDao;
import com.example.annotation.pojo.TMsg;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class TMsgController {
    @Autowired
    private TMsgDao tMsgDao;

    @GetMapping("/getMsg")
    public TMsg getMsgById(@Param("id") int id) {
        return tMsgDao.findMsgById(id);
    }
}
