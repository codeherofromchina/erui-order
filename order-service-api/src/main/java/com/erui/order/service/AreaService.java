package com.erui.order.service;

import com.erui.order.common.pojo.AreaInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:11
 */
public interface AreaService {

    /**
     * 查询地区中文名称，不存在则返回null
     * @param countryBn
     * @return
     */
    String findAreaNameByBn(String countryBn);

    /**
     * 查询所有地区
     * @return
     */
    List<AreaInfo> listAll();

}
