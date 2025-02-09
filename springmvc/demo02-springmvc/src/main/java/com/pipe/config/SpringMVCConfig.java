package com.pipe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.pipe.controller")
@EnableWebMvc
public class SpringMVCConfig {
}
