package com.erui.order.service.impl;

import com.erui.order.common.pojo.CountryInfo;
import com.erui.order.common.pojo.request.CountryQueryRequest;
import com.erui.order.mapper.CountryMapper;
import com.erui.order.mapper.MarketAreaCountryMapper;
import com.erui.order.model.entity.Country;
import com.erui.order.model.entity.CountryExample;
import com.erui.order.model.entity.MarketAreaCountry;
import com.erui.order.model.entity.MarketAreaCountryExample;
import com.erui.order.service.CountryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:14
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private MarketAreaCountryMapper marketAreaCountryMapper;

    @Override
    public String findCountryNameByBn(String countryBn) {
        Country country = findByBn(countryBn);
        if (country != null) {
            return country.getCountryName();
        }
        return null;
    }

    @Override
    public List<CountryInfo> listAll(CountryQueryRequest queryRequest) {
        List<CountryInfo> countryInfoList = new ArrayList<>();
        List<String> countryBnList = null;
        if (StringUtils.isNotBlank(queryRequest.getAreaBn())) {
            MarketAreaCountryExample example = new MarketAreaCountryExample();
            MarketAreaCountryExample.Criteria criteria = example.createCriteria().andMarketAreaBnEqualTo(queryRequest.getAreaBn());
            List<MarketAreaCountry> marketAreaCountries = marketAreaCountryMapper.selectByExample(example);
            countryBnList = marketAreaCountries.stream().map(MarketAreaCountry::getCountryBn).collect(Collectors.toList());
        }
        CountryExample example02 = new CountryExample();
        CountryExample.Criteria criteria = example02.createCriteria();
        criteria.andLangEqualTo("zh").andDeletedFlagEqualTo("N");
        if (countryBnList != null) {
            if (countryBnList.size() > 0) {
                criteria.andBnIn(countryBnList);
            } else {
                criteria.andIdEqualTo(-1L);
            }
        }
        List<Country> countries = countryMapper.selectByExample(example02);
        for (Country country : countries) {
            CountryInfo countryInfo = new CountryInfo();
            countryInfo.setId(country.getId());
            countryInfo.setCountryBn(country.getBn());
            countryInfo.setCountryName(country.getCountryName());
            countryInfoList.add(countryInfo);
        }
        return countryInfoList;
    }

    private Country findByBn(String countryBn) {
        CountryExample example = new CountryExample();
        example.createCriteria().andBnEqualTo(countryBn).andLangEqualTo("zh")
                .andDeletedFlagEqualTo("N");
        List<Country> countries = countryMapper.selectByExample(example);
        if (countries != null && countries.size() > 0) {
            return countries.get(0);
        }
        return null;
    }
}
