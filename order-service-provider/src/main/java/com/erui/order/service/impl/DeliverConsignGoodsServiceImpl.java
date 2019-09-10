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
    private DeliverConsignGoodsMapper DeliverConsignGoodsMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<DeliverConsignGoodsInfo> DeliverConsignGoodsInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<DeliverConsignGoods> DeliverConsignGoodses = listByDeliverConsignId02(parentId);
        Set<Long> DeliverConsignGoodsIds = DeliverConsignGoodses.stream().map(DeliverConsignGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (DeliverConsignGoodsInfo DeliverConsignGoodsInfo : DeliverConsignGoodsInfos) {
            Long id = DeliverConsignGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, DeliverConsignGoodsInfo);
            } else if (DeliverConsignGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, DeliverConsignGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (DeliverConsignGoodsIds.size() > 0) {
            delete(DeliverConsignGoodsIds.toArray(new Long[DeliverConsignGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long purchId, List<DeliverConsignGoodsInfo> DeliverConsignGoodsList) {
        int insertNum = 0;
        for (DeliverConsignGoodsInfo DeliverConsignGoodsInfo : DeliverConsignGoodsList) {
            insertNum += insert(purchId, DeliverConsignGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, DeliverConsignGoodsInfo DeliverConsignGoodsInfo) {
        DeliverConsignGoods DeliverConsignGoods = DeliverConsignGoodsFactory.DeliverConsignGoods(DeliverConsignGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsignGoods.setDeliverConsignId(purchId);
        if (userInfo != null) {
            DeliverConsignGoods.setCreateUserId(userInfo.getId());
        }
        DeliverConsignGoods.setCreateTime(new Date());
        return DeliverConsignGoodsMapper.insert(DeliverConsignGoods);
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

        DeliverConsignGoodsMapper.updateByExampleSelective(DeliverConsignGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, DeliverConsignGoodsInfo DeliverConsignGoodsInfo) throws Exception {
        DeliverConsignGoods DeliverConsignGoods = DeliverConsignGoodsMapper.selectByPrimaryKey(id);
        if (DeliverConsignGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        DeliverConsignGoods contractGoods = DeliverConsignGoodsFactory.DeliverConsignGoods(DeliverConsignGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return DeliverConsignGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<DeliverConsignGoodsInfo> listByDeliverConsignId(Long deliverConsignId) {
        List<DeliverConsignGoods> DeliverConsignGoodsList = listByDeliverConsignId02(deliverConsignId);
        return DeliverConsignGoodsFactory.DeliverConsignGoodsInfo(DeliverConsignGoodsList);
    }

    private List<DeliverConsignGoods> listByDeliverConsignId02(Long purchId) {
        DeliverConsignGoodsExample example = new DeliverConsignGoodsExample();
        example.createCriteria().andDeliverConsignIdEqualTo(purchId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsignGoods> DeliverConsignGoodsList = DeliverConsignGoodsMapper.selectByExample(example);
        if (DeliverConsignGoodsList == null) {
            DeliverConsignGoodsList = new ArrayList<>();
        }
        return DeliverConsignGoodsList;
    }
}

