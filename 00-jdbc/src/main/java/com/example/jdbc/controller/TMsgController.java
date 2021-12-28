package com.example.jdbc.controller;

import com.example.jdbc.dao.TMsgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class TMsgController {

    @Autowired
    private TMsgDao tMsgDao;

    @GetMapping("/getMsgs")
    public Object getMsgs() {
        return tMsgDao.getMsgs();
    }
}
