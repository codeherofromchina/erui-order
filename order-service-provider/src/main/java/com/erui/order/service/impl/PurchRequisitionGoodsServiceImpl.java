package com.erui.order.service.impl;

import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.OrderGoods;
import com.erui.order.model.entity.OrderGoodsExample;
import com.erui.order.model.entity.PurchRequisitionGoods;
import com.erui.order.model.entity.PurchRequisitionGoodsExample;
import com.erui.order.service.PurchRequisitionGoodsService;
import com.erui.order.service.util.OrderGoodsFactory;
import com.erui.order.service.util.PurchRequisitionGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.PurchRequisitionGoodsMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchRequisitionGoodsServiceImpl implements PurchRequisitionGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchRequisitionGoodsServiceImpl.class);
    @Autowired
    private PurchRequisitionGoodsMapper purchRequisitionGoodsMapper;

    @Override
    public void update(Long purchRequisitionId, List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos) throws Exception {
        if (purchRequisitionId == null) {
            throw new Exception("采购申请ID错误");
        }
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        List<PurchRequisitionGoods> purchRequisitionGoodsList = listByPurchRequisitionId(purchRequisitionId);
        Set<Long> purchRequisitionGoodsIds = purchRequisitionGoodsList.stream().map(PurchRequisitionGoods::getId).collect(Collectors.toSet());

        for (PurchRequisitionGoodsInfo purchRequisitionGoodsInfo : purchRequisitionGoodsInfos) {
            Long id = purchRequisitionGoodsInfo.getId();
            if (purchRequisitionGoodsIds.contains(id)) {
                PurchRequisitionGoods purchRequisitionGoodsSelective = PurchRequisitionGoodsFactory.purchRequisitionGoods(purchRequisitionGoodsInfo);
                purchRequisitionGoodsSelective.setId(id);
                purchRequisitionGoodsSelective.setOrderGoodsId(null);
                purchRequisitionGoodsSelective.setUpdateTime(new Date());
                purchRequisitionGoodsSelective.setUpdateUserId(userInfo.getId());

                // 更新操作
                purchRequisitionGoodsMapper.updateByPrimaryKeySelective(purchRequisitionGoodsSelective);

                purchRequisitionGoodsIds.remove(id);
            } else {
                // 抛出异常，不是给定业务附件
                throw new Exception("采购申请商品错误");
            }
        }

        if (purchRequisitionGoodsIds.size() > 0) {
            throw new Exception("采购申请商品数量不正确");
        }
    }

    @Override
    public int insert(Long purchRequisitionId, List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos) {
        int insertNum = 0;
        for (PurchRequisitionGoodsInfo purchRequisitionGoodsInfo : purchRequisitionGoodsInfos) {
            insertNum += insert(purchRequisitionId, purchRequisitionGoodsInfo);
        }
        return insertNum;
    }

    @Override
    public int insert(Long purchRequisitionId, PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        PurchRequisitionGoods purchRequisitionGoods = PurchRequisitionGoodsFactory.purchRequisitionGoods(purchRequisitionGoodsInfo);
        purchRequisitionGoods.setPurchRequisitionId(purchRequisitionId);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchRequisitionGoods.setCreateUserId(userInfo.getId());
        }
        purchRequisitionGoods.setCreateTime(new Date());
        return purchRequisitionGoodsMapper.insert(purchRequisitionGoods);
    }

    @Override
    public List<PurchRequisitionGoodsInfo> list(Long purchRequisitionId) {
        List<PurchRequisitionGoods> purchRequisitionGoodsList = listByPurchRequisitionId(purchRequisitionId);

        List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos = PurchRequisitionGoodsFactory.purchRequisitionGoodsInfos(purchRequisitionGoodsList);
        if (purchRequisitionGoodsInfos == null) {
            purchRequisitionGoodsInfos = new ArrayList<>();
        }
        return purchRequisitionGoodsInfos;
    }


    private List<PurchRequisitionGoods> listByPurchRequisitionId(Long purchRequisitionId) {
        PurchRequisitionGoodsExample example = new PurchRequisitionGoodsExample();
        example.createCriteria().andPurchRequisitionIdEqualTo(purchRequisitionId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<PurchRequisitionGoods> purchRequisitionGoods = purchRequisitionGoodsMapper.selectByExample(example);
        if (purchRequisitionGoods == null) {
            purchRequisitionGoods = new ArrayList<>();
        }
        return purchRequisitionGoods;
    }
}
