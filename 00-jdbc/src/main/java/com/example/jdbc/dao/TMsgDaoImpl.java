package com.example.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TMsgDaoImpl implements TMsgDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object getMsgs() {
        List<Map<String, Object>> list =jdbcTemplate.queryForList("select * from mydb.t_msg");
        return list;
    }
}
