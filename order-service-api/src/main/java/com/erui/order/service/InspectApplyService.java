package com.erui.order.service;


import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.InspectApplyQueryRequest;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;

import java.util.List;

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
     * 通过采购单ID查询报检列表
     *
     * @param purchId
     * @return
     */
    List<InspectApplyListResponse> list(Long purchId);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    InspectApplyDetailResponse detail(Long id) throws Exception;

    /**
     * 通过采购单查询报检预填充数据
     *
     * @param purchId
     * @return
     * @throws Exception
     */
    InspectApplyDetailResponse detailByPurchId(Long purchId) throws Exception;

    /**
     * 重新报检页面详情信息
     *
     * @param id
     * @param msg 整改意见
     * @return
     */
    void againInspectApplyInfo(Long id, String msg) throws Exception;
}

