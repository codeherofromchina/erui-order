package com.erui.order.service.impl;

import com.erui.order.common.pojo.StandardUnitInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.mapper.StandardUnitMapper;
import com.erui.order.mapper.UserMapper;
import com.erui.order.model.entity.StandardUnit;
import com.erui.order.model.entity.User;
import com.erui.order.service.StandardUnitService;
import com.erui.order.service.UserService;
import com.erui.order.service.util.UserFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:57
 */
@Service
public class StandardUnitServiceImpl implements StandardUnitService {
    @Autowired
    private StandardUnitMapper standardUnitMapper;

    @Override
    public StandardUnitInfo findByCode(String unitCode) {
        if (StringUtils.isNotBlank(unitCode)) {
            StandardUnit standardUnit = standardUnitMapper.selectByPrimaryKey(unitCode);
            if (standardUnit != null) {
                return standardUnitInfo(standardUnit);
            }
        }
        return null;
    }


    public List<StandardUnitInfo> findByCode() {
        List<StandardUnit> standardUnits = standardUnitMapper.selectByExample(null);
        List<StandardUnitInfo> standardUnitInfos = standardUnits.stream()
                .map(vo -> standardUnitInfo(vo)).collect(Collectors.toList());

        return standardUnitInfos;
    }


    private StandardUnitInfo standardUnitInfo(StandardUnit standardUnit) {
        StandardUnitInfo standardUnitInfo = new StandardUnitInfo();
        standardUnitInfo.setUnitCode(standardUnit.getUnitCode());
        standardUnitInfo.setNameZh(standardUnit.getNameZh());
        return standardUnitInfo;
    }
}
