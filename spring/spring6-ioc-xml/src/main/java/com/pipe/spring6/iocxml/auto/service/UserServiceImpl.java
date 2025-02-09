package com.pipe.spring6.iocxml.auto.service;

import com.pipe.spring6.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService{
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;


    public void addservice()
    {
        System.out.println("UserService 执行了...");
        userDao.addUser();
    }
}
