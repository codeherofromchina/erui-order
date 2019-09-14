package com.erui.order.common.pojo.request;

/**
 * @Auther 王晓丹
 * @Date 2019/9/14 上午12:39
 */
public class PortListQueryRequest {
    private String portName;
    private String transMode;

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }
}
