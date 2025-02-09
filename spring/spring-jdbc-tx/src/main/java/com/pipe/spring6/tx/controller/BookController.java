package com.pipe.spring6.tx.controller;

import com.pipe.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void addBook(String name) {
        bookService.addBook(name);
    }
}
