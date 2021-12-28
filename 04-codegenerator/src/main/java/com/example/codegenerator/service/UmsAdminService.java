package com.example.codegenerator.service;

import com.example.codegenerator.mbg.model.UmsAdmin;

public interface UmsAdminService {
    void create(UmsAdmin entity);

    void update(UmsAdmin entity);

    void delete(Long id);

    UmsAdmin select(Long id);
}
