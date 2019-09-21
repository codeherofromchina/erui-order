package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.DeliverDetailQueryRequest;
import com.erui.order.common.pojo.request.DeliverDetailSaveRequest;
import com.erui.order.common.pojo.response.DeliverDetailDetailResponse;
import com.erui.order.common.pojo.response.DeliverDetailListResponse;

public interface DeliverDetailService {
    /**
     * 看货通知单后推送信息到出库中
     *
     * @return
     * @throws Exception
     */
    Long insert(Long inspectNoticeId) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, DeliverDetailSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<DeliverDetailListResponse> list(DeliverDetailQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    DeliverDetailDetailResponse detail(Long id) throws Exception;
}

