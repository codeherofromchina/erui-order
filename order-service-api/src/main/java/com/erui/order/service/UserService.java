package com.erui.order.service;

import com.erui.order.common.pojo.UserInfo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:55
 */
public interface UserService {
    /**
     * 通过id查找用户信息
     * @param id
     * @return
     */
    UserInfo findById(Long id) throws Exception;

}
