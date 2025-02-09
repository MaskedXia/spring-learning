package com.pipe.spring6.validator.one;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestPerson {
    @Test
    public void demo1()
    {
        Person person = new Person();
        person.setAge(-1);
        person.setName("zhangsan");

        DataBinder binder = new DataBinder(person);

        binder.setValidator(new PersonValidator());

        binder.validate();

        BindingResult result = binder.getBindingResult();

        System.out.println(result.getAllErrors());

    }
}
