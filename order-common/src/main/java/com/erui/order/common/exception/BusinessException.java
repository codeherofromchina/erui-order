package com.erui.order.common.exception;

/**
 * @Auther 王晓丹
 * @Date 2019/7/31 下午4:48
 */
public class BusinessException extends Exception {
    private String msg;
    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
