package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.InspectReportQueryRequest;
import com.erui.order.common.pojo.request.InspectReportSaveRequest;
import com.erui.order.common.pojo.response.InspectReportDetailResponse;
import com.erui.order.common.pojo.response.InspectReportListResponse;

public interface InspectReportService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(InspectReportSaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, InspectReportSaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<InspectReportListResponse> list(InspectReportQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    InspectReportDetailResponse detail(Long id) throws Exception;
}

