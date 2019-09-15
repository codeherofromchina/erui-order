package com.erui.order.service.impl;

import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.mapper.OrderGoodsMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.OrderGoods;
import com.erui.order.model.entity.OrderGoodsExample;
import com.erui.order.service.GoodsService;
import com.erui.order.service.OrderService;
import com.erui.order.service.ProjectService;
import com.erui.order.service.StandardUnitService;
import com.erui.order.service.util.GoodsInfoFactory;
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



    @Override
    public List<GoodsInfo> purchContractGoodsList(List<Long> projectIds) {
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
    public void updateOrderGoodsPurchContractNum(Long orderGoodsId, boolean pre, Integer purchaseNum) {
        OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(orderGoodsId);

        OrderGoods orderGoodsSelective = new OrderGoods();
        orderGoodsSelective.setId(orderGoodsId);
        int prePurchContractNum = orderGoods.getPrePurchContractNum() + purchaseNum.shortValue();
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

    private GoodsInfo goodsInfo(OrderGoods orderGoods) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setOrderGoodsId(orderGoods.getId());
        Order order = orderMapper.selectByPrimaryKey(orderGoods.getOrderId());
        goodsInfo.setProjectNo(order.getContractNo());
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
