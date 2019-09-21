package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.LogisticsDataInfoSaveRequest;
import com.erui.order.common.pojo.request.LogisticsDataQueryRequest;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.LogisticsDataInfo;
import com.erui.order.service.LogisticsDataInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 物流跟踪动态信息
 *
 * @Auther 王晓丹
 * @Date 2019/7/21 下午5:26
 */
@RestController
@RequestMapping("order/logisticsDataInfo")
@Validated
public class LogisticsDataInfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogisticsDataInfoController.class);
    @Autowired
    private LogisticsDataInfoService logisticsDataInfoService;

    /**
     * 保存LogisticsData
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveLogisticsDataInfo/{logisticsDataId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveLogisticsDataInfo(@PathVariable("logisticsDataId") Long logisticsDataId, @RequestBody @Valid LogisticsDataInfoSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveLogisticsData - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            logisticsDataInfoService.insertOnDuplicateIdUpdate(logisticsDataId, saveRequest);
            LOGGER.info("saveLogisticsData成功 - {} - {}", JSON.toJSONString(userInfo), logisticsDataId);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveLogisticsData异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> delete(@RequestBody PrimaryKey key) {
        Result<Void> result = new Result<>();
        try {
            logisticsDataInfoService.delete(key.getId());
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取LogisticsData详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<LogisticsDataInfoDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key));
        Result<LogisticsDataInfoDetailResponse> result = new Result<>();
        try {
            LogisticsDataInfoDetailResponse detail = logisticsDataInfoService.detail(key.getId());
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

