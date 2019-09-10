package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.InspectApplyQueryRequest;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;

public interface InspectApplyService {
    /**
     * 新建
     *
     * @return
     * @throws Exception
     */
    Long insert(InspectApplySaveRequest insertRequest) throws Exception;

    /**
     * 更新
     *
     * @throws Exception
     */
    void update(Long id, InspectApplySaveRequest updateRequest) throws Exception;

    /**
     * 查询列表
     *
     * @param queryRequest
     * @return
     */
    Pager<InspectApplyListResponse> list(InspectApplyQueryRequest queryRequest);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    InspectApplyDetailResponse detail(Long id) throws Exception;
}

