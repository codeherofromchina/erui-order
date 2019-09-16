package com.erui.order.service.impl;

import com.erui.order.common.pojo.OrgInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.UserListQueryRequest;
import com.erui.order.mapper.UserMapper;
import com.erui.order.model.entity.User;
import com.erui.order.model.entity.UserExample;
import com.erui.order.service.OrgService;
import com.erui.order.service.UserService;
import com.erui.order.service.util.UserFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:57
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrgService orgService;

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

    @Override
    public String findNameById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user != null) {
            return user.getUserName();
        }

        return null;
    }


    @Override
    public Pager<UserInfo> list(UserListQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        UserExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo("N");
        // 用户编号
        if (StringUtils.isNotBlank(queryRequest.getUserNo())) {
            criteria.andUserNoLike("%" + queryRequest.getUserNo() + "%");
        }
        // 用户名称
        if (StringUtils.isNotBlank(queryRequest.getUserName())) {
            criteria.andUserNameLike("%" + queryRequest.getUserName() + "%");
        }
        List<User> users = userMapper.selectByExample(example);

        List<UserInfo> userListResponses = new ArrayList<>();
        for (User user : users) {
            UserInfo userInfo = UserFactory.userInfo(user);
            try {
                List<OrgInfo> orgInfos = orgService.findByUserId(userInfo.getId());
                if (orgInfos != null) {
                    List<String> orgNameList = orgInfos.stream().map(OrgInfo::getOrgName).collect(Collectors.toList());
                    userInfo.setGroupName(StringUtils.join(orgNameList.toArray(new String[orgNameList.size()])));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            userListResponses.add(userInfo);
        }

        // 输出
        Page<User> page = (Page) users;
        Pager<UserInfo> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), userListResponses);
        return pager;
    }
}
