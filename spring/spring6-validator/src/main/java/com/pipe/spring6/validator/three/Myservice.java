package com.pipe.spring6.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class Myservice {
    public String testMethod(@NotNull @Valid User user){
        return user.toString();
    }
}
