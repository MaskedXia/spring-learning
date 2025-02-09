package com.pipe.spring6.iocxml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestUser {
//	Ctrl+W	选中整个单词
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");   //id获取
        System.out.println(user);

        User user2 = (User) context.getBean(User.class);  //类型获取，只能是单例
        System.out.println(user2);

        User user3 = context.getBean("user", User.class); //id和类型获取
        System.out.println(user3);
    }



}


