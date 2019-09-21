package com.erui.order.service.impl;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.OrderAccountQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderAccountMapper;
import com.erui.order.model.entity.OrderAccount;
import com.erui.order.model.entity.OrderAccountExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.OrderAccountService;
import com.erui.order.service.util.OrderAccountFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderAccountServiceImpl implements OrderAccountService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderAccountServiceImpl.class);
    @Autowired
    private OrderAccountMapper orderAccountMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(OrderAccountSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        OrderAccount orderAccount = OrderAccountFactory.orderAccount(insertRequest);
        orderAccount.setCreateTime(new Date());
        orderAccount.setCreateUserId(userInfo.getId());
        orderAccount.setDeleteFlag(Boolean.FALSE);
        int insertNum = orderAccountMapper.insert(orderAccount);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        return orderAccount.getId();
    }

    @Override
    public void update(Long id, OrderAccountSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        OrderAccount orderAccount = orderAccountMapper.selectByPrimaryKey(id);
        if (orderAccount == null) {
            throw new Exception("对象唯一标识错误");
        }

        Long orderAccountId = orderAccount.getId();
        // 修改基本信息
        OrderAccount orderAccountSelective = OrderAccountFactory.orderAccount(updateRequest);
        orderAccountSelective.setId(orderAccountId);
        orderAccountSelective.setAccountType(null);
        orderAccountSelective.setUpdateTime(new Date());
        orderAccountSelective.setUpdateUserId(userInfo.getId());

        orderAccountMapper.updateByPrimaryKeySelective(orderAccountSelective);
    }

    @Override
    public List<OrderAccountDetailResponse> list(OrderAccountQueryRequest queryRequest) {

        OrderAccountExample example = new OrderAccountExample();
        example.setOrderByClause("id asc");
        OrderAccountExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (queryRequest.getOrderId() != null) {
            criteria.andOrderIdEqualTo(queryRequest.getOrderId());
        }

        if (queryRequest.getAccountType() != null) {
            criteria.andAccountTypeEqualTo(queryRequest.getAccountType());
        }

        List<OrderAccount> orderAccounts = orderAccountMapper.selectByExample(example);

        List<OrderAccountDetailResponse> orderAccountListResponses = new ArrayList<>();
        for (OrderAccount orderAccount : orderAccounts) {
            OrderAccountDetailResponse orderAccountListResponse = OrderAccountFactory.orderAccountDetailResponse(orderAccount);
            orderAccountListResponses.add(orderAccountListResponse);
        }
        return orderAccountListResponses;
    }

    @Override
    public OrderAccountDetailResponse detail(Long id) throws Exception {
        // 准备数据
        OrderAccount orderAccount = orderAccountMapper.selectByPrimaryKey(id);
        if (orderAccount == null) {
            throw new Exception("对象信息不存在");
        }
        // 组织数据
        OrderAccountDetailResponse detail = OrderAccountFactory.orderAccountDetailResponse(orderAccount);

        return detail;
    }


    @Override
    public void delete(Long id) throws Exception {
        // 准备数据
        OrderAccount orderAccount = orderAccountMapper.selectByPrimaryKey(id);
        if (orderAccount == null) {
            throw new Exception("对象信息不存在");
        }
        // 组织数据
        OrderAccount orderAccountSelective = new OrderAccount();
        orderAccountSelective.setId(id);
        orderAccountSelective.setDeleteFlag(Boolean.TRUE);
        orderAccountSelective.setDeleteTime(new Date());

        orderAccountMapper.updateByPrimaryKeySelective(orderAccountSelective);
    }

}

