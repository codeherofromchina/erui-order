package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.DeliverConsignService;
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
 * 出口发货通知单表控制器
 * @Auther 王晓丹
 * @Date 2019/7/21 下午5:26
 */
@RestController
@RequestMapping("order/deliverConsign")
@Validated
public class DeliverConsignController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeliverConsignController.class);
    @Autowired
    private DeliverConsignService deliverConsignService;

    /**
     * 保存DeliverConsign
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveDeliverConsign", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveDeliverConsign(@RequestBody @Valid DeliverConsignSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveDeliverConsign - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                deliverConsignService.update(id, saveRequest);
            } else {
                id = deliverConsignService.insert(saveRequest);
            }
            LOGGER.info("saveDeliverConsign成功 - {} - {}", JSON.toJSONString(userInfo), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveDeliverConsign异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 分页查询DeliverConsign列表内容
     *
     * @param queryRequest
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<DeliverConsignListResponse>> list(@RequestBody DeliverConsignQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("list - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<DeliverConsignListResponse>> result = new Result<>();
        try {
            Pager<DeliverConsignListResponse> pageInfo = deliverConsignService.list(queryRequest);
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
     * 查询DeliverConsign列表内容
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "listByOrderId", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<List<DeliverConsignListResponse>> listByOrderId(@RequestBody PrimaryKey orderId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("listByOrderId - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId));
        Result<List<DeliverConsignListResponse>> result = new Result<>();
        try {
            List<DeliverConsignListResponse> pageInfo = deliverConsignService.listByOrderid(orderId.getId());
            result.setData(pageInfo);
            LOGGER.info("listByOrderId成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("listByOrderId异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 获取DeliverConsign详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<DeliverConsignDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key));
        Result<DeliverConsignDetailResponse> result = new Result<>();
        try {
            DeliverConsignDetailResponse detail = deliverConsignService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取订舱详情
     *
     * @param orderId 订单ID
     * @return
     */
    @RequestMapping(value = "detailByOrderId", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<DeliverConsignDetailResponse> detailByOrderId(@RequestBody PrimaryKey orderId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId));
        Result<DeliverConsignDetailResponse> result = new Result<>();
        try {
            DeliverConsignDetailResponse detail = deliverConsignService.detailByOrderId(orderId.getId());
            if (detail != null) {
                result.setData(detail);
            } else {
                result.setStatus(ResultStatus.CONTENT_NULL);
            }
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), orderId.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(orderId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

}

