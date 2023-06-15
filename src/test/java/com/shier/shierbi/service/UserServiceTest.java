package com.shier.shierbi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *

 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void userRegister() {
        String userAccount = "shier";
        String userPassword = "";
        String checkPassword = "123456";
        String userCode = "11";
        try {
            long result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
            Assertions.assertEquals(-1, result);
            userAccount = "yu";
            result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
            Assertions.assertEquals(-1, result);
        } catch (Exception e) {

        }
    }
}
