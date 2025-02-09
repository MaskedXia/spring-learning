package com.pipe.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void addUser()
    {
        System.out.println("UserDao 执行了...");
    }
}
