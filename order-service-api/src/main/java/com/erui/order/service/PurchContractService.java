package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.PurchContractQueryRequest;
import com.erui.order.common.pojo.request.PurchContractSaveRequest;
import com.erui.order.common.pojo.response.PurchContractDetailResponse;
import com.erui.order.common.pojo.response.PurchContractListResponse;

public interface PurchContractService {

    /**
     * 插入成功返回采购合同ID
     *
     * @param insertRequest
     * @return
     */
    Long insert(PurchContractSaveRequest insertRequest) throws Exception;

    void update(Long id, PurchContractSaveRequest updateRequest) throws Exception;


    Pager<PurchContractListResponse> list(PurchContractQueryRequest queryRequest);

    /**
     * 根据唯一标识查询采购合同详情内容
     *
     * @param id
     * @return
     */
    PurchContractDetailResponse detail(Long id) throws Exception;
}
