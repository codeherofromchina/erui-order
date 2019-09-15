package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.ProjectQueryRequest;
import com.erui.order.common.pojo.request.ProjectUpdateRequest;
import com.erui.order.common.pojo.response.ProjectDetailResponse;
import com.erui.order.common.pojo.response.ProjectDialogListResponse;
import com.erui.order.common.pojo.response.ProjectListResponse;

import java.util.List;

public interface ProjectService {
    /**
     * 新增项目
     * 订单提交后推送项目内容使用
     *
     * @param orderId
     * @return 返回插入的项目ID
     * @throws Exception
     */
    Long insert(Long orderId) throws Exception;


    void update(Long id, ProjectUpdateRequest projectUpdateRequest) throws Exception;

    /**
     * 查询项目分页列表
     *
     * @param queryRequest
     * @return
     */
    Pager<ProjectListResponse> list(ProjectQueryRequest queryRequest);

    /**
     * 查找所有项目的ID列表
     * @param queryRequest
     * @return
     */
    List<Long> projectIds(ProjectQueryRequest queryRequest);

    /**
     * 项目详情内容
     *
     * @param id
     * @return
     * @throws Exception
     */
    ProjectDetailResponse detail(Long id) throws Exception;

    /**
     * 查找弹框项目列表内容
     * @param queryRequest
     * @return
     */
    Pager<ProjectDialogListResponse> dialogList(ProjectQueryRequest queryRequest);

    List<Long> orderIdsByProjectIds(List<Long> projectIds);

    /**
     * 更新项目的采购合同完成
     * @param orderId
     */
    void updatePurchContractDoneByOrderId(Long orderId);
}

