package com.pipe.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao) context.getBean("UserDaoImpl");
        System.out.println(userDao);
        userDao.run();
    }
}
