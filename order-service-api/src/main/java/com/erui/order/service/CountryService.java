package com.erui.order.service;

import com.erui.order.common.pojo.CountryInfo;
import com.erui.order.common.pojo.request.CountryQueryRequest;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:11
 */
public interface CountryService {

    /**
     * 查询国家中文名称，不存在则返回null
     * @param countryBn
     * @return
     */
    String findCountryNameByBn(String countryBn);


    List<CountryInfo> listAll(CountryQueryRequest queryRequest);
}
