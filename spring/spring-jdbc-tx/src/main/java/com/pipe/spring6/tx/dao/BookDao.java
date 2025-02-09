package com.pipe.spring6.tx.dao;

public interface BookDao {
    Integer getSalaryByName(String name);

    void updateSalary(String name, Integer salary);
}
