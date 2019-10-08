package com.erui.order.service.impl;

import com.erui.order.common.enums.OrderAccountTypeEnum;
import com.erui.order.common.enums.OrderPayStatusEnum;
import com.erui.order.common.enums.OrderStatusEnum;
import com.erui.order.common.pojo.OrderAccountInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.OrderAccountQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderAccountMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.OrderAccount;
import com.erui.order.model.entity.OrderAccountExample;
import com.erui.order.model.entity.OrderExample;
import com.erui.order.service.OrderAccountService;
import com.erui.order.service.UserService;
import com.erui.order.service.util.OrderAccountFactory;
import com.erui.order.service.util.OrderFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
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
    private OrderMapper orderMapper;
    @Autowired
    private UserService userService;

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
        orderAccountSelective.setUpdateTime(new Date());
        orderAccountSelective.setUpdateUserId(userInfo.getId());

        orderAccountMapper.updateByPrimaryKeySelective(orderAccountSelective);
    }

    @Override
    public Pager<OrderAccountListResponse> list(OrderAccountQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());
        // 查询开始执行的订单
        OrderExample orderExample = new OrderExample();
        orderExample.setOrderByClause("id desc");
        OrderExample.Criteria criteria = orderExample.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE);
        // 销售合同号
        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }
        // 订单状态
        OrderStatusEnum orderStatusEnum = OrderStatusEnum.valueOf(queryRequest.getOrderStatus());
        if (orderStatusEnum != null && orderStatusEnum.getCode() > OrderStatusEnum.UNEXECUTED.getCode()) {
            criteria.andOrderStatusEqualTo(orderStatusEnum.getCode());
        } else {
            criteria.andOrderStatusGreaterThan(OrderStatusEnum.UNEXECUTED.getCode());
        }
        // 收款状态
        OrderPayStatusEnum orderPayStatusEnum = OrderPayStatusEnum.valueOf(queryRequest.getPayStatus());
        if (orderPayStatusEnum != null) {
            criteria.andPayStatusEqualTo(orderPayStatusEnum.getCode());
        }
        // crm客户
        if (queryRequest.getBuyerId() != null) {
            criteria.andBuyerIdEqualTo(queryRequest.getBuyerId());
        }

        List<Order> orders = orderMapper.selectByExample(orderExample);
        List<OrderAccountListResponse> orderAccountListResponses = new ArrayList<>();
        for (Order order : orders) {
            OrderAccountListResponse orderListResponse = OrderFactory.orderAccountListResponse(order);
            orderAccountListResponses.add(orderListResponse);
        }

        // 输出
        Page<Order> page = (Page) orders;
        Pager<OrderAccountListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize(),
                page.getPages(), page.getTotal(), orderAccountListResponses);
        return pager;
    }

    @Override
    public OrderAccountDetailResponse detail(Long orderId) throws Exception {
        // 准备数据
        Order order = orderMapper.selectByPrimaryKey(orderId);
        // 查询发货信息
        OrderAccountExample example = new OrderAccountExample();
        example.createCriteria()
                .andDeleteFlagEqualTo(Boolean.FALSE)
                .andOrderIdEqualTo(orderId)
                .andAccountTypeEqualTo(OrderAccountTypeEnum.SEND.getValue());
        List<OrderAccount> sendOrderAccounts = orderAccountMapper.selectByExample(example);
        List<OrderAccountInfo> sendList = OrderAccountFactory.orderAccountInfo(sendOrderAccounts);
        // 查询收款信息
        example.clear();
        example.createCriteria()
                .andDeleteFlagEqualTo(Boolean.FALSE)
                .andOrderIdEqualTo(orderId)
                .andAccountTypeEqualTo(OrderAccountTypeEnum.RECEIVE.getValue());
        List<OrderAccount> receiveOrderAccounts = orderAccountMapper.selectByExample(example);
        List<OrderAccountInfo> receiveList = OrderAccountFactory.orderAccountInfo(receiveOrderAccounts);
        // 组装数据
        OrderAccountDetailResponse detail = OrderFactory.orderAccountDetailResponse(order);
        detail.setAgentUserName(userService.findNameById(detail.getAgentUserId()));
        detail.setSendInfos(sendList);
        detail.setReceiveInfos(receiveList);

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

    @Override
    public void done(Long orderId) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            throw new Exception("订单不存在");
        }

        Order orderSelective = new Order();
        orderSelective.setId(orderId);
        orderSelective.setPayStatus(OrderPayStatusEnum.PAYMENT_COMPLETION.getCode());
        orderMapper.updateByPrimaryKeySelective(orderSelective);


    }
}

