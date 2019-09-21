package com.erui.order.service.impl;

import com.erui.order.common.pojo.DeliverConsignGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignGoodsMapper;
import com.erui.order.model.entity.DeliverConsignGoods;
import com.erui.order.model.entity.DeliverConsignGoodsExample;
import com.erui.order.service.DeliverConsignGoodsService;
import com.erui.order.service.util.DeliverConsignGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverConsignGoodsServiceImpl implements DeliverConsignGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignGoodsServiceImpl.class);
    @Autowired
    private DeliverConsignGoodsMapper deliverConsignGoods;


    @Override
    public int insertOnDuplicateIdUpdate(Long deliverConsignId, List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList) throws Exception {
        if (deliverConsignId == null) {
            throw new Exception("订舱ID错误");
        }
        List<DeliverConsignGoods> deliverConsignGoods = listByDeliverConsignId02(deliverConsignId);
        Set<Long> deliverConsignGoodsIdSet = deliverConsignGoods.stream().map(DeliverConsignGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (DeliverConsignGoodsInfo deliverConsignGoodsInfo : deliverConsignGoodsInfoList) {
            Long id = deliverConsignGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(deliverConsignId, deliverConsignGoodsInfo);
            } else if (deliverConsignGoodsIdSet.remove(id)) {
                // 更新操作
                updateNum += updateById(id, deliverConsignGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (deliverConsignGoodsIdSet.size() > 0) {
            delete(deliverConsignGoodsIdSet.toArray(new Long[deliverConsignGoodsIdSet.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long deliverConsignId, List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos) {
        int insertNum = 0;
        for (DeliverConsignGoodsInfo deliverConsignGoodsInfo : deliverConsignGoodsInfos) {
            insertNum += insert(deliverConsignId, deliverConsignGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, DeliverConsignGoodsInfo deliverConsignGoodsInfo) {
        DeliverConsignGoods deliverConsignGoods = DeliverConsignGoodsFactory.deliverConsignGoods(deliverConsignGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        deliverConsignGoods.setDeliverConsignId(purchId);
        if (userInfo != null) {
            deliverConsignGoods.setCreateUserId(userInfo.getId());
        }
        deliverConsignGoods.setCreateTime(new Date());
        deliverConsignGoods.setDeleteFlag(Boolean.FALSE);
        return this.deliverConsignGoods.insert(deliverConsignGoods);
    }


    /**
     * 删除采购合同商品
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
        DeliverConsignGoodsExample example = new DeliverConsignGoodsExample();
        example.createCriteria().andIdIn(idList);

        DeliverConsignGoods DeliverConsignGoodsSelective = new DeliverConsignGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            DeliverConsignGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        DeliverConsignGoodsSelective.setDeleteFlag(Boolean.TRUE);
        DeliverConsignGoodsSelective.setDeleteTime(new Date());

        deliverConsignGoods.updateByExampleSelective(DeliverConsignGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, DeliverConsignGoodsInfo deliverConsignGoodsInfo) throws Exception {
        DeliverConsignGoods deliverConsignGoods = this.deliverConsignGoods.selectByPrimaryKey(id);
        if (deliverConsignGoods == null) {
            throw new Exception("订舱商品不存在");
        }

        DeliverConsignGoods deliverConsignGoodsSelective = DeliverConsignGoodsFactory.deliverConsignGoods(deliverConsignGoodsInfo);
        deliverConsignGoodsSelective.setId(id);
        deliverConsignGoodsSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            deliverConsignGoodsSelective.setUpdateUserId(userInfo.getId());
        }

        return this.deliverConsignGoods.updateByPrimaryKeySelective(deliverConsignGoodsSelective);
    }

    @Override
    public List<DeliverConsignGoodsInfo> listByDeliverConsignId(Long deliverConsignId) {
        List<DeliverConsignGoods> deliverConsignGoodsInfos = listByDeliverConsignId02(deliverConsignId);
        return DeliverConsignGoodsFactory.deliverConsignGoodsInfo(deliverConsignGoodsInfos);
    }

    @Override
    public DeliverConsignGoodsInfo findById(Long deliverConsignGoodsId) {
        DeliverConsignGoods deliverConsignGoods = this.deliverConsignGoods.selectByPrimaryKey(deliverConsignGoodsId);
        return DeliverConsignGoodsFactory.deliverConsignGoodsInfo(deliverConsignGoods);
    }

    private List<DeliverConsignGoods> listByDeliverConsignId02(Long purchId) {
        DeliverConsignGoodsExample example = new DeliverConsignGoodsExample();
        example.createCriteria().andDeliverConsignIdEqualTo(purchId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsignGoods> DeliverConsignGoodsList = deliverConsignGoods.selectByExample(example);
        if (DeliverConsignGoodsList == null) {
            DeliverConsignGoodsList = new ArrayList<>();
        }
        return DeliverConsignGoodsList;
    }
}

