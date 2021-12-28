package com.example.springboot.controller;

import com.example.springboot.pojo.TMsg;
import com.example.springboot.service.TMsgService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class TMsgController {

    @Autowired
    private TMsgService tMsgService;

    @GetMapping("/getMsg")
    public String getMsg(@Param("id") Integer id) {
        TMsg tMsg = tMsgService.findById(id);
        return tMsg.getMessage();
    }
}
