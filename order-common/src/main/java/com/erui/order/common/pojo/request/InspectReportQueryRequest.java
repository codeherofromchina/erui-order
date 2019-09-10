package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectReportQueryRequest extends PagingRequest {

    // 状态
    private Short status;

    public Short getStatus() {return status;}

    public void setStatus(Short status) {this.status = status;}
}

