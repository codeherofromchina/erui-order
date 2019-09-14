package com.erui.order.service.impl;

import com.erui.order.common.pojo.AreaInfo;
import com.erui.order.mapper.MarketAreaMapper;
import com.erui.order.model.entity.Country;
import com.erui.order.model.entity.MarketArea;
import com.erui.order.model.entity.MarketAreaExample;
import com.erui.order.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:14
 */
@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Autowired
    private MarketAreaMapper marketAreaMapper;

    @Override
    public String findAreaNameByBn(String countryBn) {
        MarketArea marketArea = findByBn(countryBn);
        if (marketArea != null) {
            return marketArea.getAreaName();
        }
        return null;
    }

    @Override
    public List<AreaInfo> listAll() {
        List<AreaInfo> areaInfoList = new ArrayList<>();
        MarketAreaExample example = new MarketAreaExample();
        example.createCriteria().andLangEqualTo("zh");
        List<MarketArea> marketAreas = marketAreaMapper.selectByExample(example);
        for (MarketArea marketArea : marketAreas) {
            AreaInfo areaInfo = new AreaInfo();
            areaInfo.setId(marketArea.getId());
            areaInfo.setAreaBn(marketArea.getBn());
            areaInfo.setAreaName(marketArea.getAreaName());
            areaInfoList.add(areaInfo);
        }
        return areaInfoList;
    }

    private MarketArea findByBn(String countryBn) {
        MarketAreaExample example = new MarketAreaExample();
        example.createCriteria().andBnEqualTo(countryBn).andLangEqualTo("zh");
        List<MarketArea> marketAreas = marketAreaMapper.selectByExample(example);
        if (marketAreas != null && marketAreas.size() > 0) {
            return marketAreas.get(0);
        }
        return null;
    }
}
