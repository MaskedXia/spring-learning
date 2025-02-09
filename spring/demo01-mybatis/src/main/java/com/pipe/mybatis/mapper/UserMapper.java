package com.pipe.mybatis.mapper;

import com.pipe.mybatis.pojo.Country;
import com.pipe.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> selectall();
    User selectById(Integer id);
    List<User> selectByCondition(@Param("id") Integer id, @Param("firstName") String firstName);
    List<User> selectByConditionSingle(@Param("id") Integer id, @Param("firstName") String firstName);

    void add(Country country);

    int update(Country country);

    void deleteByCountryId(@Param("countryId") String countryId);

    void deleteByCountryIds(@Param("countryIds") String[] countryIds);

    //基于注解
    @Select("select first_name, salary from employees where employee_id = #{id};")
    User selectById2(Integer id);

}
