package com.pipe.controller;

import com.pipe.dao.UserDao;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("User saved");
        return "{'module': 'springmvc save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("User delete");
        return "{'module': 'springmvc delete'}";
    }

    @RequestMapping("/param")
    @ResponseBody
    public String param1(String name, int age){
        System.out.println("User param " + name + ": " + age);
        return "{'module': 'springmvc param1'}";
    }

    //测试别名
    @RequestMapping("/param2")
    @ResponseBody
    public String param2(@RequestParam("name") String UserName, int age){
        System.out.println("User param2 " + UserName + ": " + age);
        return "{'module': 'springmvc param2'}";
    }

    //只要能对应上成员
    @RequestMapping("/param3")
    @ResponseBody
    public String param3(UserDao user){
        System.out.println("User param3 " + user);
        return "{'module': 'springmvc param3'}";
    }

    //接收json
    @RequestMapping("/param4")
    @ResponseBody
    public String param4(@RequestBody List<String> likes){
        System.out.println("User param4 " + likes);
        return "{'module': 'springmvc param4'}";
    }

    @RequestMapping("/param5")
    @ResponseBody
    public String param5(@RequestBody UserDao user){
        System.out.println("User param5 " + user);
        return "{'module': 'springmvc param5'}";
    }

    // 日期 string 默认 2088/08/08
    // 2088-08-08 DateTimeFormat
    @RequestMapping("/param6")
    @ResponseBody
    public String param6(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2){
        System.out.println("User param6 " + date);
        System.out.println("User param6 " + date2);
        return "{'module': 'springmvc param6'}";
    }


}
