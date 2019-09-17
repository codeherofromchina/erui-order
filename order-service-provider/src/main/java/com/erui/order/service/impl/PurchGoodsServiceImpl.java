package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchGoodsMapper;
import com.erui.order.model.entity.PurchGoods;
import com.erui.order.model.entity.PurchGoodsExample;
import com.erui.order.service.PurchGoodsService;
import com.erui.order.service.util.PurchGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchGoodsServiceImpl implements PurchGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchGoodsServiceImpl.class);
    @Autowired
    private PurchGoodsMapper purchGoodsMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<PurchGoodsInfo> PurchGoodsInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<PurchGoods> PurchGoodses = listByParentId02(parentId);
        Set<Long> PurchGoodsIds = PurchGoodses.stream().map(PurchGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (PurchGoodsInfo purchGoodsInfo : PurchGoodsInfos) {
            Long id = purchGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, purchGoodsInfo);
            } else if (PurchGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, purchGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (PurchGoodsIds.size() > 0) {
            delete(PurchGoodsIds.toArray(new Long[PurchGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long purchId, List<PurchGoodsInfo> PurchGoodsList) {
        int insertNum = 0;
        for (PurchGoodsInfo PurchGoodsInfo : PurchGoodsList) {
            insertNum += insert(purchId, PurchGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, PurchGoodsInfo PurchGoodsInfo) {
        PurchGoods purchGoods = PurchGoodsFactory.purchGoods(PurchGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        purchGoods.setPurchId(purchId);
        if (userInfo != null) {
            purchGoods.setCreateUserId(userInfo.getId());
        }
        purchGoods.setCreateTime(new Date());
        purchGoods.setDeleteFlag(Boolean.FALSE);
        return purchGoodsMapper.insert(purchGoods);
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
        PurchGoodsExample example = new PurchGoodsExample();
        example.createCriteria().andIdIn(idList);

        PurchGoods PurchGoodsSelective = new PurchGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            PurchGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        PurchGoodsSelective.setDeleteFlag(Boolean.TRUE);
        PurchGoodsSelective.setDeleteTime(new Date());

        purchGoodsMapper.updateByExampleSelective(PurchGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, PurchGoodsInfo PurchGoodsInfo) throws Exception {
        PurchGoods PurchGoods = purchGoodsMapper.selectByPrimaryKey(id);
        if (PurchGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        PurchGoods contractGoods = PurchGoodsFactory.purchGoods(PurchGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return purchGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<PurchGoodsInfo> listByPurchId(Long purchId) {
        List<PurchGoods> PurchGoodsList = listByParentId02(purchId);
        return PurchGoodsFactory.PurchGoodsInfo(PurchGoodsList);
    }

    private List<PurchGoods> listByParentId02(Long purchId) {
        PurchGoodsExample example = new PurchGoodsExample();
        example.createCriteria().andPurchIdEqualTo(purchId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<PurchGoods> PurchGoodsList = purchGoodsMapper.selectByExample(example);
        if (PurchGoodsList == null) {
            PurchGoodsList = new ArrayList<>();
        }
        return PurchGoodsList;
    }
}

