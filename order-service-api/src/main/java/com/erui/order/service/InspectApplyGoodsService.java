package com.erui.order.service;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;

import java.util.List;

public interface InspectApplyGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param InspectApplyId
     * @param InspectApplyGoodsList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long InspectApplyId, List<InspectApplyGoodsInfo> InspectApplyGoodsList) throws Exception;

    /**
     * 插入信息
     *
     * @param InspectApplyId
     * @param InspectApplyGoodsList
     * @return
     */
    int insert(Long InspectApplyId, List<InspectApplyGoodsInfo> InspectApplyGoodsList);

    int insert(Long InspectApplyId, InspectApplyGoodsInfo InspectApplyGoodsInfo);

    void delete(Long... ids);

    int updateById(Long id, InspectApplyGoodsInfo InspectApplyGoodsInfo) throws Exception;

    List<InspectApplyGoodsInfo> listByInspectApplyId(Long inspectApplyId);
}

