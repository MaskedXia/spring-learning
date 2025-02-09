package com.pipe.demo05.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pipe.demo05.domain.Countries;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CountryDao extends BaseMapper<Countries> {


}
