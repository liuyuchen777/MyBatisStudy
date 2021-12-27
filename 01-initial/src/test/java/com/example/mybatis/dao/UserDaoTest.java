package com.example.mybatis.dao;

import com.example.mybatis.pojo.User;
import com.example.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserListTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        System.out.println(userList);

        sqlSession.close();
    }

    @Test
    public void getUserByIdTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(2);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUserTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int res = userDao.addUser(new User(4, "Jim", "123456"));
        if (res > 0) {
            System.out.println("Insert Successful!");
        }
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUserTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.updateUser(new User(3, "刘昱辰", "pwd"));
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUserTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.deleteUser(3);
        sqlSession.commit();

        sqlSession.close();
    }
}
