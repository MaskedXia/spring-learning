package com.pipe.boot.controller;

import com.pipe.boot.bean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @Autowired
    Cat cat;

    @RequestMapping("/cat")
    public Cat handle02() {
        return cat;
    }


    //  http://localhost:8080/hello 可以直接访问 Hello, Spring Boot 2!
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!";
    }
}
