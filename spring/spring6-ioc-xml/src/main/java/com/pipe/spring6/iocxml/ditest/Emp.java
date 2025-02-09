package com.pipe.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    private String ename;
    private Integer age;
    private Dept dept;

    public String[] getChildren() {
        return children;
    }

    public void setChildren(String[] children) {
        this.children = children;
    }

    private String[] children;


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void work()
    {
        System.out.println(ename + " emp work... " + age);
        dept.info();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
