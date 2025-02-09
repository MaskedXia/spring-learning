package com.pipe;

import com.pipe.config.SpringConfig;
import com.pipe.controller.CountryController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context.getBean(CountryController.class));
    }
}
