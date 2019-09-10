package com.erui.order.service.impl;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InspectApplyGoodsMapper;
import com.erui.order.model.entity.InspectApplyGoods;
import com.erui.order.model.entity.InspectApplyGoodsExample;
import com.erui.order.service.InspectApplyGoodsService;
import com.erui.order.service.util.InspectApplyGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class InspectApplyGoodsServiceImpl implements InspectApplyGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(InspectApplyGoodsServiceImpl.class);
    @Autowired
    private InspectApplyGoodsMapper inspectApplyGoodsMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<InspectApplyGoodsInfo> InspectApplyGoodsInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<InspectApplyGoods> InspectApplyGoodses = listByInspectApplyId02(parentId);
        Set<Long> InspectApplyGoodsIds = InspectApplyGoodses.stream().map(InspectApplyGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (InspectApplyGoodsInfo InspectApplyGoodsInfo : InspectApplyGoodsInfos) {
            Long id = InspectApplyGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, InspectApplyGoodsInfo);
            } else if (InspectApplyGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, InspectApplyGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (InspectApplyGoodsIds.size() > 0) {
            delete(InspectApplyGoodsIds.toArray(new Long[InspectApplyGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long InspectApplyId, List<InspectApplyGoodsInfo> InspectApplyGoodsList) {
        int insertNum = 0;
        for (InspectApplyGoodsInfo InspectApplyGoodsInfo : InspectApplyGoodsList) {
            insertNum += insert(InspectApplyId, InspectApplyGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long InspectApplyId, InspectApplyGoodsInfo InspectApplyGoodsInfo) {
        InspectApplyGoods InspectApplyGoods = InspectApplyGoodsFactory.InspectApplyGoods(InspectApplyGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectApplyGoods.setId(InspectApplyId);
        if (userInfo != null) {
            InspectApplyGoods.setCreateUserId(userInfo.getId());
        }
        InspectApplyGoods.setCreateTime(new Date());
        return inspectApplyGoodsMapper.insert(InspectApplyGoods);
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
        InspectApplyGoodsExample example = new InspectApplyGoodsExample();
        example.createCriteria().andIdIn(idList);

        InspectApplyGoods InspectApplyGoodsSelective = new InspectApplyGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            InspectApplyGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        InspectApplyGoodsSelective.setDeleteFlag(Boolean.TRUE);
        InspectApplyGoodsSelective.setDeleteTime(new Date());

        inspectApplyGoodsMapper.updateByExampleSelective(InspectApplyGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, InspectApplyGoodsInfo InspectApplyGoodsInfo) throws Exception {
        InspectApplyGoods InspectApplyGoods = inspectApplyGoodsMapper.selectByPrimaryKey(id);
        if (InspectApplyGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        InspectApplyGoods contractGoods = InspectApplyGoodsFactory.InspectApplyGoods(InspectApplyGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return inspectApplyGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<InspectApplyGoodsInfo> listByInspectApplyId(Long inspectApplyId) {
        List<InspectApplyGoods> InspectApplyGoodsList = listByInspectApplyId02(inspectApplyId);
        return InspectApplyGoodsFactory.InspectApplyGoodsInfo(InspectApplyGoodsList);
    }

    private List<InspectApplyGoods> listByInspectApplyId02(Long InspectApplyId) {
        InspectApplyGoodsExample example = new InspectApplyGoodsExample();
        example.createCriteria().andInspectApplyIdEqualTo(InspectApplyId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<InspectApplyGoods> InspectApplyGoodsList = inspectApplyGoodsMapper.selectByExample(example);
        if (InspectApplyGoodsList == null) {
            InspectApplyGoodsList = new ArrayList<>();
        }
        return InspectApplyGoodsList;
    }
}

