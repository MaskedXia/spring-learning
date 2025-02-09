package com.pipe.spring6.aop.annoaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pipe.spring6.aop.annoaop")  // 扫描指定包下面的类，并将其注册为 Spring Bean
@EnableAspectJAutoProxy
public class SpringConfig {
}
