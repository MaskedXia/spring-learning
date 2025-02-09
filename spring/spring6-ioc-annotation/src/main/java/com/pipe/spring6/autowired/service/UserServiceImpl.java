package com.pipe.spring6.autowired.service;


import com.pipe.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //根据名称注入注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;


    public void addservice()
    {
        System.out.println("UserService 执行了...");
        userDao.addUser();
    }
}
