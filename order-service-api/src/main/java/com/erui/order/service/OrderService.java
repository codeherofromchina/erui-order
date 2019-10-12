package com.erui.order.service;

import com.erui.order.common.enums.OrderPayStatusEnum;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.OrderQueryRequest;
import com.erui.order.common.pojo.request.OrderSaveRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.OrderListResponse;

import java.util.List;

/**
 * @Auther 王晓丹
 * 订单业务类
 * @Date 2019/7/29 下午5:28
 */
public interface OrderService {

    /**
     * 新建订单
     *
     * @return
     * @throws Exception
     */
    Long insert(OrderSaveRequest insertRequest) throws Exception;

    /**
     * 更新订单
     *
     * @throws Exception
     */
    void update(Long id, OrderSaveRequest updateRequest) throws Exception;

    /**
     * 查询订单列表
     *
     * @param queryRequest
     * @return
     */
    Pager<OrderListResponse> list(OrderQueryRequest queryRequest);

    /**
     * 查询订单详情
     *
     * @param id
     * @return
     */
    OrderDetailResponse detail(Long id) throws Exception;

}

