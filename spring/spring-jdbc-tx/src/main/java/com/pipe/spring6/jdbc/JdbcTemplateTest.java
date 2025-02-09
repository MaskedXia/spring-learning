package com.pipe.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        String sql = "INSERT INTO `order` VALUES(?,?)";
        int rows = jdbcTemplate.update(sql, 10, "pipe");
        System.out.println(rows);
    }

    @Test
    public void testUpdate2() {
        String sql = "UPDATE `order` SET order_name = ? where order_id = ?";
        int rows = jdbcTemplate.update(sql, "pipe2", 10);
        System.out.println(rows);
    }

    @Test
    public void testUpdate3() {
        String sql = "DELETE FROM `order` where order_id = ?";
        int rows = jdbcTemplate.update(sql, 10);
        System.out.println(rows);
    }

    @Test
    public void testQuery() {
        String sql = "SELECT * FROM `order` where order_id = ?";
        Emp emp1 = jdbcTemplate.queryForObject(sql,
                (rs, rownum) -> {
                    Emp emp = new Emp();
                    emp.setOrder_id(rs.getInt("order_id"));
                    emp.setOrder_name(rs.getString("order_name"));
                    return emp;
                }, 10);
        System.out.println(emp1);
    }

    @Test
    public void testQuery2() {
        String sql = "SELECT * FROM `order` where order_id = ?";
        Emp emp1 = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class), 10);
        System.out.println(emp1);
    }

    @Test
    public void testQuery3() {
        String sql = "SELECT * FROM `order`";
        List<Emp> query = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(query);
    }

    @Test
    public void testQuery4() {
        String sql = "SELECT COUNT(*) FROM `order`";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
}
