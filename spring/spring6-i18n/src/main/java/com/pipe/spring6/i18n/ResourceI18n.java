package com.pipe.spring6.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objects = {"messages", new Date().toString()};
        String message = context.getMessage("www.pipe.com", objects, Locale.CHINA);
        System.out.println(message);

    }
}
