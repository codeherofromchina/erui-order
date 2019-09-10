package com.erui.order.service.util;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.model.entity.User;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午11:42
 */
public class UserFactory {
    /**
     * 转化为业务用户信息
     * @param user
     * @return
     */
    public static UserInfo userInfo(User user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(user.getId());
        userInfo.setUserNo(user.getUserNo());
        userInfo.setUserName(user.getUserName());
        return userInfo;
    }
}
