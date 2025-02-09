package com.pipe.demo02.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private String address;
    private String[] subject;

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
}
