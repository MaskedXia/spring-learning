package com.pipe.spring6.iocxml.bean;

public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("running...");
    }
}
