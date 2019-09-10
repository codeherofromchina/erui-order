package com.erui.order.service.impl;

import com.erui.order.common.pojo.DeliverConsignPaymentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignPaymentMapper;
import com.erui.order.model.entity.DeliverConsignPayment;
import com.erui.order.model.entity.DeliverConsignPaymentExample;
import com.erui.order.service.DeliverConsignPaymentService;
import com.erui.order.service.util.DeliverConsignPaymentFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverConsignPaymentServiceImpl implements DeliverConsignPaymentService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignPaymentServiceImpl.class);
    @Autowired
    private DeliverConsignPaymentMapper deliverConsignPaymentMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<DeliverConsignPaymentInfo> DeliverConsignPaymentInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<DeliverConsignPayment> DeliverConsignPaymentes = listByDeliverConsignId02(parentId);
        Set<Long> DeliverConsignPaymentIds = DeliverConsignPaymentes.stream().map(DeliverConsignPayment::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (DeliverConsignPaymentInfo DeliverConsignPaymentInfo : DeliverConsignPaymentInfos) {
            Long id = DeliverConsignPaymentInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, DeliverConsignPaymentInfo);
            } else if (DeliverConsignPaymentIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, DeliverConsignPaymentInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (DeliverConsignPaymentIds.size() > 0) {
            delete(DeliverConsignPaymentIds.toArray(new Long[DeliverConsignPaymentIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long purchId, List<DeliverConsignPaymentInfo> DeliverConsignPaymentList) {
        int insertNum = 0;
        for (DeliverConsignPaymentInfo DeliverConsignPaymentInfo : DeliverConsignPaymentList) {
            insertNum += insert(purchId, DeliverConsignPaymentInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, DeliverConsignPaymentInfo DeliverConsignPaymentInfo) {
        DeliverConsignPayment DeliverConsignPayment = DeliverConsignPaymentFactory.DeliverConsignPayment(DeliverConsignPaymentInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsignPayment.setDeliverConsignId(purchId);
        if (userInfo != null) {
            DeliverConsignPayment.setCreateUserId(userInfo.getId());
        }
        DeliverConsignPayment.setCreateTime(new Date());
        return deliverConsignPaymentMapper.insert(DeliverConsignPayment);
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
        DeliverConsignPaymentExample example = new DeliverConsignPaymentExample();
        example.createCriteria().andIdIn(idList);

        DeliverConsignPayment DeliverConsignPaymentSelective = new DeliverConsignPayment();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            DeliverConsignPaymentSelective.setUpdateUserId(userInfo.getId());
        }
        DeliverConsignPaymentSelective.setDeleteFlag(Boolean.TRUE);
        DeliverConsignPaymentSelective.setDeleteTime(new Date());

        deliverConsignPaymentMapper.updateByExampleSelective(DeliverConsignPaymentSelective, example);
    }

    @Override
    public int updateById(Long id, DeliverConsignPaymentInfo DeliverConsignPaymentInfo) throws Exception {
        DeliverConsignPayment DeliverConsignPayment = deliverConsignPaymentMapper.selectByPrimaryKey(id);
        if (DeliverConsignPayment == null) {
            throw new Exception("采购合同商品不存在");
        }

        DeliverConsignPayment contractGoods = DeliverConsignPaymentFactory.DeliverConsignPayment(DeliverConsignPaymentInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return deliverConsignPaymentMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<DeliverConsignPaymentInfo> listByDeliverConsignId(Long deliverConsignId) {
        List<DeliverConsignPayment> DeliverConsignPaymentList = listByDeliverConsignId02(deliverConsignId);
        return DeliverConsignPaymentFactory.DeliverConsignPaymentInfo(DeliverConsignPaymentList);
    }

    private List<DeliverConsignPayment> listByDeliverConsignId02(Long deliverConsignId) {
        DeliverConsignPaymentExample example = new DeliverConsignPaymentExample();
        example.createCriteria().andDeliverConsignIdEqualTo(deliverConsignId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsignPayment> DeliverConsignPaymentList = deliverConsignPaymentMapper.selectByExample(example);
        if (DeliverConsignPaymentList == null) {
            DeliverConsignPaymentList = new ArrayList<>();
        }
        return DeliverConsignPaymentList;
    }
}

