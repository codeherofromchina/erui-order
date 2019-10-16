package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.PurchQueryRequest;
import com.erui.order.common.pojo.request.PurchSaveRequest;
import com.erui.order.common.pojo.response.PurchDetailResponse;
import com.erui.order.common.pojo.response.PurchListResponse;

public interface PurchService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(PurchSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, PurchSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<PurchListResponse> list(PurchQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    PurchDetailResponse detail(Long id) throws Exception;

    /**
     * 设置收款完成
     * @param id
     */
    void payDone(Long id) throws Exception;
}

