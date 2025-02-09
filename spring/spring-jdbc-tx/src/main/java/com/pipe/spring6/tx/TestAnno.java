package com.pipe.spring6.tx;

import com.pipe.spring6.tx.config.SpringConfig;
import com.pipe.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {
    @Test
    public void testfun() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController = context.getBean(BookController.class);
        bookController.addBook("Abel");
    }
}
