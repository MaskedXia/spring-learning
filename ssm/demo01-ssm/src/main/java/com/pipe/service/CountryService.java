package com.pipe.service;

import com.pipe.controller.Code;
import com.pipe.dao.CountryDao;
import com.pipe.domain.Country;
import com.pipe.exception.BusinessException;
import com.pipe.exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public boolean save(Country country){
        return countryDao.save(country) > 0;
    }

    public boolean update(Country country){
        return countryDao.update(country) > 0;
    }

    public boolean delete(String countryId){
        return countryDao.delete(countryId) > 0;
    }

    public Country getCountryById(String countryId){
//        if(countryId.endsWith(",")){
//            throw new BusinessException(Code.BUSINESS_ERR, "end with , is incorrect");
//        }
//
//        try{
//            int i = 1/0;
//        }catch (ArithmeticException e){
//            throw new SystemException(Code.SYSTEM_ERR, "connect to system out of time, pls try later");
//        }

        return countryDao.getCountryById(countryId);
    }

    public List<Country> getAllCountry(){
        return countryDao.getAllCountry();
    }
}
