package com.erui.order.service.impl;

import com.erui.order.common.enums.PurchContractSignatoriesTypeEnum;
import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchContractSignatoriesMapper;
import com.erui.order.model.entity.PurchContractSignatories;
import com.erui.order.model.entity.PurchContractSignatories;
import com.erui.order.model.entity.PurchContractSignatoriesExample;
import com.erui.order.service.PurchContractSignatoriesService;
import com.erui.order.service.util.PurchContractSignatoriesFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class purchContractSignatoriesServiceImpl implements PurchContractSignatoriesService {
    private static Logger LOGGER = LoggerFactory.getLogger(purchContractSignatoriesServiceImpl.class);
    @Autowired
    private PurchContractSignatoriesMapper purchContractSignatoriesMapper;


    @Override
    public Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType,
                                                       PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception {
        if (purchContractId == null) {
            throw new Exception("采购合同标识错误");
        }
        PurchContractSignatories purchContractSignatories = findByPurchContractId02(purchContractId, signatoriesType);
        Long id = null;
        if (purchContractSignatories == null) {
            id = insert(purchContractId, signatoriesType, contractSignatoriesInfo);
        } else {
            // 更新操作
            id = purchContractSignatories.getId();
            updateByPurchContractId(purchContractId, signatoriesType, contractSignatoriesInfo);
        }
        return id;
    }

    @Override
    public Long insert(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType, PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception {
        PurchContractSignatories purchContractSignatories = PurchContractSignatoriesFactory.purchContractSignatories(contractSignatoriesInfo);
        purchContractSignatories.setPurchContractId(purchContractId);
        purchContractSignatories.setSignatoriesType(signatoriesType.getCode());
        purchContractSignatories.setCreateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractSignatories.setCreateUserId(userInfo.getId());
        }
        purchContractSignatories.setDeleteFlag(Boolean.FALSE);
        int insert = purchContractSignatoriesMapper.insert(purchContractSignatories);
        if (insert == 0) {
            throw new Exception("采购合同交易人员内容操作失败");
        }
        return purchContractSignatories.getId();
    }


    @Override
    public int updateByPurchContractId(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType,
                                       PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception {
        PurchContractSignatories purchContractSignatories = PurchContractSignatoriesFactory.purchContractSignatories(contractSignatoriesInfo);
        if (purchContractSignatories == null) {
            throw new Exception("采购合同交易人员内容为空");
        }

        purchContractSignatories.setId(null);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            purchContractSignatories.setUpdateUserId(userInfo.getId());
        }
        purchContractSignatories.setUpdateTime(new Date());

        PurchContractSignatoriesExample example = new PurchContractSignatoriesExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId).andSignatoriesTypeEqualTo(signatoriesType.getCode());
        return purchContractSignatoriesMapper.updateByExampleSelective(purchContractSignatories, example);
    }

    @Override
    public PurchContractSignatoriesInfo findByPurchContractId(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType) {
        PurchContractSignatories purchContractSignatories = findByPurchContractId02(purchContractId, signatoriesType);

        return PurchContractSignatoriesFactory.purchContractSignatoriesInfo(purchContractSignatories);
    }

    private PurchContractSignatories findByPurchContractId02(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType) {
        PurchContractSignatoriesExample example = new PurchContractSignatoriesExample();
        example.createCriteria().andPurchContractIdEqualTo(purchContractId)
                .andSignatoriesTypeEqualTo(signatoriesType.getCode());
        List<PurchContractSignatories> PurchContractSignatoriess = purchContractSignatoriesMapper.selectByExample(example);
        if (PurchContractSignatoriess.size() > 0) {
            return PurchContractSignatoriess.get(0);
        }
        return null;
    }
}
