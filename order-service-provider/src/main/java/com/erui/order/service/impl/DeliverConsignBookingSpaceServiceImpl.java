package com.erui.order.service.impl;

import com.erui.order.common.pojo.DeliverConsignBookingSpaceInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignBookingSpaceMapper;
import com.erui.order.model.entity.DeliverConsignBookingSpace;
import com.erui.order.model.entity.DeliverConsignBookingSpaceExample;
import com.erui.order.service.DeliverConsignBookingSpaceService;
import com.erui.order.service.util.DeliverConsignBookingSpaceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class DeliverConsignBookingSpaceServiceImpl implements DeliverConsignBookingSpaceService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignBookingSpaceServiceImpl.class);
    @Autowired
    private DeliverConsignBookingSpaceMapper deliverConsignBookingSpaceMapper;


    @Override
    public void insertOnDuplicateIdUpdate(Long deliverConsignId, DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo) throws Exception {
        if (deliverConsignId == null) {
            throw new Exception("采购合同ID错误");
        }
        Long id = deliverConsignBookingSpaceInfo.getId();
        if (id == null) {
            insert(deliverConsignId, deliverConsignBookingSpaceInfo);
        } else {
            // 更新操作
            updateById(id, deliverConsignBookingSpaceInfo);
        }
    }

    @Override
    public int insert(Long purchId, List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceList) {
        int insertNum = 0;
        for (DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo : DeliverConsignBookingSpaceList) {
            insertNum += insert(purchId, DeliverConsignBookingSpaceInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo) {
        DeliverConsignBookingSpace deliverConsignBookingSpace = DeliverConsignBookingSpaceFactory.DeliverConsignBookingSpace(DeliverConsignBookingSpaceInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        deliverConsignBookingSpace.setDeliverConsignId(purchId);
        if (userInfo != null) {
            deliverConsignBookingSpace.setCreateUserId(userInfo.getId());
        }
        deliverConsignBookingSpace.setCreateTime(new Date());
        deliverConsignBookingSpace.setDeleteFlag(Boolean.FALSE);
        return deliverConsignBookingSpaceMapper.insert(deliverConsignBookingSpace);
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
        DeliverConsignBookingSpaceExample example = new DeliverConsignBookingSpaceExample();
        example.createCriteria().andIdIn(idList);

        DeliverConsignBookingSpace DeliverConsignBookingSpaceSelective = new DeliverConsignBookingSpace();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            DeliverConsignBookingSpaceSelective.setUpdateUserId(userInfo.getId());
        }
        DeliverConsignBookingSpaceSelective.setDeleteFlag(Boolean.TRUE);
        DeliverConsignBookingSpaceSelective.setDeleteTime(new Date());

        deliverConsignBookingSpaceMapper.updateByExampleSelective(DeliverConsignBookingSpaceSelective, example);
    }

    @Override
    public int updateById(Long id, DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo) throws Exception {
        DeliverConsignBookingSpace DeliverConsignBookingSpace = deliverConsignBookingSpaceMapper.selectByPrimaryKey(id);
        if (DeliverConsignBookingSpace == null) {
            throw new Exception("采购合同商品不存在");
        }

        DeliverConsignBookingSpace contractGoods = DeliverConsignBookingSpaceFactory.DeliverConsignBookingSpace(DeliverConsignBookingSpaceInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return deliverConsignBookingSpaceMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public DeliverConsignBookingSpaceInfo selectByDeliverConsignId(Long deliverConsignId) {
        DeliverConsignBookingSpace deliverConsignBookingSpace = listByParentId02(deliverConsignId);
        return DeliverConsignBookingSpaceFactory.deliverConsignBookingSpaceInfo(deliverConsignBookingSpace);
    }

    private DeliverConsignBookingSpace listByParentId02(Long DeliverConsignId) {
        DeliverConsignBookingSpaceExample example = new DeliverConsignBookingSpaceExample();
        example.createCriteria().andDeliverConsignIdEqualTo(DeliverConsignId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsignBookingSpace> deliverConsignBookingSpaces = deliverConsignBookingSpaceMapper.selectByExample(example);
        if (deliverConsignBookingSpaces != null && deliverConsignBookingSpaces.size() > 0) {
            return deliverConsignBookingSpaces.get(0);
        }
        return null;
    }
}

