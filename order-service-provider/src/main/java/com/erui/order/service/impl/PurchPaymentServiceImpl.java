package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchPaymentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchPaymentMapper;
import com.erui.order.model.entity.PurchPayment;
import com.erui.order.model.entity.PurchPaymentExample;
import com.erui.order.service.PurchPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/17 下午3:23
 */
@Service
public class PurchPaymentServiceImpl implements PurchPaymentService {
    @Autowired
    private PurchPaymentMapper purchPaymentMapper;

    @Override
    public int insert(Long purchId, List<PurchPaymentInfo> purchPayments) {
        int insertNum = 0;
        for (PurchPaymentInfo purchPaymentInfo : purchPayments) {
            insertNum += insert(purchId, purchPaymentInfo);
        }
        return insertNum;
    }


    @Override
    public int insert(Long purchId, PurchPaymentInfo purchPaymentInfo) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        PurchPayment purchPayment = purchPayment(purchId, purchPaymentInfo);
        purchPayment.setCreateUserId(userInfo.getId());
        purchPayment.setCreateTime(new Date());
        purchPayment.setDeleteFlag(Boolean.FALSE);
        return purchPaymentMapper.insert(purchPayment);
    }

    @Override
    public int insertOnDuplicateIdUpdate(Long purchId, List<PurchPaymentInfo> purchPayments) throws Exception {
        if (purchId == null) {
            throw new Exception("采购单ID错误");
        }
        List<PurchPayment> purchPaymentList = listByParentId02(purchId);
        Set<Long> purchPaymentIdList = purchPaymentList.stream().map(PurchPayment::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (PurchPaymentInfo purchPayment : purchPayments) {
            Long id = purchPayment.getId();
            if (id == null) {
                updateNum += insert(purchId, purchPayment);
            } else if (purchPaymentIdList.remove(id)) {
                // 更新操作
                updateNum += updateById(id, purchPayment);
            } else {
                // 抛出异常，不是给定业务数据
                throw new Exception("采购合同商品错误");
            }
        }

        if (purchPaymentIdList.size() > 0) {
            delete(purchPaymentIdList.toArray(new Long[purchPaymentIdList.size()]));
        }
        return updateNum;
    }

    private PurchPayment purchPayment(Long purchId, PurchPaymentInfo purchPaymentInfo) {
        PurchPayment purchPayment = new PurchPayment();
        purchPayment.setId(purchPaymentInfo.getId());
        purchPayment.setPurchId(purchId);
        purchPayment.setPaymentType(purchPaymentInfo.getPaymentType());
        purchPayment.setMoney(purchPaymentInfo.getMoney());
        purchPayment.setDays(purchPaymentInfo.getDays());
        return purchPayment;
    }


    /**
     * 删除采购付款内容
     * 设置删除标志位为true
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) {
        if (ids == null || ids.length == 0) {
            return;
        }
        List<Long> idList = Arrays.asList(ids);
        PurchPaymentExample example = new PurchPaymentExample();
        example.createCriteria().andIdIn(idList);

        PurchPayment purchPaymentSelective = new PurchPayment();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchPaymentSelective.setUpdateUserId(userInfo.getId());
        }
        purchPaymentSelective.setDeleteFlag(Boolean.TRUE);
        purchPaymentSelective.setDeleteTime(new Date());

        purchPaymentMapper.updateByExampleSelective(purchPaymentSelective, example);
    }

    @Override
    public List<PurchPaymentInfo> list(Long purchId) {
        List<PurchPayment> purchPayments = listByParentId02(purchId);
        List<PurchPaymentInfo> list = new ArrayList<>();
        for (PurchPayment purchPayment : purchPayments) {
            PurchPaymentInfo purchPaymentInfo = new PurchPaymentInfo();
            purchPaymentInfo.setId(purchPayment.getId());
            purchPaymentInfo.setPaymentType(purchPayment.getPaymentType());
            purchPaymentInfo.setMoney(purchPayment.getMoney());
            purchPaymentInfo.setDays(purchPayment.getDays());
            list.add(purchPaymentInfo);
        }

        return list;

    }

    public int updateById(Long id, PurchPaymentInfo purchPaymentInfo) throws Exception {
        PurchPayment purchPayment = purchPaymentMapper.selectByPrimaryKey(id);
        if (purchPayment == null) {
            throw new Exception("采购付款信息不存在");
        }

        PurchPayment purchPaymentSelective = new PurchPayment();
        purchPaymentSelective.setId(id);
        purchPaymentSelective.setPaymentType(purchPaymentInfo.getPaymentType());
        purchPaymentSelective.setDays(purchPaymentInfo.getDays());
        purchPaymentSelective.setMoney(purchPaymentInfo.getMoney());

        purchPaymentSelective.setId(id);
        purchPaymentSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchPaymentSelective.setUpdateUserId(userInfo.getId());
        }

        return purchPaymentMapper.updateByPrimaryKeySelective(purchPaymentSelective);
    }

    private List<PurchPayment> listByParentId02(Long purchId) {
        PurchPaymentExample example = new PurchPaymentExample();
        example.createCriteria().andPurchIdEqualTo(purchId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<PurchPayment> purchPayments = purchPaymentMapper.selectByExample(example);
        if (purchPayments == null) {
            purchPayments = new ArrayList<>();
        }
        return purchPayments;
    }
}
