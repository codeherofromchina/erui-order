package com.erui.order.service;

import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.SupplierInfo;
import com.erui.order.common.pojo.request.SupplierListQueryRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/14 上午2:05
 */
public interface SupplierService {
    Pager<SupplierInfo> list(SupplierListQueryRequest queryRequest);
}
