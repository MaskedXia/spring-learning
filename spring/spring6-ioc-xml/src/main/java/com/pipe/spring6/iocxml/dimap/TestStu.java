package com.pipe.spring6.iocxml.dimap;

import com.pipe.spring6.iocxml.ditest.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student2 student = context.getBean("student2", Student2.class);
        System.out.println(student);
    }
}
