package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.OrderAccountQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountListResponse;

public interface OrderAccountService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(OrderAccountSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, OrderAccountSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<OrderAccountListResponse> list(OrderAccountQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    OrderAccountDetailResponse detail(Long id) throws Exception;
}

