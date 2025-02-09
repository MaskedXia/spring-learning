package com.pipe.dao.Impl;

import com.pipe.anno.Bean;
import com.pipe.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl...");
    }
}
