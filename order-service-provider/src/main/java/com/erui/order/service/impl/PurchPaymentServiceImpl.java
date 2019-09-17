package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchPaymentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchPaymentMapper;
import com.erui.order.model.entity.PurchPayment;
import com.erui.order.service.PurchPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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


    private PurchPayment purchPayment(Long purchId, PurchPaymentInfo purchPaymentInfo) {
        PurchPayment purchPayment = new PurchPayment();
        purchPayment.setId(purchPaymentInfo.getId());
        purchPayment.setPurchId(purchId);
        purchPayment.setPaymentType(purchPaymentInfo.getPaymentType());
        purchPayment.setMoney(purchPaymentInfo.getMoney());
        purchPayment.setDays(purchPaymentInfo.getDays());
        return purchPayment;
    }
}
