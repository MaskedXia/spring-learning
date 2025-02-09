package com.pipe.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("11 addUser");
    }
}
