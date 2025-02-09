package com.pipe.controller;

import com.pipe.domain.Country;
import com.pipe.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cn")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public boolean save(@RequestBody Country country){
        return countryService.save(country);
    }

    @PutMapping
    public boolean update(@RequestBody Country country){
        return countryService.update(country);
    }

    @DeleteMapping("/{countryId}")
    public boolean delete(@PathVariable String countryId){
        return countryService.delete(countryId);
    }

    @GetMapping("/{countryId}")
    public Country getCountryById(@PathVariable String countryId){
        return countryService.getCountryById(countryId);
    }

    @GetMapping
    public List<Country> getAllCountry(){
        return countryService.getAllCountry();
    }


}
