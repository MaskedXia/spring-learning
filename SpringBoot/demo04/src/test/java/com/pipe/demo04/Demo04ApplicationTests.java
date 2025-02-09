package com.pipe.demo04;

import com.pipe.demo04.domain.Country;
import com.pipe.demo04.service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo04ApplicationTests {

    @Autowired
    private CountryService countryService;

    @Test
    void contextLoads() {
        List<Country> allCountry = countryService.getAllCountry();
        for (Country country : allCountry) {
            System.out.println(country);
        }
        System.out.println();
    }

}
