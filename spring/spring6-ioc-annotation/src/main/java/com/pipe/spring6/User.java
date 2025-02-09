package com.pipe.spring6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
* @Component    泛化
* @Repository   Dao层
* @Service      Service层
* @Controller   Controller层
* */

@Component(value = "user") // value可以省略，默认小写user
public class User {
    @Value("${name}")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
