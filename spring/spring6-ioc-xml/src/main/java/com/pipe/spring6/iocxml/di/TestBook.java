package com.pipe.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    // set注入
    @Test
    public void testBook() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    // 构造注入
    @Test
    public void testBook2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCon", Book.class);
        System.out.println(book);
    }
}
