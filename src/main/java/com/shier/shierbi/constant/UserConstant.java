package com.shier.shierbi.constant;

/**
 * 用户常量
 */
public interface UserConstant {

    /**
     * 盐值，混淆密码
     */
    String SALT = "shier";

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 被封号
     */
    String BAN_ROLE = "ban";

    /**
     * 默认头像
     */
    String DEFAULT_AVATAR = "https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/56d6f5ad1d8747f484d6c2666b5a7961~tplv-k3u1fbpfcp-zoom-crop-mark:1512:1512:1512:851.awebp?";

}
