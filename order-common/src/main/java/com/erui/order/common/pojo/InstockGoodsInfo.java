package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class InstockGoodsInfo {
    // 主键
    private Long id;
    // 对象ID
    private Long parentId;
    // '商品ID'
    private Long orderGoodsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

}

