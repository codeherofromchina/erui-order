package com.erui.order.service;

import com.erui.order.common.pojo.InstockGoodsInfo;

import java.util.List;

public interface InstockGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param InstockId
     * @param InstockGoodsList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long InstockId, List<InstockGoodsInfo> InstockGoodsList) throws Exception;

    /**
     * 插入信息
     *
     * @param InstockId
     * @param InstockGoodsList
     * @return
     */
    int insert(Long InstockId, List<InstockGoodsInfo> InstockGoodsList);

    int insert(Long InstockId, InstockGoodsInfo InstockGoodsInfo);

    void delete(Long... ids);

    int updateById(Long id, InstockGoodsInfo InstockGoodsInfo) throws Exception;

    List<InstockGoodsInfo> listByInstockId(Long instockId);
}

