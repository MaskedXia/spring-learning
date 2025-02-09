package com.pipe.spring6.iocxml.ditest;

import java.util.List;

public class Dept {
    private String deptName;
    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info()
    {
        System.out.println("部门名称 " + deptName);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", empList=" + empList +
                '}';
    }
}
