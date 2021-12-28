package com.example.codegenerator.controller;

import com.example.codegenerator.mbg.model.UmsAdmin;
import com.example.codegenerator.service.UmsAdminService;
import com.example.codegenerator.service.UmsAdminServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("/get")
    public UmsAdmin selectById(@Param("id") Long id) {

        return umsAdminService.select(id);
    }
}
