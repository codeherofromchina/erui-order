package com.erui.order.service.impl;

import com.erui.order.common.pojo.*;
import com.erui.order.mapper.OrderGoodsMapper;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/15 下午2:18
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private StandardUnitService standardUnitService;
    @Autowired
    private InspectApplyGoodsService inspectApplyGoodsService;
    @Autowired
    private PurchGoodsService purchGoodsService;
    @Autowired
    private PurchContractGoodsService purchContractGoodsService;
    @Autowired
    private PurchRequisitionGoodsService purchRequisitionGoodsService;
    @Autowired
    private OrderGoodsService orderGoodsService;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;


    @Override
    public List<GoodsInfo> purchContractAbleGoodsList(List<Long> projectIds) {
        List<Long> orderIds = projectService.orderIdsByProjectIds(projectIds);
        if (orderIds.size() == 0) {
            return new ArrayList<>();
        }

        OrderGoodsExample example = new OrderGoodsExample();
        example.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE)
                .andOrderIdIn(orderIds);

        List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExample(example);

        List<Long> orderGoodsIds = orderGoodsList.stream().filter(vo -> {
            return vo.getContractGoodsNum() > vo.getPrePurchContractNum();
        }).map(OrderGoods::getId).collect(Collectors.toList());


        List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos = purchRequisitionGoodsService.selectByOrderGoodsIds(orderGoodsIds);


        return goodsInfoByPurchRequisitionGoods(purchRequisitionGoodsInfos);
    }

    @Override
    public void updateOrderGoodsPurchContractNum(Long purchRequisitionGoodsId, boolean pre, Integer purchaseNum) throws Exception {
        PurchRequisitionGoodsInfo purchRequisitionGoodsInfo = purchRequisitionGoodsService.findById(purchRequisitionGoodsId);

        OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(purchRequisitionGoodsInfo.getOrderGoodsId());

        OrderGoods orderGoodsSelective = new OrderGoods();
        orderGoodsSelective.setId(orderGoods.getId());
        int prePurchContractNum = orderGoods.getPrePurchContractNum() + purchaseNum.shortValue();

        if (prePurchContractNum > orderGoods.getContractGoodsNum()) {
            throw new Exception("采购合同商品大于订单合同数量");
        }

        orderGoodsSelective.setPrePurchContractNum((short) prePurchContractNum);
        if (!pre) {
            int purchContractNum = orderGoods.getPurchContractNum() + purchaseNum.shortValue();
            orderGoodsSelective.setPurchContractNum((short) purchContractNum);

            if (purchContractNum == orderGoods.getContractGoodsNum()) {
                // 更新项目状态为采购合同成功
                projectService.updatePurchContractDoneByOrderId(orderGoods.getOrderId());
            }
        }
        orderGoodsMapper.updateByPrimaryKeySelective(orderGoodsSelective);
    }


    @Override
    public List<GoodsInfo> goodsInfoByPurchContractId(Long purchContractId) {
        List<PurchContractGoodsInfo> purchContractGoodsInfoList = purchContractGoodsService.listByPurchContractId(purchContractId);
        return goodsInfoByPurchContractGoods(purchContractGoodsInfoList);
    }

    private GoodsInfo goodsInfo(OrderGoods orderGoods) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setOrderGoodsId(orderGoods.getId());
        goodsInfo.setContractNo(orderGoods.getContractNo());
        goodsInfo.setExeChgDate(orderGoods.getExeChgDate());
        goodsInfo.setSku(orderGoods.getSku());
        goodsInfo.setNameEn(orderGoods.getNameEn());
        goodsInfo.setNameZh(orderGoods.getNameZh());
        goodsInfo.setUnit(orderGoods.getUnit());
        goodsInfo.setUnitName(standardUnitService.findNameByCode(orderGoods.getUnit()));
        goodsInfo.setBrand(orderGoods.getBrand());
        goodsInfo.setContractGoodsNum(orderGoods.getContractGoodsNum());
        goodsInfo.setPrePurchContractNum(orderGoods.getPrePurchContractNum());
        return goodsInfo;
    }


    @Override
    public List<GoodsInfo> goodsinfobyDeliverDetailGoods(List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos) {
        return deliverDetailGoodsInfos.stream().map(vo -> goodsinfobyDeliverDetailGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsinfobyDeliverDetailGoods(DeliverDetailGoodsInfo deliverDetailGoodsInfo) {
        DeliverConsignGoodsInfo deliverConsignGoodsInfo = deliverConsignGoodsService.findById(deliverDetailGoodsInfo.getDeliverConsignGoodsId());
        GoodsInfo goodsInfo = goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfo);

        goodsInfo.setDeliverDetailGoodsId(deliverDetailGoodsInfo.getId());
        goodsInfo.setOutboundNum(deliverDetailGoodsInfo.getOutboundNum());
        goodsInfo.setStraightNum(deliverDetailGoodsInfo.getStraightNum());
        goodsInfo.setDetailGoodsRemarks(deliverDetailGoodsInfo.getDetailGoodsRemarks());
        return goodsInfo;
    }

    @Override
    public List<GoodsInfo> goodsInfoByDeliverConsignGoods(List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList) {
        return deliverConsignGoodsInfoList.stream().map(vo -> goodsInfoByDeliverConsignGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByDeliverConsignGoods(DeliverConsignGoodsInfo deliverConsignGoodsInfo) {
        OrderGoodsInfo orderGoodsInfo = orderGoodsService.findById(deliverConsignGoodsInfo.getOrderGoodsId());
        GoodsInfo goodsInfo = goodsInfoByOrderGoods(orderGoodsInfo);
        goodsInfo.setDeliverConsignGoodsId(deliverConsignGoodsInfo.getId());
        goodsInfo.setSendNum(deliverConsignGoodsInfo.getSendNum());
        return goodsInfo;
    }

    @Override
    public List<GoodsInfo> goodsInfoByInstockGoods(List<InstockGoodsInfo> instockGoodsInfoList) {
        return instockGoodsInfoList.stream().map(vo -> goodsInfoByInstockGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByInstockGoods(InstockGoodsInfo instockGoodsInfo) {
        InspectApplyGoodsInfo inspectApplyGoodsInfo = inspectApplyGoodsService.findById(instockGoodsInfo.getInspectApplyGoodsId());
        GoodsInfo goodsInfo = goodsInfoByInspectApplyGoods(inspectApplyGoodsInfo);
        goodsInfo.setInstockGoodsId(instockGoodsInfo.getId());
        goodsInfo.setInstockNum(instockGoodsInfo.getInstockNum());
        goodsInfo.setInstockStock(instockGoodsInfo.getInstockStock());
        return goodsInfo;
    }

    @Override
    public List<GoodsInfo> goodsInfoByInspectApplyGoods(List<InspectApplyGoodsInfo> inspectApplyGoodsInfoList) {
        return inspectApplyGoodsInfoList.stream().map(vo -> goodsInfoByInspectApplyGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByInspectApplyGoods(InspectApplyGoodsInfo inspectApplyGoodsInfo) {
        PurchGoodsInfo purchGoodsInfo = purchGoodsService.findById(inspectApplyGoodsInfo.getPurchGoodsId());
        GoodsInfo goodsInfo = goodsInfoByPurchGoods(purchGoodsInfo);
        goodsInfo.setInspectApplyGoodsId(inspectApplyGoodsInfo.getId());
        goodsInfo.setPurchGoodsId(inspectApplyGoodsInfo.getPurchGoodsId());
        goodsInfo.setInspectNum(inspectApplyGoodsInfo.getInspectNum());
        goodsInfo.setHeight(inspectApplyGoodsInfo.getHeight());
        goodsInfo.setLwh(inspectApplyGoodsInfo.getLwh());
        goodsInfo.setUnqualified(inspectApplyGoodsInfo.getUnqualified());
        goodsInfo.setUnqualifiedDesc(inspectApplyGoodsInfo.getUnqualifiedDesc());
        goodsInfo.setUnqualifiedType(inspectApplyGoodsInfo.getUnqualifiedType());
        return goodsInfo;
    }


    @Override
    public List<GoodsInfo> goodsInfoByPurchGoods(List<PurchGoodsInfo> purchGoodsInfopurchGoodsInfoList) {
        return purchGoodsInfopurchGoodsInfoList.stream().map(vo -> goodsInfoByPurchGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByPurchGoods(PurchGoodsInfo purchGoodsInfo) {
        PurchContractGoodsInfo purchContractGoodsInfo = purchContractGoodsService.findById(purchGoodsInfo.getPurchContractGoodsId());
        GoodsInfo goodsInfo = goodsInfoByPurchContractGoods(purchContractGoodsInfo);
        // 本次采购数量
        goodsInfo.setPurchasedNum(purchGoodsInfo.getPurchaseNum());
        // 本次采购单价
        goodsInfo.setPurchasedPrice(purchGoodsInfo.getPurchasePrice());
        goodsInfo.setPurchasedRemark(purchGoodsInfo.getPurchaseRemark());
        return goodsInfo;
    }


    @Override
    public List<GoodsInfo> goodsInfoByPurchContractGoods(List<PurchContractGoodsInfo> purchContractGoodsInfo) {
        return purchContractGoodsInfo.stream().map(vo -> goodsInfoByPurchContractGoods(vo)).collect(Collectors.toList());
    }


    @Override
    public GoodsInfo goodsInfoByPurchContractGoods(PurchContractGoodsInfo purchContractGoodsInfo) {
        PurchRequisitionGoodsInfo purchRequisitionGoodsInfo = purchRequisitionGoodsService.findById(purchContractGoodsInfo.getPurchRequisitionGoodsId());
        GoodsInfo goodsInfo = goodsInfoByPurchRequisitionGoods(purchRequisitionGoodsInfo);
        goodsInfo.setPurchContractGoodsId(purchContractGoodsInfo.getId());
        // 采购合同数量
        goodsInfo.setPurchaseNum(purchContractGoodsInfo.getPurchaseNum());
        return goodsInfo;
    }


    @Override
    public List<GoodsInfo> goodsInfoByPurchRequisitionGoods(List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfoList) {
        return purchRequisitionGoodsInfoList.stream().map(vo -> goodsInfoByPurchRequisitionGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByPurchRequisitionGoods(PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        OrderGoodsInfo orderGoodsInfo = orderGoodsService.findById(purchRequisitionGoodsInfo.getOrderGoodsId());
        GoodsInfo goodsInfo = goodsInfoByOrderGoods(orderGoodsInfo);
        goodsInfo.setPurchRequisitionGoodsId(purchRequisitionGoodsInfo.getId());
        goodsInfo.setRequirePurchaseDate(purchRequisitionGoodsInfo.getRequirePurchaseDate());
        return goodsInfo;
    }

    @Override
    public List<GoodsInfo> goodsInfoByOrderGoods(List<OrderGoodsInfo> orderGoodsInfoList) {
        return orderGoodsInfoList.stream().map(vo -> goodsInfoByOrderGoods(vo)).collect(Collectors.toList());
    }

    @Override
    public GoodsInfo goodsInfoByOrderGoods(OrderGoodsInfo orderGoodsInfo) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setOrderGoodsId(orderGoodsInfo.getId());
        goodsInfo.setSku(orderGoodsInfo.getSku());
        goodsInfo.setNameEn(orderGoodsInfo.getNameEn());
        goodsInfo.setNameZh(orderGoodsInfo.getNameZh());
        goodsInfo.setUnit(orderGoodsInfo.getUnit());
        goodsInfo.setUnitName(standardUnitService.findNameByCode(orderGoodsInfo.getUnit()));
        goodsInfo.setBrand(orderGoodsInfo.getBrand());
        goodsInfo.setContractGoodsNum(orderGoodsInfo.getContractGoodsNum());
        return goodsInfo;
    }
}
