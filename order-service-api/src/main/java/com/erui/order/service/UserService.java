package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.UserListQueryRequest;

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

    /**
     * 通过用户id查找用户名称，如果为空则返回null
     * @param id
     * @return
     */
    String findNameById(Long id);

    /**
     * 查询用户列表
     * @param queryRequest
     * @return
     */
    Pager<UserInfo> list(UserListQueryRequest queryRequest);
}
