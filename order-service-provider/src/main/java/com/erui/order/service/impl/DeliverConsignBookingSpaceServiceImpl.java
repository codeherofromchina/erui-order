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
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverConsignBookingSpaceServiceImpl implements DeliverConsignBookingSpaceService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignBookingSpaceServiceImpl.class);
    @Autowired
    private DeliverConsignBookingSpaceMapper DeliverConsignBookingSpaceMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<DeliverConsignBookingSpace> DeliverConsignBookingSpacees = listByParentId02(parentId);
        Set<Long> DeliverConsignBookingSpaceIds = DeliverConsignBookingSpacees.stream().map(DeliverConsignBookingSpace::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo : DeliverConsignBookingSpaceInfos) {
            Long id = DeliverConsignBookingSpaceInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, DeliverConsignBookingSpaceInfo);
            } else if (DeliverConsignBookingSpaceIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, DeliverConsignBookingSpaceInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (DeliverConsignBookingSpaceIds.size() > 0) {
            delete(DeliverConsignBookingSpaceIds.toArray(new Long[DeliverConsignBookingSpaceIds.size()]));
        }
        return updateNum;


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
        DeliverConsignBookingSpace DeliverConsignBookingSpace = DeliverConsignBookingSpaceFactory.DeliverConsignBookingSpace(DeliverConsignBookingSpaceInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsignBookingSpace.setDeliverConsignId(purchId);
        if (userInfo != null) {
            DeliverConsignBookingSpace.setCreateUserId(userInfo.getId());
        }
        DeliverConsignBookingSpace.setCreateTime(new Date());
        return DeliverConsignBookingSpaceMapper.insert(DeliverConsignBookingSpace);
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

        DeliverConsignBookingSpaceMapper.updateByExampleSelective(DeliverConsignBookingSpaceSelective, example);
    }

    @Override
    public int updateById(Long id, DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo) throws Exception {
        DeliverConsignBookingSpace DeliverConsignBookingSpace = DeliverConsignBookingSpaceMapper.selectByPrimaryKey(id);
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

        return DeliverConsignBookingSpaceMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<DeliverConsignBookingSpaceInfo> listByDeliverConsignId(Long deliverConsignId) {
        List<DeliverConsignBookingSpace> DeliverConsignBookingSpaceList = listByParentId02(deliverConsignId);
        return DeliverConsignBookingSpaceFactory.DeliverConsignBookingSpaceInfo(DeliverConsignBookingSpaceList);
    }

    private List<DeliverConsignBookingSpace> listByParentId02(Long DeliverConsignId) {
        DeliverConsignBookingSpaceExample example = new DeliverConsignBookingSpaceExample();
        example.createCriteria().andDeliverConsignIdEqualTo(DeliverConsignId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsignBookingSpace> DeliverConsignBookingSpaceList = DeliverConsignBookingSpaceMapper.selectByExample(example);
        if (DeliverConsignBookingSpaceList == null) {
            DeliverConsignBookingSpaceList = new ArrayList<>();
        }
        return DeliverConsignBookingSpaceList;
    }
}

