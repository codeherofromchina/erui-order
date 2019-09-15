package com.erui.order.service.impl;

import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchContractStandardMapper;
import com.erui.order.model.entity.PurchContractStandard;
import com.erui.order.model.entity.PurchContractStandardExample;
import com.erui.order.service.PurchContractStandardService;
import com.erui.order.service.util.PurchContractStandardFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PurchContractStandardServiceImpl implements PurchContractStandardService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchContractStandardServiceImpl.class);
    @Autowired
    private PurchContractStandardMapper purchContractStandardMapper;

    @Override
    public Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception {
        if (purchContractId == null) {
            throw new Exception("采购合同标识错误");
        }
        PurchContractStandard purchContractStandard = findByPurchContractId02(purchContractId);
        Long id = null;
        if (purchContractStandard == null) {
            id = insert(purchContractId, purchContractAdditionStandardInfo);
        } else {
            // 更新操作
            id = purchContractStandard.getId();
            updateByPurchContractId(purchContractId, purchContractAdditionStandardInfo);
        }
        return id;
    }

    @Override
    public Long insert(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception {
        PurchContractStandard purchContractStandard = PurchContractStandardFactory.purchContractStandard(purchContractAdditionStandardInfo);
        purchContractStandard.setPurchContractId(purchContractId);
        purchContractStandard.setCreateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractStandard.setCreateUserId(userInfo.getId());
        }
        purchContractStandard.setDeleteFlag(Boolean.FALSE);
        int insert = purchContractStandardMapper.insert(purchContractStandard);
        if (insert == 0) {
            throw new Exception("采购合同标准信息操作失败");
        }
        return purchContractStandard.getId();
    }


    @Override
    public int updateByPurchContractId(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception {
        PurchContractStandard purchContractStandardSelective = PurchContractStandardFactory.purchContractStandard(purchContractAdditionStandardInfo);
        if (purchContractStandardSelective == null) {
            throw new Exception("采购合同标准内容为空");
        }

        purchContractStandardSelective.setId(null);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractStandardSelective.setUpdateUserId(userInfo.getId());
        }
        purchContractStandardSelective.setUpdateTime(new Date());

        PurchContractStandardExample example = new PurchContractStandardExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId);
        return purchContractStandardMapper.updateByExampleSelective(purchContractStandardSelective, example);
    }


    @Override
    public PurchContractAdditionStandardInfo findByPurchContractId(Long purchContractId) {
        PurchContractStandard purchContractStandard = findByPurchContractId02(purchContractId);
        return PurchContractStandardFactory.purchContractAdditionStandardInfo(purchContractStandard);
    }

    private PurchContractStandard findByPurchContractId02(Long purchContractId) {
        PurchContractStandardExample example = new PurchContractStandardExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId);
        List<PurchContractStandard> purchContractStandards = purchContractStandardMapper.selectByExample(example);
        if (purchContractStandards.size() > 0) {
            return purchContractStandards.get(0);
        }
        return null;
    }
}
