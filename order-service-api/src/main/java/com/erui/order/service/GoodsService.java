package com.erui.order.service;

import com.erui.order.common.pojo.*;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/15 下午2:18
 */
public interface GoodsService {
    /**
     * 查询所有可以新增采购合同的商品列表
     *
     * @param projectIds
     * @return
     */
    List<GoodsInfo> purchContractAbleGoodsList(List<Long> projectIds);

    void updateOrderGoodsPurchContractNum(Long purchRequisitionGoodsId, boolean pre, Integer purchaseNum) throws Exception;


// ---------------------------------------------------------------------------

    List<GoodsInfo> goodsinfobyDeliverDetailGoods(List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos);
    GoodsInfo goodsinfobyDeliverDetailGoods(DeliverDetailGoodsInfo deliverDetailGoodsInfo);

    /**
     * 通过订舱商品查询商品完整信息
     * @param deliverConsignGoodsInfoList
     * @return
     */
    List<GoodsInfo> goodsInfoByDeliverConsignGoods(List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList);

    GoodsInfo goodsInfoByDeliverConsignGoods(DeliverConsignGoodsInfo deliverConsignGoodsInfo);

    /**
     * 查询可新建采购的商品列表
     *
     * @param purchContractId
     * @return
     */
    List<GoodsInfo> goodsInfoByPurchContractId(Long purchContractId);

    /**
     * 通过入库商品查找商品的全部信息
     *
     * @param instockGoodsInfos
     * @return
     */
    List<GoodsInfo> goodsInfoByInstockGoods(List<InstockGoodsInfo> instockGoodsInfos);

    GoodsInfo goodsInfoByInstockGoods(InstockGoodsInfo instockGoodsInfo);

    /**
     * 通过报检商品查找商品的全部信息
     *
     * @param inspectApplyGoodsInfos
     * @return
     */
    List<GoodsInfo> goodsInfoByInspectApplyGoods(List<InspectApplyGoodsInfo> inspectApplyGoodsInfos);

    GoodsInfo goodsInfoByInspectApplyGoods(InspectApplyGoodsInfo inspectApplyGoodsInfo);


    /**
     * 通过采购商品查找商品的全部信息
     *
     * @param purchGoodsInfopurchGoodsInfoList
     * @return
     */
    List<GoodsInfo> goodsInfoByPurchGoods(List<PurchGoodsInfo> purchGoodsInfopurchGoodsInfoList);

    GoodsInfo goodsInfoByPurchGoods(PurchGoodsInfo purchGoodsInfo);

    List<GoodsInfo> goodsInfoByPurchContractGoods(List<PurchContractGoodsInfo> purchContractGoodsInfo);

    GoodsInfo goodsInfoByPurchContractGoods(PurchContractGoodsInfo purchContractGoodsInfo);

    List<GoodsInfo> goodsInfoByPurchRequisitionGoods(List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfoList);

    GoodsInfo goodsInfoByPurchRequisitionGoods(PurchRequisitionGoodsInfo purchRequisitionGoodsInfo);

    List<GoodsInfo> goodsInfoByOrderGoods(List<OrderGoodsInfo> orderGoodsInfoList);

    GoodsInfo goodsInfoByOrderGoods(OrderGoodsInfo orderGoodsInfo);



}
