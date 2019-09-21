package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.PurchPayApplicationQueryRequest;
import com.erui.order.common.pojo.request.PurchPayApplicationSaveRequest;
import com.erui.order.common.pojo.response.PurchPayApplicationDetailResponse;
import com.erui.order.common.pojo.response.PurchPayApplicationListResponse;

public interface PurchPayApplicationService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(PurchPayApplicationSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, PurchPayApplicationSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<PurchPayApplicationListResponse> list(PurchPayApplicationQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    PurchPayApplicationDetailResponse detail(Long id) throws Exception;
}

