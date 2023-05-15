package com.shier.shierbi.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新个人信息请求
 *
 */
@Data
public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密碼
     */
    private String userPassword;

    private static final long serialVersionUID = 1L;
}