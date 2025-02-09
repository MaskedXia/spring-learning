package com.pipe.spring6.autowired.controller;

import com.pipe.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("UserController 执行了...");
        userService.addservice();
    }
}
