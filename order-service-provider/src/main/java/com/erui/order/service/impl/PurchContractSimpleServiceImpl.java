package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchContractAdditionSimpleInfo;
import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.PurchContractSimple;
import com.erui.order.model.entity.PurchContractSimpleExample;
import com.erui.order.model.entity.PurchContractStandard;
import com.erui.order.model.entity.PurchContractStandardExample;
import com.erui.order.service.PurchContractSimpleService;
import com.erui.order.service.util.PurchContractSimpleFactory;
import com.erui.order.service.util.PurchContractStandardFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.PurchContractSimpleMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PurchContractSimpleServiceImpl implements PurchContractSimpleService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchContractSimpleServiceImpl.class);
    @Autowired
    private PurchContractSimpleMapper purchContractSimpleMapper;


    @Override
    public Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception {
        if (purchContractId == null) {
            throw new Exception("采购合同标识错误");
        }
        PurchContractSimple purchContractSimple = findByPurchContractId02(purchContractId);
        Long id = null;
        if (purchContractSimple == null) {
            id = insert(purchContractId, purchContractAdditionSimpleInfo);
        } else {
            // 更新操作
            id = purchContractSimple.getId();
            updateByPurchContractId(purchContractId, purchContractAdditionSimpleInfo);
        }
        return id;
    }

    @Override
    public Long insert(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception {
        PurchContractSimple purchContractSimple = PurchContractSimpleFactory.purchContractSimple(purchContractAdditionSimpleInfo);
        purchContractSimple.setPurchContractId(purchContractId);
        purchContractSimple.setCreateTime(new Date());
        purchContractSimple.setDeleteFlag(Boolean.FALSE);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo == null) {
            purchContractSimple.setCreateUserId(userInfo.getId());
        }
        int insert = purchContractSimpleMapper.insert(purchContractSimple);
        if (insert == 0) {
            throw new Exception("采购合同简易信息操作失败");
        }
        return purchContractSimple.getId();
    }


    @Override
    public int updateByPurchContractId(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception {
        PurchContractSimple purchContractSimple = PurchContractSimpleFactory.purchContractSimple(purchContractAdditionSimpleInfo);
        if (purchContractSimple == null) {
            throw new Exception("采购合同简易内容为空");
        }

        purchContractSimple.setId(null);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractSimple.setUpdateUserId(userInfo.getId());
        }
        purchContractSimple.setUpdateTime(new Date());

        PurchContractSimpleExample example = new PurchContractSimpleExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId);
        return purchContractSimpleMapper.updateByExampleSelective(purchContractSimple, example);

    }

    @Override
    public PurchContractAdditionSimpleInfo findByPurchContractId(Long purchContractId) {
        PurchContractSimple purchContractSimple = findByPurchContractId02(purchContractId);

        return PurchContractSimpleFactory.purchContractSignatoriesInfo(purchContractSimple);
    }

    private PurchContractSimple findByPurchContractId02(Long purchContractId) {
        PurchContractSimpleExample example = new PurchContractSimpleExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId);
        List<PurchContractSimple> purchContractSimples = purchContractSimpleMapper.selectByExample(example);
        if (purchContractSimples.size() > 0) {
            return purchContractSimples.get(0);
        }
        return null;
    }

}
