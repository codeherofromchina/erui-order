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
    public int insertOnDuplicateIdUpdate(Long deliverConsignId, List<DeliverConsignPaymentInfo> deliverConsignPaymentInfos) throws Exception {
        if (deliverConsignId == null) {
            throw new Exception("订舱ID错误");
        }
        List<DeliverConsignPayment> deliverConsignPaymentList = listByDeliverConsignId02(deliverConsignId);
        Set<Long> deliverConsignPaymentIds = deliverConsignPaymentList.stream().map(DeliverConsignPayment::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (DeliverConsignPaymentInfo deliverConsignPaymentInfo : deliverConsignPaymentInfos) {
            Long id = deliverConsignPaymentInfo.getId();
            if (id == null) {
                updateNum += insert(deliverConsignId, deliverConsignPaymentInfo);
            } else if (deliverConsignPaymentIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, deliverConsignPaymentInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (deliverConsignPaymentIds.size() > 0) {
            delete(deliverConsignPaymentIds.toArray(new Long[deliverConsignPaymentIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long deliverConsignId, List<DeliverConsignPaymentInfo> DeliverConsignPaymentList) {
        int insertNum = 0;
        for (DeliverConsignPaymentInfo deliverConsignPaymentInfo : DeliverConsignPaymentList) {
            insertNum += insert(deliverConsignId, deliverConsignPaymentInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long deliverConsignId, DeliverConsignPaymentInfo deliverConsignPaymentInfo) {
        DeliverConsignPayment deliverConsignPayment = DeliverConsignPaymentFactory.deliverConsignPayment(deliverConsignPaymentInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        deliverConsignPayment.setDeliverConsignId(deliverConsignId);
        if (userInfo != null) {
            deliverConsignPayment.setCreateUserId(userInfo.getId());
        }
        deliverConsignPayment.setCreateTime(new Date());
        deliverConsignPayment.setDeleteFlag(Boolean.FALSE);
        return deliverConsignPaymentMapper.insert(deliverConsignPayment);
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
    public int updateById(Long id, DeliverConsignPaymentInfo deliverConsignPaymentInfo) throws Exception {
        DeliverConsignPayment deliverConsignPayment = deliverConsignPaymentMapper.selectByPrimaryKey(id);
        if (deliverConsignPayment == null) {
            throw new Exception("订舱付款不存在");
        }

        DeliverConsignPayment deliverConsignPaymentSelective = DeliverConsignPaymentFactory.deliverConsignPayment(deliverConsignPaymentInfo);
        deliverConsignPaymentSelective.setId(id);
        deliverConsignPaymentSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            deliverConsignPaymentSelective.setUpdateUserId(userInfo.getId());
        }

        return deliverConsignPaymentMapper.updateByPrimaryKeySelective(deliverConsignPaymentSelective);
    }

    @Override
    public List<DeliverConsignPaymentInfo> listByDeliverConsignId(Long deliverConsignId) {
        List<DeliverConsignPayment> DeliverConsignPaymentList = listByDeliverConsignId02(deliverConsignId);
        return DeliverConsignPaymentFactory.deliverConsignPaymentInfo(DeliverConsignPaymentList);
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

