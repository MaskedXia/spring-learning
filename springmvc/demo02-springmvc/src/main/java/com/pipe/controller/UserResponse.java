package com.pipe.controller;

import com.pipe.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserResponse {

    // 响应
    @RequestMapping("/jumppage")
    public String jumppage(){
        System.out.println("页面跳转...");
        return "index.jsp";
    }

    //响应json对象
    @RequestMapping("/jumpPojo")
    @ResponseBody
    public UserDao jumpPojo(){
        System.out.println("jumpPojo...");
        UserDao userDao = new UserDao();
        userDao.setUsername("pipeline");
        userDao.setAge("100");
        return userDao;
    }
}
