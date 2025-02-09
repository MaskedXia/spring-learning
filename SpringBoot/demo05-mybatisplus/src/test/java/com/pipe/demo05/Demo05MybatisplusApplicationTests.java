package com.pipe.demo05;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pipe.demo05.dao.CountryDao;
import com.pipe.demo05.domain.Countries;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo05MybatisplusApplicationTests {

    @Autowired
    private CountryDao countryDao;

    @Test
    void contextLoads() {
        List<Countries> countries = countryDao.selectList(null);
        for (Countries country : countries) {
            System.out.println(country);
        }
    }

    @Test
    void testSave() {
        Countries country = new Countries();
        country.setCountryId("WQ");
        country.setCountryName("RBG");
        country.setRegionId("1");
        countryDao.insert(country);
    }

    @Test
    void testUpdate() {
        Countries country = new Countries();
        country.setCountryId("WQ");
        country.setRegionId("2");
        countryDao.updateById(country);
    }

    @Test
    void testDelete() {
        countryDao.deleteById("WQ");
    }

    // 分页，需要config
    @Test
    void testByPage(){
        IPage page = new Page(1, 2);
        countryDao.selectPage(page, null);
        System.out.println("Page " + page.getCurrent());
    }

    //条件查询
    @Test
    void testByWrapper(){
        QueryWrapper<Countries> queryWraper = new QueryWrapper<>();
        //queryWraper.eq("country_id", "WQ");
        queryWraper.lambda().eq(Countries::getCountryId, "WQ");
        List list = countryDao.selectList(queryWraper);
        System.out.println(list);
    }
}
