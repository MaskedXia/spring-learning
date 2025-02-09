package com.pipe.service.Impl;

import com.pipe.anno.Bean;
import com.pipe.anno.Di;
import com.pipe.dao.UserDao;
import com.pipe.service.UserService;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("UserServiceImpl...");
        userDao.add();
    }
}
