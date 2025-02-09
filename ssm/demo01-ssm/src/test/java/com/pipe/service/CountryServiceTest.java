package com.pipe.service;

import com.pipe.config.SpringConfig;
import com.pipe.domain.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// ctrl + w 选中当前词
// ctrl + h 查看引用


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class CountryServiceTest {


    @Autowired
    private CountryService countryService;

    @Test
    public void testFindAll() {
        List<Country> allCountry = countryService.getAllCountry();
        for (Country country : allCountry) {
            System.out.println(country);
        }
    }
}
