package com.pipe.demo03;

import com.pipe.demo03.dao.CountryDao;
import com.pipe.demo03.domain.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo03ApplicationTests {

    @Autowired
    private CountryDao countryDao;

    @Test
    void getCountryById() {
        Country cn = countryDao.getCountryById("WR");
        System.out.println(cn);
    }

}
