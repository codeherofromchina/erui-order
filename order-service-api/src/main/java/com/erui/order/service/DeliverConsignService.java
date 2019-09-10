package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;

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
}

