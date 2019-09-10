package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.DeliverNoticeQueryRequest;
import com.erui.order.common.pojo.request.DeliverNoticeSaveRequest;
import com.erui.order.common.pojo.response.DeliverNoticeDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeListResponse;

public interface DeliverNoticeService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(DeliverNoticeSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, DeliverNoticeSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<DeliverNoticeListResponse> list(DeliverNoticeQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    DeliverNoticeDetailResponse detail(Long id) throws Exception;
}

