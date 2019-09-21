package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;

import java.util.List;

public interface DeliverConsignService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(DeliverConsignSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, DeliverConsignSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<DeliverConsignListResponse> list(DeliverConsignQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    DeliverConsignDetailResponse detail(Long id) throws Exception;

    List<DeliverConsignListResponse> listByOrderid(Long orderId);

    /**
     * 通过商品ID预加载订舱基本信息
     * @param orderId
     * @return
     */
    DeliverConsignDetailResponse detailByOrderId(Long orderId) throws Exception;
}

