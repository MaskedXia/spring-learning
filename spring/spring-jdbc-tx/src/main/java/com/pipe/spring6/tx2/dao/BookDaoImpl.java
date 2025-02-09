package com.pipe.spring6.tx2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getSalaryByName(String name) {
        String sql = "SELECT salary FROM employees WHERE last_name = ? ";
        Integer salary = jdbcTemplate.queryForObject(sql, Integer.class, name);
        return salary;
    }

    @Override
    public void updateSalary(String name, Integer salary) {
        String sql = "update employees set salary = salary + ? WHERE last_name = ? ";
        jdbcTemplate.update(sql, salary, name);
    }
}
