package com.erui.order.service.impl;

import com.erui.order.common.pojo.InstockGoodsInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InstockGoodsMapper;
import com.erui.order.model.entity.InstockGoods;
import com.erui.order.model.entity.InstockGoodsExample;
import com.erui.order.service.InstockGoodsService;
import com.erui.order.service.util.InstockGoodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class InstockGoodsServiceImpl implements InstockGoodsService {
    private static Logger LOGGER = LoggerFactory.getLogger(InstockGoodsServiceImpl.class);
    @Autowired
    private InstockGoodsMapper instockGoodsMapper;


    @Override
    public int insertOnDuplicateIdUpdate(Long parentId, List<InstockGoodsInfo> InstockGoodsInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<InstockGoods> InstockGoodses = listByInstockId02(parentId);
        Set<Long> InstockGoodsIds = InstockGoodses.stream().map(InstockGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (InstockGoodsInfo InstockGoodsInfo : InstockGoodsInfos) {
            Long id = InstockGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(parentId, InstockGoodsInfo);
            } else if (InstockGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, InstockGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (InstockGoodsIds.size() > 0) {
            delete(InstockGoodsIds.toArray(new Long[InstockGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long InstockId, List<InstockGoodsInfo> InstockGoodsList) {
        int insertNum = 0;
        for (InstockGoodsInfo InstockGoodsInfo : InstockGoodsList) {
            insertNum += insert(InstockId, InstockGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long InstockId, InstockGoodsInfo InstockGoodsInfo) {
        InstockGoods InstockGoods = InstockGoodsFactory.InstockGoods(InstockGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InstockGoods.setInstockId(InstockId);
        if (userInfo != null) {
            InstockGoods.setCreateUserId(userInfo.getId());
        }
        InstockGoods.setCreateTime(new Date());
        return instockGoodsMapper.insert(InstockGoods);
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
        InstockGoodsExample example = new InstockGoodsExample();
        example.createCriteria().andIdIn(idList);

        InstockGoods InstockGoodsSelective = new InstockGoods();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            InstockGoodsSelective.setUpdateUserId(userInfo.getId());
        }
        InstockGoodsSelective.setDeleteFlag(Boolean.TRUE);
        InstockGoodsSelective.setDeleteTime(new Date());

        instockGoodsMapper.updateByExampleSelective(InstockGoodsSelective, example);
    }

    @Override
    public int updateById(Long id, InstockGoodsInfo InstockGoodsInfo) throws Exception {
        InstockGoods InstockGoods = instockGoodsMapper.selectByPrimaryKey(id);
        if (InstockGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        InstockGoods contractGoods = InstockGoodsFactory.InstockGoods(InstockGoodsInfo);
        contractGoods.setId(id);
        contractGoods.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            contractGoods.setUpdateUserId(userInfo.getId());
        }

        return instockGoodsMapper.updateByPrimaryKeySelective(contractGoods);
    }

    @Override
    public List<InstockGoodsInfo> listByInstockId(Long instockId) {
        List<InstockGoods> InstockGoodsList = listByInstockId02(instockId);
        return InstockGoodsFactory.InstockGoodsInfo(InstockGoodsList);
    }

    private List<InstockGoods> listByInstockId02(Long InstockId) {
        InstockGoodsExample example = new InstockGoodsExample();
        example.createCriteria().andInstockIdEqualTo(InstockId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<InstockGoods> InstockGoodsList = instockGoodsMapper.selectByExample(example);
        if (InstockGoodsList == null) {
            InstockGoodsList = new ArrayList<>();
        }
        return InstockGoodsList;
    }
}

