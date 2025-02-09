package com.pipe.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser()
    {
        System.out.println("UserDao 执行了...");
    }
}
