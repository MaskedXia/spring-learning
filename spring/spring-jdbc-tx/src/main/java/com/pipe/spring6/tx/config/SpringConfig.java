package com.pipe.spring6.tx.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
@ComponentScan("com.pipe.spring6.tx")
@EnableTransactionManagement
public class SpringConfig {

    @Bean
    public DataSource getDataSource() {
        DruidDataSource druid = new DruidDataSource();
        druid.setUrl("jdbc:mysql://localhost:13306/atguigudb?serverTimezone=UTC");
        druid.setUsername("root");
        druid.setPassword("123456");
        druid.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return druid;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }



}
