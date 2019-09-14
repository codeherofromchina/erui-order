package com.erui.order.service;

import com.erui.order.common.pojo.PortInfo;
import com.erui.order.common.pojo.request.OrgListQueryRequest;
import com.erui.order.common.pojo.request.PortListQueryRequest;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:24
 */
public interface PortService {

    String findPortNameByBn(String portBn);

    List<PortInfo> listAll(PortListQueryRequest queryRequest);
}
