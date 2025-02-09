package com.pipe.spring6.iocxml.ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    @Test
    public void testEmp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Dept dept = context.getBean("deptx", Dept.class);
        System.out.println(dept);
    }
}
