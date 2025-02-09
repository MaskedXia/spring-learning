package com.pipe.mybatis;


import com.pipe.mybatis.mapper.UserMapper;
import com.pipe.mybatis.pojo.Country;
import com.pipe.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void testfun() throws IOException {

        //加载文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取session对象
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            //List<User> users = session.selectList("test.selectall");
//            // Mapper代理更好
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            List<User> users = mapper.selectall();
//            for (User user : users) {
//                System.out.println(user);
//            }
//        }

        // selectById
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            User user = mapper.selectById(100);
//            System.out.println(user);
//        }

        //selectByCondition 1 散装参数 2 对象 3 map
        // 动态sql
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            List<User> users = mapper.selectByCondition(100, "");
//            for (User user : users) {
//                System.out.println(user);
//            }
//        }

        // 动态单条件
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            List<User> users = mapper.selectByConditionSingle(null, "Steven");
//            for (User user : users) {
//                System.out.println(user);
//            }
//        }

        // insert
//        try (SqlSession session = sqlSessionFactory.openSession(true)) {
//
//            String countryId = "WQ";
//            String countryName = "MyWorld";
//            String regionId = "1";
//            Country country = new Country(countryId, countryName, regionId);
//
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            mapper.add(country);
//            // session.commit(); //autocommit=false 需要提交
//        }

        // update
//        try (SqlSession session = sqlSessionFactory.openSession(true)) {
//
//            String countryId = "WQ";
//            String countryName = null;
//            String regionId = null;
//            Country country = new Country(countryId, countryName, regionId);
//
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            int row = mapper.update(country);
//            System.out.println(row);
//        }

        // delete
//        try (SqlSession session = sqlSessionFactory.openSession(true)) {
//
//            String countryId = "WQ";
//
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            mapper.deleteByCountryId(countryId);
//        }


        // deleteByCountryIds
        try (SqlSession session = sqlSessionFactory.openSession(true)) {

            String[] countryId = {"WQ1", "WQ2", "WQ3", "WQ4"};

            UserMapper mapper = session.getMapper(UserMapper.class);
            mapper.deleteByCountryIds(countryId);
        }
    }
}
