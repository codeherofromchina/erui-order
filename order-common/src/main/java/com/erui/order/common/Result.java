package com.erui.order.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 统一返回的结果集合
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {
    private final static Logger LOGGER = LoggerFactory.getLogger(Result.class);
    private int code;
    private String message;
    private T data;

    public Result() {
        this(ResultStatus.SUCCESS);
    }

    public Result(ResultStatus resultStatus) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMsg();
    }

    public Result(T data) {
        this.setStatus(ResultStatus.SUCCESS);
        this.data = data;
    }

    public Result<T> setStatus(ResultStatus resultStatus) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMsg();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    public Result<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }


    public void printResult(OutputStream out) {
        String s = JSONObject.toJSONString(this);
        try {
            out.write(s.getBytes("UTF-8"));
        } catch (IOException e) {
            LOGGER.error("输出异常[data:{},err:{}]", this, e);
        }
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
