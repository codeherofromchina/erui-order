package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.DeliverNoticeQueryRequest;
import com.erui.order.common.pojo.request.DeliverNoticeSaveRequest;
import com.erui.order.common.pojo.response.DeliverNoticeDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.DeliverNoticeService;
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

/**
 * @Auther 王晓丹
 * @Date 2019/7/21 下午5:26
 */
@RestController
@RequestMapping("order/deliverNotice")
@Validated
public class DeliverNoticeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeliverNoticeController.class);
    @Autowired
    private DeliverNoticeService deliverNoticeService;

    /**
     * 保存DeliverNotice
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveDeliverNotice", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveDeliverNotice(@RequestBody @Valid DeliverNoticeSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveDeliverNotice - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                deliverNoticeService.update(id, saveRequest);
            } else {
                id = deliverNoticeService.insert(saveRequest);
            }
            LOGGER.info("saveDeliverNotice成功 - {} - {}", JSON.toJSONString(userInfo), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveDeliverNotice异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 分页查询DeliverNotice列表内容
     *
     * @param queryRequest
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<DeliverNoticeListResponse>> list(@RequestBody DeliverNoticeQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("list - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<DeliverNoticeListResponse>> result = new Result<>();
        try {
            Pager<DeliverNoticeListResponse> pageInfo = deliverNoticeService.list(queryRequest);
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
     * 获取DeliverNotice详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<DeliverNoticeDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key));
        Result<DeliverNoticeDetailResponse> result = new Result<>();
        try {
            DeliverNoticeDetailResponse detail = deliverNoticeService.detail(key.getId());
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
     * @param deliverConsignId
     * @return
     */
    @RequestMapping(value = "detailByDeliverConsignId", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<DeliverNoticeDetailResponse> detailByDeliverConsignId(@RequestBody PrimaryKey deliverConsignId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(deliverConsignId));
        Result<DeliverNoticeDetailResponse> result = new Result<>();
        try {
            DeliverNoticeDetailResponse detail = deliverNoticeService.detailByDeliverConsignId(deliverConsignId.getId());
            result.setData(detail);
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), deliverConsignId.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(deliverConsignId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


}

