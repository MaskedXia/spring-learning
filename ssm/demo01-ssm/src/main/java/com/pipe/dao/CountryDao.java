package com.pipe.dao;

import com.pipe.domain.Country;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CountryDao {

    @Insert("insert into countries values(#{countryId}, #{countryName}, #{regionId})")
    public int save(Country country);

    @Update("update countries set country_name = #{countryName}, region_id = #{regionId} where country_id = #{countryId}")
    public int update(Country country);

    @Delete("delete from countries where country_id = #{countryId}")
    public int delete(String countryId);

    @Select("select country_id as countryId, country_name as countryName, region_id as regionId from countries where country_id = #{countryId}")
    public Country getCountryById(String countryId);

    @Select("select country_id as countryId, country_name as countryName, region_id as regionId from countries")
    public List<Country> getAllCountry();
}
