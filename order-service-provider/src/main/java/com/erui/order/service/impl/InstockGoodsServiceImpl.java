package com.erui.order.service.impl;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
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
    public int update(Long parentId, List<InstockGoodsInfo> InstockGoodsInfos) throws Exception {
        if (parentId == null) {
            throw new Exception("采购合同ID错误");
        }
        List<InstockGoods> instockGoods = listByInstockId02(parentId);
        Set<Long> instockGoodsIds = instockGoods.stream().map(InstockGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (InstockGoodsInfo instockGoodsInfo : InstockGoodsInfos) {
            Long id = instockGoodsInfo.getId();
            if (id == null) {
                throw new Exception("商品标识不存在");
            } else if (instockGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, instockGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (instockGoodsIds.size() > 0) {
            delete(instockGoodsIds.toArray(new Long[instockGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long instockId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos) {
        int insertNum = 0;
        for (InspectApplyGoodsInfo applyGoodsInfo : inspectApplyGoodsInfos) {
            insertNum += insert(instockId, applyGoodsInfo);
        }
        return insertNum;
    }


    private int insert(Long instockId, InspectApplyGoodsInfo inspectApplyGoodsInfo) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InstockGoods instockGoods = new InstockGoods();
        instockGoods.setInstockId(instockId);
        instockGoods.setOrderGoodsId(inspectApplyGoodsInfo.getOrderGoodsId());
        instockGoods.setInspectApplyGoodsId(inspectApplyGoodsInfo.getId());
        instockGoods.setInstockNum(inspectApplyGoodsInfo.getInspectNum() - inspectApplyGoodsInfo.getUnqualified()); // 入库数量
        instockGoods.setCreateTime(new Date());

        instockGoods.setCreateUserId(userInfo.getId());
        instockGoods.setDeleteFlag(Boolean.FALSE);

        return instockGoodsMapper.insert(instockGoods);
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
    public int updateById(Long id, InstockGoodsInfo instockGoodsInfo) throws Exception {
        InstockGoods instockGoods = instockGoodsMapper.selectByPrimaryKey(id);
        if (instockGoods == null) {
            throw new Exception("采购合同商品不存在");
        }

        InstockGoods instockGoodsSelective = InstockGoodsFactory.instockGoods(instockGoodsInfo);
        instockGoodsSelective.setId(id);
        instockGoodsSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            instockGoodsSelective.setUpdateUserId(userInfo.getId());
        }

        return instockGoodsMapper.updateByPrimaryKeySelective(instockGoodsSelective);
    }

    @Override
    public List<InstockGoodsInfo> listByInstockId(Long instockId) {
        List<InstockGoods> instockGoods = listByInstockId02(instockId);
        return InstockGoodsFactory.instockGoodsInfo(instockGoods);
    }

    private List<InstockGoods> listByInstockId02(Long instockId) {
        InstockGoodsExample example = new InstockGoodsExample();
        example.createCriteria().andInstockIdEqualTo(instockId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<InstockGoods> instockGoods = instockGoodsMapper.selectByExample(example);
        if (instockGoods == null) {
            instockGoods = new ArrayList<>();
        }
        return instockGoods;
    }
}

