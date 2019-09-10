package com.erui.order.common.util;

import com.erui.order.common.pojo.UserInfo;

/**
 * 存放线程作用域变量
 */
public class ThreadLocalUtil {
    private static ThreadLocal<String> tokenThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<UserInfo> userInfoThreadLocal = new ThreadLocal<>();

    public static void setToken(String token) {
        tokenThreadLocal.set(token);
    }

    public static String getToken() {
        return tokenThreadLocal.get();
    }


    public static void setUserInfo(UserInfo userInfo) {
        userInfoThreadLocal.set(userInfo);
    }

    public static UserInfo getUserInfo() {
        return userInfoThreadLocal.get();
    }
}
