package com.pipe.spring6.prefix;

import com.pipe.spring6.di.Resourcebean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Resource resource = context.getResource("test.txt");
        System.out.println(resource.getDescription());
    }
}
