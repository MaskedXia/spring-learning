package com.pipe.spring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.pipe.spring6")
@PropertySource("jdbc.properties")
public class SpringConfig {

}
