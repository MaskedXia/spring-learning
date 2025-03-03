package com.pipe.spring6.validator.three;

import jakarta.validation.constraints.*;

public class User {

    @NotNull
    private String name;

    @Min(0)
    @Max(100)
    private int age;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号不符合规则")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
