package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchContractGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchContractGoodsMapper;
import com.erui.order.model.entity.PurchContractGoods;
import com.erui.order.model.entity.PurchContractGoodsExample;
import com.erui.order.service.PurchContractGoodsService;
import com.erui.order.service.util.PurchContractGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchContractGoodsServiceImpl implements PurchContractGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchContractGoodsServiceImpl.class);
    @Autowired
    private PurchContractGoodsMapper purchContractGoodsMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long purchContractId, List<PurchContractGoodsInfo> purchContractGoodsList) throws Exception {
        if (purchContractId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<PurchContractGoods> purchContractGoodses = listByPurchContractId02(purchContractId);
        Set<Long> purchContractGoodsIds = purchContractGoodses.stream().map(PurchContractGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (PurchContractGoodsInfo purchContractGoodsInfo : purchContractGoodsList) {
            Long id = purchContractGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(purchContractId, purchContractGoodsInfo);
            } else if (purchContractGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, purchContractGoodsInfo);
            } else {
                // 抛出异常，不是给定业务附件
                throw new Exception("采购合同商品错误");
            }
        }

        if (purchContractGoodsIds.size() > 0) {
            delete(purchContractGoodsIds.toArray(new Long[purchContractGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long purchContractId, List<PurchContractGoodsInfo> purchContractGoodsList) {
        int insertNum = 0;
        for (PurchContractGoodsInfo purchContractGoodsInfo : purchContractGoodsList) {
            insertNum += insert(purchContractId, purchContractGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchContractId, PurchContractGoodsInfo purchContractGoodsInfo) {
        PurchContractGoods purchContractGoods = PurchContractGoodsFactory.purchContractGoods(purchContractGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        purchContractGoods.setPurchContractId(purchContractId);
        if (userInfo != null) {
            purchContractGoods.setCreateUserId(userInfo.getId());
        }
        purchContractGoods.setCreateTime(new Date());
        return purchContractGoodsMapper.insert(purchContractGoods);
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
        PurchContractGoodsExample example = new PurchContractGoodsExample();
        example.createCriteria().andIdIn(idList);

        PurchContractGoods purchContractGoodsSelective = new PurchContractGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        purchContractGoodsSelective.setDeleteFlag(Boolean.TRUE);
        purchContractGoodsSelective.setDeleteTime(new Date());

        purchContractGoodsMapper.updateByExampleSelective(purchContractGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, PurchContractGoodsInfo purchContractGoodsInfo) throws Exception {
        PurchContractGoods purchContractGoods = purchContractGoodsMapper.selectByPrimaryKey(id);
        if (purchContractGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        PurchContractGoods contractGoods = PurchContractGoodsFactory.purchContractGoods(purchContractGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return purchContractGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<PurchContractGoodsInfo> listByPurchContractId(Long purchContractId) {
        List<PurchContractGoods> purchContractGoodsList = listByPurchContractId02(purchContractId);
        return PurchContractGoodsFactory.purchContractGoodsInfo(purchContractGoodsList);
    }

    private List<PurchContractGoods> listByPurchContractId02(Long purchContractId) {
        PurchContractGoodsExample example = new PurchContractGoodsExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<PurchContractGoods> purchContractGoodsList = purchContractGoodsMapper.selectByExample(example);
        if (purchContractGoodsList == null) {
            purchContractGoodsList = new ArrayList<>();
        }
        return purchContractGoodsList;
    }
}
