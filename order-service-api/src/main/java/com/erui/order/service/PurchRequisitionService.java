package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.common.pojo.request.PurchRequisitionQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;

import java.util.List;

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

    /**
     * 获取当前登录用户的所有可新建采购合同的项目列表
     * @return
     */
    List<Long> projectIdsByCurrentUser();

}
