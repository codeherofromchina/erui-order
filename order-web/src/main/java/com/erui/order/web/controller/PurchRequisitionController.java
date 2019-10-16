package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.common.pojo.request.PurchRequisitionQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.PurchRequisitionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:17
 */
@RestController
@RequestMapping("order/purchRequisition")
@Validated
public class PurchRequisitionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PurchRequisitionController.class);
    @Autowired
    private PurchRequisitionService purchRequisitionService;

    @RequestMapping(value = "savePurchRequisition", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> savePurchRequisition(@RequestBody @Valid PurchRequisitionSaveRequest saveRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("保存采购申请 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest));
        Result<Void> result = new Result<>();
        try {
            Long id = saveRequest.getId();
            if (id != null) {
                purchRequisitionService.update(id, saveRequest);
            } else {
                id = purchRequisitionService.insert(saveRequest);
            }
            LOGGER.info("保存采购申请成功 - {} - {} - {}", JSON.toJSONString(userInfo), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("保存采购申请异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL)
                    .setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<PurchRequisitionListResponse>> list(@RequestBody PurchRequisitionQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("查询采购申请列表 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<PurchRequisitionListResponse>> result = new Result<>();
        try {
            // 查询列表
            Pager<PurchRequisitionListResponse> pageInfo = purchRequisitionService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("查询采购申请列表成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("查询采购申请列表异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 通过项目ID获取采购申请的详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "infoByProjectId", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<PurchRequisitionDetailResponse> detailByProjectId(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<PurchRequisitionDetailResponse> result = new Result<>();
        try {
            PurchRequisitionDetailResponse detail = purchRequisitionService.detailByProjectId(key.getId());
            result.setData(detail);
            LOGGER.info("查询采购申请详情成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("查询采购申请详情异常 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 获取采购申请的详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<PurchRequisitionDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<PurchRequisitionDetailResponse> result = new Result<>();
        try {
            PurchRequisitionDetailResponse detail = purchRequisitionService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("查询采购申请详情成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("查询采购申请详情异常 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 采购审核转交采购经办人
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "handOver/{purchaseUid}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> handOver(@PathVariable Long purchaseUid, @RequestBody PrimaryKey key) {
        Result<Void> result = new Result<>();
        try {
            purchRequisitionService.handOver(key.getId(), purchaseUid);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("采购审核转交采购经办人 {} - {} - {}", purchaseUid, key.getId(), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
