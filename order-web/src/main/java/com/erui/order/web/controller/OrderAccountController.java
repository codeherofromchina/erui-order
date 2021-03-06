package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.OrderAccountQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.OrderAccountService;
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

import javax.validation.Valid;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/7/21 下午5:26
 */
@RestController
@RequestMapping("order/orderAccount")
@Validated
public class OrderAccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderAccountController.class);
    @Autowired
    private OrderAccountService orderAccountService;

    /**
     * 保存OrderAccount
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveOrderAccount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Long> saveOrderAccount(@RequestBody @Valid OrderAccountSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveOrderAccount - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Long> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                orderAccountService.update(id, saveRequest);
            } else {
                id = orderAccountService.insert(saveRequest);
            }
            result.setData(id);
            LOGGER.info("saveOrderAccount成功 - {} - {}", JSON.toJSONString(userInfo), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveOrderAccount异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 分页查询OrderAccount列表内容
     *
     * @param queryRequest
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<OrderAccountListResponse>> list(@RequestBody OrderAccountQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("list - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<OrderAccountListResponse>> result = new Result<>();
        try {
            Pager<OrderAccountListResponse> pageInfo = orderAccountService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("list成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("list异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取OrderAccount详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> delete(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<Void> result = new Result<>();
        try {
            orderAccountService.delete(key.getId());
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("delete异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 收款完成
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "done", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> done(@RequestBody PrimaryKey orderId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<Void> result = new Result<>();
        try {
            orderAccountService.done(orderId.getId());
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("done异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 获取OrderAccount详情
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<OrderAccountDetailResponse> detail(@RequestBody PrimaryKey orderId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId));
        Result<OrderAccountDetailResponse> result = new Result<>();
        try {
            OrderAccountDetailResponse detail = orderAccountService.detail(orderId.getId());
            result.setData(detail);
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), orderId.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

}

