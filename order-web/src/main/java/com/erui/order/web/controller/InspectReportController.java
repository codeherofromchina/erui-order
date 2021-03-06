package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.InspectReportQueryRequest;
import com.erui.order.common.pojo.request.InspectReportSaveRequest;
import com.erui.order.common.pojo.response.InspectReportDetailResponse;
import com.erui.order.common.pojo.response.InspectReportListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.InspectReportService;
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
@RequestMapping("order/inspectReport")
@Validated
public class InspectReportController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InspectReportController.class);
    @Autowired
    private InspectReportService inspectReportService;

    /**
     * 保存InspectReport
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveInspectReport", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveInspectReport(@RequestBody @Valid InspectReportSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveInspectReport - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            inspectReportService.update(saveRequest.getId(), saveRequest);
            LOGGER.info("saveInspectReport成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveInspectReport异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 分页查询InspectReport列表内容
     *
     * @param queryRequest
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<InspectReportListResponse>> list(@RequestBody InspectReportQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("list - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<InspectReportListResponse>> result = new Result<>();
        try {
            Pager<InspectReportListResponse> pageInfo = inspectReportService.list(queryRequest);
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
     * 获取InspectReport详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<InspectReportDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key));
        Result<InspectReportDetailResponse> result = new Result<>();
        try {
            InspectReportDetailResponse detail = inspectReportService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

}

