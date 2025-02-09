package com.pipe.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  // 或者EnableConfigurationProperties
@ConfigurationProperties(prefix = "mycat")  // 配置文件application.properties
public class Cat {
    private String catName;
    private int catAge;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }
}
