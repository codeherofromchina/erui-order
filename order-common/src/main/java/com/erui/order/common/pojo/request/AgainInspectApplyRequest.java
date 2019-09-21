package com.erui.order.common.pojo.request;

/**
 * 重新报检请求实体
 * @Auther 王晓丹
 * @Date 2019/9/20 上午11:44
 */
public class AgainInspectApplyRequest {
    private Long id;
    // 整改意见
    private String msg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
