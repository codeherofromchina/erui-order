package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.AgainInspectApplyRequest;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.InspectApplyService;
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
@RequestMapping("order/inspectApply")
@Validated
public class InspectApplyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InspectApplyController.class);
    @Autowired
    private InspectApplyService inspectApplyService;

    /**
     * 保存InspectApply
     *
     * @param saveRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "saveInspectApply", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveInspectApply(@RequestBody @Valid InspectApplySaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("saveInspectApply - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                inspectApplyService.update(id, saveRequest);
            } else {
                id = inspectApplyService.insert(saveRequest);
            }
            LOGGER.info("saveInspectApply成功 - {} - {}", JSON.toJSONString(userInfo), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("saveInspectApply异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 根据采购单ID查询InspectApply列表内容
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<List<InspectApplyListResponse>> list(@RequestBody PrimaryKey purchIdKey) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("list - {} - {}", JSON.toJSONString(userInfo), purchIdKey.getId());
        Result<List<InspectApplyListResponse>> result = new Result<>();
        try {
            List<InspectApplyListResponse> list = inspectApplyService.list(purchIdKey.getId());
            result.setData(list);
            LOGGER.info("list成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(list));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("list异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(purchIdKey), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 获取InspectApply详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<InspectApplyDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(key));
        Result<InspectApplyDetailResponse> result = new Result<>();
        try {
            InspectApplyDetailResponse detail = inspectApplyService.detail(key.getId());
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
     * 重新报检
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "againInspectApply", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<InspectApplyDetailResponse> againInspectApply(@RequestBody AgainInspectApplyRequest request) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("againInspectApply - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(request));
        Result<InspectApplyDetailResponse> result = new Result<>();
        try {
            inspectApplyService.againInspectApplyInfo(request.getId(), request.getMsg());
            LOGGER.info("againInspectApply成功 {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(request));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("againInspectApply异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(request), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取InspectApply详情
     *
     * @param purchId 采购ID
     * @return
     */
    @RequestMapping(value = "detailByPurchId", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<InspectApplyDetailResponse> detailByPurchId(@RequestBody PrimaryKey purchId) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("detail - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(purchId));
        Result<InspectApplyDetailResponse> result = new Result<>();
        try {
            InspectApplyDetailResponse detail = inspectApplyService.detailByPurchId(purchId.getId());
            if (detail != null) {
                result.setData(detail);
            } else {
                result.setStatus(ResultStatus.CONTENT_NULL);
            }
            LOGGER.info("detail成功 {} - {} - {}", JSON.toJSONString(userInfo), purchId.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("detail异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(purchId), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }
}

