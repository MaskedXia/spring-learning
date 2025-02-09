package com.pipe.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan("com.pipe.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement  // 事务
public class SpringConfig {
}
