package com.pipe.spring6.tx2.dao;

public interface BookDao {
    Integer getSalaryByName(String name);

    void updateSalary(String name, Integer salary);
}
