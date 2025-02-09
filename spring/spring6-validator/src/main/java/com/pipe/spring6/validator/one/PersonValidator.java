package com.pipe.spring6.validator.one;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public Errors validateObject(Object target) {
        return Validator.super.validateObject(target);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "name is null");

        Person p = (Person) target;
        if (p.getAge() < 0)
        {
            errors.rejectValue("age", "age.negative", "age is negative");
        }else if (p.getAge() > 200)
        {
            errors.rejectValue("age", "age.old", "age is too old");
        }

    }
}
