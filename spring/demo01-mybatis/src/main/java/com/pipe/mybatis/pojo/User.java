package com.pipe.mybatis.pojo;

import java.security.PrivateKey;

public class User {

    private String username;
    private Integer salary;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
