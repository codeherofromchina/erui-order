package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.LogisticsDataQueryRequest;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;

public interface LogisticsDataService {
    /**
     * 推送物流信息
     *
     * @return
     * @throws Exception
     */
    Long insert(Long deliverDetailId) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, LogisticsDataSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<LogisticsDataListResponse> list(LogisticsDataQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    LogisticsDataDetailResponse detail(Long id) throws Exception;
}

