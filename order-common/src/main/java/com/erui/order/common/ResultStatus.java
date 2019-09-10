package com.erui.order.common;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;


public enum ResultStatus {
    SUCCESS(0, "成功"),
    FAIL(1, "失败"),
    PARAM_ERROR(2, "参数错误");

    private int code;
    private String msg;

    ResultStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", this.code);
        map.put("msg", this.msg);
        return JSON.toJSONString(map);
    }

}
