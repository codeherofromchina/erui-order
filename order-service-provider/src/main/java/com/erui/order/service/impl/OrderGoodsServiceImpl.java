package com.erui.order.service.impl;

import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.StringUtil;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderGoodsMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.OrderGoods;
import com.erui.order.model.entity.OrderGoodsExample;
import com.erui.order.service.OrderGoodsService;
import com.erui.order.service.OrgService;
import com.erui.order.service.StandardUnitService;
import com.erui.order.service.util.OrderGoodsFactory;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderGoodsServiceImpl implements OrderGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderGoodsServiceImpl.class);
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private StandardUnitService standardUnitService;
    @Autowired
    private OrgService orgService;
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long orderId, List<OrderGoodsInfo> OrderGoodsInfos) throws Exception {
        if (orderId == null) {
            throw new Exception("订单ID错误");
        }
        List<OrderGoods> orderGoodss = listByOrderId02(orderId);
        Set<Long> orderGoodsIds = orderGoodss.stream().map(OrderGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (OrderGoodsInfo orderGoodsInfo : OrderGoodsInfos) {
            Long id = orderGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(orderId, orderGoodsInfo);
            } else if (orderGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, orderGoodsInfo);
            } else {
                // 抛出异常，不是给定业务附件
                throw new Exception("订单商品错误");
            }
        }

        if (orderGoodsIds.size() > 0) {
            delete(orderGoodsIds.toArray(new Long[orderGoodsIds.size()]));
        }
        return updateNum;
    }

    @Override
    public int insert(Long orderId, List<OrderGoodsInfo> orderGoodsInfos) {
        int insertNum = 0;
        for (OrderGoodsInfo orderGoodsInfo : orderGoodsInfos) {
            insertNum += insert(orderId, orderGoodsInfo);
        }
        return insertNum;
    }

    @Override
    public int insert(Long orderId, OrderGoodsInfo orderGoodsInfo) {
        Order order = orderMapper.selectByPrimaryKey(orderId);

        OrderGoods orderGoods = OrderGoodsFactory.orderGoods(orderId, orderGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            orderGoods.setCreateUserId(userInfo.getId());
        }

        // 生成SKU
        String sku = findLastGoodsSku();
        orderGoods.setSku(StringUtil.genSKU(orderGoods.getMeteType(), sku));
        orderGoods.setContractNo(order.getContractNo());
        orderGoods.setPreOutstockedNum((short) 0); // 预发货数量
        orderGoods.setOutstockedNum((short) 0); // 已发货数量
        orderGoods.setCreateTime(new Date());
        orderGoods.setDeleteFlag(Boolean.FALSE);
        orderGoods.setPrePurchContractNum((short) 0);
        orderGoods.setPurchContractNum((short) 0);
        orderGoods.setInstockedNum((short) 0);

        return orderGoodsMapper.insert(orderGoods);
    }


    /**
     * 删除商品
     * 设置附件的删除标志位为true
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) {
        if (ids == null || ids.length == 0) {
            return;
        }
        List<Long> idList = Arrays.asList(ids);
        OrderGoodsExample example = new OrderGoodsExample();
        example.createCriteria().andIdIn(idList);

        OrderGoods orderGoodsSelective = new OrderGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            orderGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        orderGoodsSelective.setDeleteFlag(Boolean.TRUE);
        orderGoodsSelective.setDeleteTime(new Date());
        orderGoodsMapper.updateByExampleSelective(orderGoodsSelective, example);
    }


    @Override
    public int updateById(Long id, OrderGoodsInfo orderGoodsInfo) throws Exception {
        OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(id);
        if (orderGoods == null) {
            throw new Exception("订单商品不存在");
        }

        OrderGoods updateOrderGoods = OrderGoodsFactory.orderGoods(orderGoods.getOrderId(), orderGoodsInfo);
        updateOrderGoods.setId(id);
        updateOrderGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            updateOrderGoods.setUpdateUserId(userInfo.getId());
        }

        return orderGoodsMapper.updateByPrimaryKeySelective(updateOrderGoods);
    }

    @Override
    public List<OrderGoodsInfo> list(Long orderId) {
        List<OrderGoods> orderGoodsList = listByOrderId02(orderId);

        List<OrderGoodsInfo> orderGoodsInfos = OrderGoodsFactory.orderGoodsInfos(orderGoodsList);
        if (orderGoodsInfos == null) {
            orderGoodsInfos = new ArrayList<>();
        } else {
            for (OrderGoodsInfo orderGoodsInfo : orderGoodsInfos) {
                orderGoodsInfo.setDepartmentName(orgService.findOrgNameById(orderGoodsInfo.getDepartmentId()));
                orderGoodsInfo.setUnitName(standardUnitService.findNameByCode(orderGoodsInfo.getUnit()));
            }
        }
        return orderGoodsInfos;
    }

    @Override
    public OrderGoodsInfo findById(Long id) {
        OrderGoods orderGoods = orderGoodsMapper.selectByPrimaryKey(id);
        OrderGoodsInfo orderGoodsInfo = OrderGoodsFactory.orderGoodsInfo(orderGoods);
        orderGoodsInfo.setUnitName(standardUnitService.findNameByCode(orderGoodsInfo.getUnit()));
        orderGoodsInfo.setDepartmentName(orgService.findOrgNameById(orderGoods.getDepartmentId()));

        return orderGoodsInfo;
    }

    @Override
    public List<OrderGoodsInfo> listByOrderId(Long orderId) {
        List<OrderGoods> orderGoodsList = listByOrderId02(orderId);
        return OrderGoodsFactory.orderGoodsInfos(orderGoodsList);
    }


    @Override
    public void updateExechgDate(Long orderId, Date exeChgDate) {
        OrderGoodsExample example = new OrderGoodsExample();
        example.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE).andOrderIdEqualTo(orderId);

        OrderGoods orderGoodsSelective = new OrderGoods();
        orderGoodsSelective.setExeChgDate(exeChgDate);
        orderGoodsMapper.updateByExampleSelective(orderGoodsSelective, example);
    }

    private List<OrderGoods> listByOrderId02(Long orderId) {
        OrderGoodsExample example = new OrderGoodsExample();
        example.createCriteria().andOrderIdEqualTo(orderId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExampleWithBLOBs(example);
        if (orderGoodsList == null) {
            orderGoodsList = new ArrayList<>();
        }
        return orderGoodsList;
    }

    private String findLastGoodsSku() {
        PageHelper.startPage(1, 1);
        OrderGoodsExample example = new OrderGoodsExample();
        example.setOrderByClause("id desc");
        OrderGoodsExample.Criteria criteria = example.createCriteria();
        List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExample(example);
        if (orderGoodsList != null && orderGoodsList.size() > 0) {
            return orderGoodsList.get(0).getSku();
        }
        return null;
    }
}
