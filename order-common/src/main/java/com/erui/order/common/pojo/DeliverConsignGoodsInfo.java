package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class DeliverConsignGoodsInfo {
    // 主键
    private Long id;
    // '订单商品ID'
    private Long orderGoodsId;
    // 本次发货数量
    private Short sendNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Short getSendNum() {
        return sendNum;
    }

    public void setSendNum(Short sendNum) {
        this.sendNum = sendNum;
    }
}

