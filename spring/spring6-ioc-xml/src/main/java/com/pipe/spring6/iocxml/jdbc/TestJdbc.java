package com.pipe.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc() {
        DruidDataSource druid = new DruidDataSource();
        druid.setUrl("jdbc:mysql://localhost:13306/spring?serverTimezone=UTC");
        druid.setUsername("root");
        druid.setPassword("123456");
        druid.setDriverClassName("com.mysql.cj.jdbc.Driver");
        System.out.println(druid.getUrl());
    }

    @Test
    public void testJdbc2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource);
    }
}
