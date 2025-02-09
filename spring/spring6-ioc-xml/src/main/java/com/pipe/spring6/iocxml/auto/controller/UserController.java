package com.pipe.spring6.iocxml.auto.controller;

import com.pipe.spring6.iocxml.auto.service.UserService;

public class UserController {

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;


    public void addUser(){
        System.out.println("UserController 执行了...");
        userService.addservice();
    }
}
