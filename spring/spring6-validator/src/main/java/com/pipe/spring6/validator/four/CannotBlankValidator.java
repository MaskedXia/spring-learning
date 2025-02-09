package com.pipe.spring6.validator.four;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CannotBlankValidator implements ConstraintValidator<ConnotBlank, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
