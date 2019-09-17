package com.erui.order.service.impl;

import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.common.pojo.PurchContractGoodsInfo;
import com.erui.order.mapper.OrderGoodsMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.mapper.PurchContractGoodsMapper;
import com.erui.order.model.entity.*;
import com.erui.order.service.GoodsService;
import com.erui.order.service.ProjectService;
import com.erui.order.service.StandardUnitService;
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
    private OrderMapper orderMapper;
    @Autowired
    private StandardUnitService standardUnitService;
    @Autowired
    private PurchContractGoodsMapper purchContractGoodsMapper;


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
        List<GoodsInfo> goodsInfoList = orderGoodsList.stream().filter(vo -> {
            return vo.getContractGoodsNum() > vo.getPrePurchContractNum();
        }).map(vo -> goodsInfo(vo)).collect(Collectors.toList());

        return goodsInfoList;
    }

    @Override
    public void updateOrderGoodsPurchContractNum(Long orderGoodsId, boolean pre, Integer purchaseNum) throws Exception {
        OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(orderGoodsId);

        OrderGoods orderGoodsSelective = new OrderGoods();
        orderGoodsSelective.setId(orderGoodsId);
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
    public List<GoodsInfo> goodsInfos(List<PurchContractGoodsInfo> purchContractGoodsInfos) {
        List<GoodsInfo> goodsInfoList = new ArrayList<>();
        if (purchContractGoodsInfos != null && purchContractGoodsInfos.size() > 0) {
            for (PurchContractGoodsInfo purchContractGoodsInfo : purchContractGoodsInfos) {
                OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(purchContractGoodsInfo.getOrderGoodsId());
                GoodsInfo goodsInfo = goodsInfo(orderGoods);
                goodsInfo.setId(purchContractGoodsInfo.getId());
                goodsInfo.setOrderGoodsId(purchContractGoodsInfo.getOrderGoodsId());
                goodsInfo.setPurchaseNum(purchContractGoodsInfo.getPurchaseNum());
                goodsInfo.setPurchasePrice(purchContractGoodsInfo.getPurchasePrice());
                goodsInfo.setBrand(purchContractGoodsInfo.getBrand());

                goodsInfoList.add(goodsInfo);
            }
        }
        return goodsInfoList;
    }


    @Override
    public List<GoodsInfo> purchAbleGoodsList(Long purchContractId) {
        PurchContractGoodsExample example = new PurchContractGoodsExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<PurchContractGoods> purchContractGoodsList = purchContractGoodsMapper.selectByExample(example);
        List<GoodsInfo> goodsInfoList = new ArrayList<>();
        for (PurchContractGoods purchContractGoods : purchContractGoodsList) {
            OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(purchContractGoods.getOrderGoodsId());
            GoodsInfo goodsInfo = goodsInfo(orderGoods);
            goodsInfo.setPurchContractGoodsId(purchContractGoods.getId());
            goodsInfo.setPurchaseNum(purchContractGoods.getPurchaseNum());
            goodsInfo.setPrePurchasedNum(purchContractGoods.getPrePurchasedNum());
            goodsInfo.setPurchasedNum(0);
            goodsInfo.setPurchasePrice(purchContractGoods.getPurchasePrice());
            goodsInfo.setPurchasedPrice(purchContractGoods.getPurchasePrice());
            goodsInfoList.add(goodsInfo);
        }
        return goodsInfoList;
    }

    private GoodsInfo goodsInfo(OrderGoods orderGoods) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setOrderGoodsId(orderGoods.getId());
        goodsInfo.setContractNo(orderGoods.getContractNo());
        goodsInfo.setProjectNo(orderGoods.getProjectNo());
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
}
