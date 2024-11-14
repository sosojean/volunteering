package com.inha.volunteer;

import com.inha.volunteer.user.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = VolunteerApplication.class)
@SpringBootTest
class VolunteerApplicationTests {

    @Autowired
    private SiteUserRepository siteUserRepository;

    @Autowired
    private UserService userService;

    @Test
    void getUser() {
        SiteUser user = this.userService.getUser("testuser");
        assertEquals("testuser",user.getLoginId());
    }

    @Test
    void createUser() {
        UserCreateDto userCreateDto = new UserCreateDto();
//        userCreateDto.setLoginId("newtestuser");
//        userCreateDto.setNickname("newtestuser");
//        userCreateDto.setPassword1("newtestuser");


        this.userService.create(userCreateDto.getLoginId(), userCreateDto.getNickname(), userCreateDto.getPassword1());
        SiteUser user = this.userService.getUser("newtestuser");
        assertEquals("newtestuser",user.getLoginId());

    }

}
