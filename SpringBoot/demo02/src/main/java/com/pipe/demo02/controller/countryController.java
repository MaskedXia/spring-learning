package com.pipe.demo02.controller;

import com.pipe.demo02.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cn3")
public class countryController {

    @Value("${lesson}")
    private String lesson;

    // 读取配置文件
    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{countryId}")
    public String getCountryById(@PathVariable String countryId){
        System.out.println("id is " + countryId);
        System.out.println("------------");
        System.out.println(environment.getProperty("enterprise.subject[0]"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println("------------");
        System.out.println(enterprise);

        return "countryId is " + countryId;
    }

}
