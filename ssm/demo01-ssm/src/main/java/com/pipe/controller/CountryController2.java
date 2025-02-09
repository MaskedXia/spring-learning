package com.pipe.controller;

import com.pipe.domain.Country;
import com.pipe.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 和前端约定返回类型
@RestController
@RequestMapping("/cn2")
public class CountryController2 {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Result save(@RequestBody Country country){
        boolean flag = countryService.save(country);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Country country){
        boolean flag = countryService.update(country);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{countryId}")
    public Result delete(@PathVariable String countryId){
        boolean flag = countryService.delete(countryId);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{countryId}")
    public Result getCountryById(@PathVariable String countryId){
        Country country = countryService.getCountryById(countryId);
        Integer code = country != null ? Code.GET_OK : Code.GET_ERR;
        String msg = country != null ? "" : "Not found";
        return new Result(code, country, msg);
    }

    @GetMapping
    public Result getAllCountry(){
        List<Country> allCountry = countryService.getAllCountry();
        Integer code = allCountry != null ? Code.GET_OK : Code.GET_ERR;
        String msg = allCountry != null ? "" : "Not found all";
        return new Result(code, allCountry, msg);    }


}
