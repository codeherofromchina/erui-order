package com.erui.order.service.impl;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.mapper.UserMapper;
import com.erui.order.model.entity.User;
import com.erui.order.service.UserService;
import com.erui.order.service.util.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo findById(Long id) throws Exception {
        if (id == null) {
            throw new Exception("用户不存在");
        }
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null) {
            throw new Exception("用户不存在");
        }

        return UserFactory.userInfo(user);
    }
}
