package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.PurchContractQueryRequest;
import com.erui.order.common.pojo.request.PurchContractSaveRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.PurchContractDetailResponse;
import com.erui.order.common.pojo.response.PurchContractListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.PurchContractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:19
 */
@RestController
@RequestMapping("order/purchContract")
@Validated
public class PurchContractController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private PurchContractService purchContractService;

    @RequestMapping(value = "savePurchContract", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> savePurchContract(@RequestBody @Valid PurchContractSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("保存采购合同 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                purchContractService.update(id, saveRequest);
            } else {
                id = purchContractService.insert(saveRequest);
            }
            LOGGER.info("保存采购合同成功 - {} - {} - {}", JSON.toJSONString(userInfo), id, JSON.toJSONString(saveRequest));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("保存采购合同异常 - {} - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL)
                    .setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<PurchContractListResponse>> list(@RequestBody PurchContractQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("查询采购合同列表 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<PurchContractListResponse>> result = new Result<>();
        try {
            // 查询列表
            Pager<PurchContractListResponse> pageInfo = purchContractService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("查询采购合同列表成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("查询采购合同列表异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取采购合同的详情
     *
     * @param request
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<PurchContractDetailResponse> detail(HttpServletRequest request, @RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<PurchContractDetailResponse> result = new Result<>();
        try {
            PurchContractDetailResponse detail = purchContractService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("查询采购合同详情成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

}
