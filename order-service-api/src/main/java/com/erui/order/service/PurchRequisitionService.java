package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.common.pojo.request.PurchRequisitionQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;

public interface PurchRequisitionService {
    void update(Long id, PurchRequisitionSaveRequest updateRequest) throws Exception;

    Long insert(PurchRequisitionSaveRequest insertRequest) throws Exception;

    Pager<PurchRequisitionListResponse> list(PurchRequisitionQueryRequest queryRequest);

    PurchRequisitionDetailResponse detail(Long id) throws Exception;

    /**
     * 通过项目ID查询采购申请详情
     * @param projectId
     * @return
     */
    PurchRequisitionDetailResponse detailByProjectId(Long projectId) throws Exception;
}
