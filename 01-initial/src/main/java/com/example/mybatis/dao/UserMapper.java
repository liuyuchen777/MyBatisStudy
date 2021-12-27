package com.example.mybatis.dao;

import com.example.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    // get all users
    List<User> getUserList();

    // check user by id
    User getUserById(int id);

    // create new user
    int addUser(User user);

    // update
    void updateUser(User user);

    // delete user
    void deleteUser(int id);
}
