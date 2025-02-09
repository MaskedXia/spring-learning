package com.pipe;

import com.pipe.bean.AnnoApplicationContext;
import com.pipe.service.UserService;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    public void testUser() {
        AnnoApplicationContext context = new AnnoApplicationContext("com.pipe");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.add();
    }
}
