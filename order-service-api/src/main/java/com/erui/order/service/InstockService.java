package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.InstockQueryRequest;
import com.erui.order.common.pojo.request.InstockSaveRequest;
import com.erui.order.common.pojo.response.InstockDetailResponse;
import com.erui.order.common.pojo.response.InstockListResponse;

public interface InstockService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(InstockSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, InstockSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<InstockListResponse> list(InstockQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    InstockDetailResponse detail(Long id) throws Exception;
}

