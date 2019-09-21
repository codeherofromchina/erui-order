package com.erui.order.service;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
import com.erui.order.common.pojo.InstockGoodsInfo;

import java.util.List;

public interface InstockGoodsService {


    /**
     * 更新操作
     *
     * @param InstockId
     * @param InstockGoodsList
     * @return
     * @throws Exception
     */
    int update(Long InstockId, List<InstockGoodsInfo> InstockGoodsList) throws Exception;

    /**
     * 插入信息
     *
     * @param instockId
     * @param inspectApplyGoodsInfos
     * @return
     */
    int insert(Long instockId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos);

    void delete(Long... ids);

    int updateById(Long id, InstockGoodsInfo InstockGoodsInfo) throws Exception;

    List<InstockGoodsInfo> listByInstockId(Long instockId);
}

