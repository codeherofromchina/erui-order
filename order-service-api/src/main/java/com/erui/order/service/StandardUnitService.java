package com.erui.order.service;

import com.erui.order.common.pojo.StandardUnitInfo;
import com.erui.order.common.pojo.UserInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:55
 */
public interface StandardUnitService {
    /**
     * 通过商品标准单位
     *
     * @param unitCode
     * @return
     */
    StandardUnitInfo findByCode(String unitCode);

    /**
     * 通过单位查找名称
     * @param unitCode
     * @return
     */
    String findNameByCode(String unitCode);

    /**
     * 查找所有商品单位列表
     *
     * @return
     */
    List<StandardUnitInfo> findAll();
}
