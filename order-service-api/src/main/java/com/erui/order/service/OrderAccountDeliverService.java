package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.OrderAccountDeliverQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountDeliverSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDeliverDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountDeliverListResponse;

public interface OrderAccountDeliverService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(OrderAccountDeliverSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, OrderAccountDeliverSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<OrderAccountDeliverListResponse> list(OrderAccountDeliverQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    OrderAccountDeliverDetailResponse detail(Long id) throws Exception;
}

