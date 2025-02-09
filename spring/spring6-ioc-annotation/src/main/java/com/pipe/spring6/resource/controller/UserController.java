package com.pipe.spring6.resource.controller;

import com.pipe.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

//    //根据名称注入
//    @Resource(name = "myUserService")
//    private UserService userService;

    //根据类型匹配
    //根据名称注入
    @Resource
    private UserService userService;


    public void addUser(){
        System.out.println("UserController 执行了...");
        userService.addservice();
    }
}
