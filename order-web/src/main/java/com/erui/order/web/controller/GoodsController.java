package com.erui.order.web.controller;

import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/15 下午2:14
 */
@RestController
@RequestMapping("order/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查找可新建采购合同的商品列表
     *
     * @param projectIds
     * @return
     */
    @RequestMapping(value = "purchContractAbleGoods", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<List<GoodsInfo>> purchContractAbleGoods(@RequestBody List<Long> projectIds) {
        Result<List<GoodsInfo>> result = new Result<>();
        try {
            List<GoodsInfo> data;
            if (projectIds == null || projectIds.size() == 0) {
                data = new ArrayList<>();
            } else {
                data = goodsService.purchContractAbleGoodsList(projectIds);
            }
            result.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 查找可新建采购单的商品列表
     *
     * @param purchContractId 采购合同ID
     * @return
     */
    @RequestMapping(value = "purchAbleGoods", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<List<GoodsInfo>> purchAbleGoods(@RequestBody PrimaryKey purchContractId) {
        Result<List<GoodsInfo>> result = new Result<>();
        try {
            Long id = purchContractId.getId();
            List<GoodsInfo> data = goodsService.goodsInfoByPurchContractId(id);
            result.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }
}
