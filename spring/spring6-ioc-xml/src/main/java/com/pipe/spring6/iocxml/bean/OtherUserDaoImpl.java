package com.pipe.spring6.iocxml.bean;

public class OtherUserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("OtherUSerDaoImpl running");
    }
}
