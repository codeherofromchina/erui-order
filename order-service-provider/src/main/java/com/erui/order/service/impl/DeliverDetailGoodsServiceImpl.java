package com.erui.order.service.impl;

import com.erui.order.common.pojo.DeliverConsignGoodsInfo;
import com.erui.order.common.pojo.DeliverDetailGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverDetailGoodsMapper;
import com.erui.order.model.entity.DeliverDetailGoods;
import com.erui.order.model.entity.DeliverDetailGoodsExample;
import com.erui.order.service.DeliverDetailGoodsService;
import com.erui.order.service.util.DeliverDetailGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverDetailGoodsServiceImpl implements DeliverDetailGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverDetailGoodsServiceImpl.class);
    @Autowired
    private DeliverDetailGoodsMapper deliverDetailGoodsMapper;


    @Override
    public void update(Long deliverDetailId, List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos) throws Exception {
        if (deliverDetailId == null) {
            throw new Exception("出库合同ID错误");
        }
        List<DeliverDetailGoods> deliverDetailGoodsList = listByParentId02(deliverDetailId);
        Map<Long, DeliverDetailGoods> deliverDetailGoodsMap = deliverDetailGoodsList.stream()
                .collect(Collectors.toMap(DeliverDetailGoods::getId, vo -> vo));
        for (DeliverDetailGoodsInfo deliverDetailGoodsInfo : deliverDetailGoodsInfos) {
            Long id = deliverDetailGoodsInfo.getId();
            DeliverDetailGoods remove = deliverDetailGoodsMap.remove(id);
            if (remove == null) {
                throw new Exception("商品不存在此出库");
            } else {
                updateById(id, deliverDetailGoodsInfo);
            }
        }
        if (deliverDetailGoodsMap.size() > 0) {
            throw new Exception("商品对应错误");
        }
    }

    @Override
    public void insert(Long deliverDetailId, List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos) {
        for (DeliverConsignGoodsInfo deliverConsignGoodsInfo : deliverConsignGoodsInfos) {
            insert(deliverDetailId, deliverConsignGoodsInfo);
        }
    }


    private void insert(Long deliverDetailId, DeliverConsignGoodsInfo deliverConsignGoodsInfo) {
        DeliverDetailGoods deliverDetailGoods = new DeliverDetailGoods();
        deliverDetailGoods.setDeliverDetailId(deliverDetailId);
        deliverDetailGoods.setDeliverConsignGoodsId(deliverConsignGoodsInfo.getId());
        deliverDetailGoods.setOutboundNum(deliverConsignGoodsInfo.getSendNum());
        deliverDetailGoods.setStraightNum((short) 0);
        deliverDetailGoods.setCreateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        deliverDetailGoods.setCreateUserId(userInfo.getId());
        deliverDetailGoods.setDeleteFlag(Boolean.FALSE);

        deliverDetailGoodsMapper.insert(deliverDetailGoods);
    }

    @Override
    public int updateById(Long id, DeliverDetailGoodsInfo deliverDetailGoodsInfo) throws Exception {
        DeliverDetailGoods DeliverDetailGoods = deliverDetailGoodsMapper.selectByPrimaryKey(id);
        if (DeliverDetailGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        DeliverDetailGoods contractGoods = DeliverDetailGoodsFactory.deliverDetailGoods(deliverDetailGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return deliverDetailGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<DeliverDetailGoodsInfo> listByDeliverDetailId(Long deliverDetailId) {
        List<DeliverDetailGoods> deliverDetailGoodsList = listByParentId02(deliverDetailId);
        return DeliverDetailGoodsFactory.deliverDetailGoodsInfo(deliverDetailGoodsList);
    }

    private List<DeliverDetailGoods> listByParentId02(Long deliverDetailId) {
        DeliverDetailGoodsExample example = new DeliverDetailGoodsExample();
        example.createCriteria().andDeliverDetailIdEqualTo(deliverDetailId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverDetailGoods> deliverDetailGoodsList = deliverDetailGoodsMapper.selectByExample(example);
        if (deliverDetailGoodsList == null) {
            deliverDetailGoodsList = new ArrayList<>();
        }
        return deliverDetailGoodsList;
    }
}

