package com.erui.order.service;

import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;

import java.util.List;

public interface PurchRequisitionGoodsService {
    void update(Long purchRequisitionId, List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos) throws Exception;

    int insert(Long purchRequisitionId, List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos);

    int insert(Long purchRequisitionId, PurchRequisitionGoodsInfo purchRequisitionGoodsInfo);

    List<PurchRequisitionGoodsInfo> list(Long purchRequisitionId);

    PurchRequisitionGoodsInfo findById(Long id);
}
