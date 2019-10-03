package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class InstockGoodsInfo {
    // 主键
    private Long id;
    // 报检单商品ID
    private Long inspectApplyGoodsId;
    // 入库数量
    private Integer instockNum;
    // 货物存放地
    private String instockStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getInspectApplyGoodsId() {
        return inspectApplyGoodsId;
    }

    public void setInspectApplyGoodsId(Long inspectApplyGoodsId) {
        this.inspectApplyGoodsId = inspectApplyGoodsId;
    }

    public Integer getInstockNum() {
        return instockNum;
    }

    public void setInstockNum(Integer instockNum) {
        this.instockNum = instockNum;
    }

    public String getInstockStock() {
        return instockStock;
    }

    public void setInstockStock(String instockStock) {
        this.instockStock = instockStock;
    }
}

