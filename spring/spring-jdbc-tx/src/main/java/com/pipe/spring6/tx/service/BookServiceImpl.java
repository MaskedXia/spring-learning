package com.pipe.spring6.tx.service;

import com.pipe.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.DEFAULT)
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;


    @Override
    public void addBook(String name) {
        Integer salary = bookDao.getSalaryByName(name);

        bookDao.updateSalary(name, salary / 100 + 100);
    }
}
