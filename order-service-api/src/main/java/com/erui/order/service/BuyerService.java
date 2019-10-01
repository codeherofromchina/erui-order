package com.erui.order.service;

import com.erui.order.common.pojo.BuyerInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.BuyerListQueryRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/14 上午2:05
 */
public interface BuyerService {
    Pager<BuyerInfo> list(BuyerListQueryRequest queryRequest);

    String findBuyerCodeById(Long buyerId);
}
