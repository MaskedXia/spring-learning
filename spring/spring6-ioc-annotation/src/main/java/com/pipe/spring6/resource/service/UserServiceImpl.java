package com.pipe.spring6.resource.service;


import com.pipe.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {

    //不指定名称，根据属性名称注入
    @Resource
    private UserDao myUserDao;


    public void addservice()
    {
        System.out.println("UserService 执行了...");
        myUserDao.addUser();
    }
}
