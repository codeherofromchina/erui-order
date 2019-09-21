package com.erui.order.service.impl;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
import com.erui.order.common.pojo.InspectReportGoodsInfo;
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
    public int insertOnDuplicateIdUpdate(Long inspectApplyId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos) throws Exception {
        if (inspectApplyId == null) {
            throw new Exception("报检单ID错误");
        }
        List<InspectApplyGoods> inspectApplyGoods = listByInspectApplyId02(inspectApplyId);
        Set<Long> inspectApplyGoodsIds = inspectApplyGoods.stream().map(InspectApplyGoods::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (InspectApplyGoodsInfo inspectApplyGoodsInfo : inspectApplyGoodsInfos) {
            Long id = inspectApplyGoodsInfo.getId();
            if (id == null) {
                updateNum += insert(inspectApplyId, inspectApplyGoodsInfo);
            } else if (inspectApplyGoodsIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, inspectApplyGoodsInfo);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("报检单商品错误");
            }
        }

        if (inspectApplyGoodsIds.size() > 0) {
            delete(inspectApplyGoodsIds.toArray(new Long[inspectApplyGoodsIds.size()]));
        }
        return updateNum;


    }

    @Override
    public int insert(Long inspectApplyId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos) {
        int insertNum = 0;
        for (InspectApplyGoodsInfo inspectApplyGoodsInfo : inspectApplyGoodsInfos) {
            insertNum += insert(inspectApplyId, inspectApplyGoodsInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long inspectApplyId, InspectApplyGoodsInfo inspectApplyGoodsInfo) {
        InspectApplyGoods inspectApplyGoods = InspectApplyGoodsFactory.inspectApplyGoods(inspectApplyGoodsInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        inspectApplyGoods.setInspectApplyId(inspectApplyId);
        if (userInfo != null) {
            inspectApplyGoods.setCreateUserId(userInfo.getId());
        }
        inspectApplyGoods.setCreateTime(new Date());
        inspectApplyGoods.setDeleteFlag(Boolean.FALSE);
        return inspectApplyGoodsMapper.insert(inspectApplyGoods);
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
    public int updateById(Long id, InspectApplyGoodsInfo inspectApplyGoodsInfo) throws Exception {
        InspectApplyGoods inspectApplyGoods = inspectApplyGoodsMapper.selectByPrimaryKey(id);
        if (inspectApplyGoods == null) {
            throw new Exception("报检单商品不存在");
        }

        InspectApplyGoods contractGoods = InspectApplyGoodsFactory.inspectApplyGoods(inspectApplyGoodsInfo);
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
        List<InspectApplyGoods> inspectApplyGoodsInfos = listByInspectApplyId02(inspectApplyId);
        return InspectApplyGoodsFactory.inspectApplyGoodsInfo(inspectApplyGoodsInfos);
    }


    @Override
    public List<InspectApplyGoodsInfo> listByInpsectReportId(Long inspectReportId) {
        List<InspectApplyGoods> inspectApplyGoodsInfos = listByInpsectReportId02(inspectReportId);
        return InspectApplyGoodsFactory.inspectApplyGoodsInfo(inspectApplyGoodsInfos);
    }

    private List<InspectApplyGoods> listByInspectApplyId02(Long inspectApplyId) {
        InspectApplyGoodsExample example = new InspectApplyGoodsExample();
        example.createCriteria().andInspectApplyIdEqualTo(inspectApplyId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<InspectApplyGoods> inspectApplyGoods = inspectApplyGoodsMapper.selectByExample(example);
        if (inspectApplyGoods == null) {
            inspectApplyGoods = new ArrayList<>();
        }
        return inspectApplyGoods;
    }


    private List<InspectApplyGoods> listByInpsectReportId02(Long inspectReportId) {
        InspectApplyGoodsExample example = new InspectApplyGoodsExample();
        example.createCriteria().andInspectReportIdEqualTo(inspectReportId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<InspectApplyGoods> inspectApplyGoods = inspectApplyGoodsMapper.selectByExample(example);
        if (inspectApplyGoods == null) {
            inspectApplyGoods = new ArrayList<>();
        }
        return inspectApplyGoods;
    }


    @Override
    public void updateByInspectReportId(Long inspectReportId, List<InspectReportGoodsInfo> inspectReportGoodsInfos) throws Exception {
        if (inspectReportId == null) {
            throw new Exception("质检单ID错误");
        }
        List<InspectApplyGoods> inspectApplyGoodsList = listByInpsectReportId02(inspectReportId);
        Map<Long, InspectApplyGoods> inspectApplyGoodsIdMap = inspectApplyGoodsList.stream()
                .collect(Collectors.toMap(InspectApplyGoods::getId, vo -> vo));

        for (InspectReportGoodsInfo inspectReportGoodsInfo : inspectReportGoodsInfos) {
            Long id = inspectReportGoodsInfo.getId();
            InspectApplyGoods inspectApplyGoods = inspectApplyGoodsIdMap.remove(id);
            if (inspectApplyGoods == null) {
                throw new Exception("商品信息不正确");
            }
            inspectApplyGoods.setSamples(inspectReportGoodsInfo.getSamples());
            inspectApplyGoods.setUnqualified(inspectReportGoodsInfo.getUnqualified());
            inspectApplyGoods.setUnqualifiedDesc(inspectReportGoodsInfo.getUnqualifiedDesc());
            inspectApplyGoods.setUnqualifiedType(inspectReportGoodsInfo.getUnqualifiedType());
            inspectApplyGoodsMapper.updateByPrimaryKey(inspectApplyGoods);
        }
        if (inspectApplyGoodsIdMap.size() > 0) {
            throw new Exception("商品不匹配");
        }
    }

    @Override
    public InspectApplyGoodsInfo findById(Long id) {
        InspectApplyGoods inspectApplyGoods = inspectApplyGoodsMapper.selectByPrimaryKey(id);
        return InspectApplyGoodsFactory.inspectApplyGoodsInfo(inspectApplyGoods);
    }
}

