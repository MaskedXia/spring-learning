package com.pipe.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("RedisDaoImpl addUser");
    }
}
