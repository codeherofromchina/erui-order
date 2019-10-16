package com.erui.order.service.impl;

import com.erui.order.common.enums.PurchContractStatusEnum;
import com.erui.order.common.pojo.PurchContractGoodsInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchContractGoodsMapper;
import com.erui.order.mapper.PurchContractMapper;
import com.erui.order.model.entity.PurchContract;
import com.erui.order.model.entity.PurchContractGoods;
import com.erui.order.model.entity.PurchContractGoodsExample;
import com.erui.order.service.GoodsService;
import com.erui.order.service.PurchContractGoodsService;
import com.erui.order.service.PurchRequisitionGoodsService;
import com.erui.order.service.PurchRequisitionService;
import com.erui.order.service.util.PurchContractGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchContractGoodsServiceImpl implements PurchContractGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchContractGoodsServiceImpl.class);
    @Autowired
    private PurchContractGoodsMapper purchContractGoodsMapper;
    @Autowired
    private PurchContractMapper purchContractMapper;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private PurchRequisitionGoodsService purchRequisitionGoodsService;


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
    public int insert(Long purchContractId, List<PurchContractGoodsInfo> purchContractGoodsList) throws Exception {
        int insertNum = 0;
        for (PurchContractGoodsInfo purchContractGoodsInfo : purchContractGoodsList) {
            insertNum += insert(purchContractId, purchContractGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchContractId, PurchContractGoodsInfo purchContractGoodsInfo) throws Exception {
        PurchContract purchContract = purchContractMapper.selectByPrimaryKey(purchContractId);
        if (purchContract == null) {
            throw new Exception("采购合同不存在");
        }
        PurchContractGoods purchContractGoods = PurchContractGoodsFactory.purchContractGoods(purchContractGoodsInfo);

        purchContractGoods.setPurchContractId(purchContractId);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        purchContractGoods.setPurchContractId(purchContractId);
        if (userInfo != null) {
            purchContractGoods.setCreateUserId(userInfo.getId());
        }
        purchContractGoods.setNonTaxPrice(
                purchContractGoods.getPurchasePrice()
                        .multiply(new BigDecimal(100 - purchContract.getTaxPoint())
                                .divide(new BigDecimal("100", new MathContext(2, RoundingMode.HALF_EVEN)))));
        purchContractGoods.setPrePurchasedNum(0);
        purchContractGoods.setPurchasedNum(0);
        purchContractGoods.setCreateTime(new Date());
        purchContractGoods.setDeleteFlag(Boolean.FALSE);
        int insertNum = purchContractGoodsMapper.insert(purchContractGoods);

        // 设置订单商品的采购合同数量
        // 设置项目是否采购合同完成
        PurchContractStatusEnum purchContractStatusEnum = PurchContractStatusEnum.valueOf(purchContract.getPurchContractStatus());
        if (purchContractStatusEnum == null) {
            throw new Exception("采购合同状态错误");
        }
        boolean preFlag = (purchContractStatusEnum == PurchContractStatusEnum.READY);
        goodsService.updateOrderGoodsPurchContractNum(purchContractGoodsInfo.getPurchRequisitionGoodsId(), preFlag, purchContractGoodsInfo.getPurchaseNum());

        return insertNum;
    }


    /**
     * 删除采购合同商品
     * 设置附件的删除标志位为true
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) throws Exception {
        if (ids == null || ids.length == 0) {
            return;
        }
        List<Long> idList = Arrays.asList(ids);
        PurchContractGoodsExample example = new PurchContractGoodsExample();
        example.createCriteria().andIdIn(idList);

        // 删除采购合同商品的同时 更新商品的采购合同数量
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        List<PurchContractGoods> purchContractGoods = purchContractGoodsMapper.selectByExample(example);
        for (PurchContractGoods purchContractGood : purchContractGoods) {
            Integer purchaseNum = purchContractGood.getPurchaseNum();
            if (userInfo != null) {
                purchContractGood.setUpdateUserId(userInfo.getId());
            }
            purchContractGood.setDeleteFlag(Boolean.TRUE);
            purchContractGood.setDeleteTime(new Date());
            purchContractGoodsMapper.updateByPrimaryKey(purchContractGood);
            goodsService.updateOrderGoodsPurchContractNum(purchContractGood.getPurchRequisitionGoodsId(), true, -purchaseNum);
        }
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

        int updateNum = purchContractGoodsMapper.updateByPrimaryKeySelective(contractGoods);

        // 修正当前商品的采购合同数量 （删除原来数量，更新现在的数量）
        PurchContract purchContract = purchContractMapper.selectByPrimaryKey(purchContractGoods.getPurchContractId());
        if (purchContract == null) {
            throw new Exception("采购合同不存在");
        }
        PurchContractStatusEnum purchContractStatusEnum = PurchContractStatusEnum.valueOf(purchContract.getPurchContractStatus());
        if (purchContractStatusEnum == null) {
            throw new Exception("采购合同状态错误");
        }
        goodsService.updateOrderGoodsPurchContractNum(purchContractGoods.getPurchRequisitionGoodsId(), true, -purchContractGoods.getPurchaseNum());
        boolean preFlag = (purchContractStatusEnum == PurchContractStatusEnum.READY);
        goodsService.updateOrderGoodsPurchContractNum(purchContractGoodsInfo.getPurchRequisitionGoodsId(), preFlag, contractGoods.getPurchaseNum());
        return updateNum;
    }

    @Override
    public List<PurchContractGoodsInfo> listByPurchContractId(Long purchContractId) {
        List<PurchContractGoods> purchContractGoodsList = listByPurchContractId02(purchContractId);
        return PurchContractGoodsFactory.purchContractGoodsInfo(purchContractGoodsList);
    }

    @Override
    public PurchContractGoodsInfo findById(Long id) {
        PurchContractGoods purchContractGoods = purchContractGoodsMapper.selectByPrimaryKey(id);
        return PurchContractGoodsFactory.purchContractGoodsInfo(purchContractGoods);
    }


    @Override
    public void updatePurchasedNum(Long purchContractGoodsId, int preNum, int num) throws Exception {
        PurchContractGoods purchContractGoods = purchContractGoodsMapper.selectByPrimaryKey(purchContractGoodsId);
        if (purchContractGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        PurchContractGoods purchContractGoodsSelective = new PurchContractGoods();
        purchContractGoodsSelective.setId(purchContractGoodsId);
        purchContractGoodsSelective.setPrePurchasedNum(purchContractGoods.getPrePurchasedNum() + preNum);
        purchContractGoodsSelective.setPurchasedNum(purchContractGoods.getPurchasedNum() + num);
        purchContractGoodsMapper.updateByPrimaryKeySelective(purchContractGoodsSelective);
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
