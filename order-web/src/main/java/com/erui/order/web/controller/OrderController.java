package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.request.OrderQueryRequest;
import com.erui.order.common.pojo.request.OrderSaveRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.OrderListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.OrderService;
import com.erui.order.web.ConfigBeanProp;
import com.erui.order.web.util.CookiesUtil;
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

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Auther 王晓丹
 * @Date 2019/7/21 下午5:26
 */
@RestController
@RequestMapping("order/order")
@Validated
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private ConfigBeanProp configBeanProp;
    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "saveOrder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> saveOrder(HttpServletRequest request, @RequestBody @Valid OrderSaveRequest saveRequest, BindingResult bindingResult) {
        LOGGER.info("保存订单 - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(saveRequest));
        Long id = saveRequest.getId();
        Result<Void> result = new Result<>();
        try {
            if (id != null) {
                orderService.update(id, saveRequest);
            } else {
                id = orderService.insert(saveRequest);
            }
            LOGGER.info("保存订单成功 - {} - {} - {}", ThreadLocalUtil.getToken(), id);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("保存订单异常 - {} - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(saveRequest), e);
            result.setStatus(ResultStatus.FAIL)
                    .setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<OrderListResponse>> list(@RequestBody OrderQueryRequest queryRequest) {
        LOGGER.info("查询订单列表 - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(queryRequest));
        Result<Pager<OrderListResponse>> result = new Result<>();
        try {
            // 查询列表
            Pager<OrderListResponse> pageInfo = orderService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("查询订单列表成功 - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("查询订单列表异常 - {} - {} - {}", ThreadLocalUtil.getToken(), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 获取订单的详情
     *
     * @param request
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<OrderDetailResponse> detail(HttpServletRequest request, @RequestBody PrimaryKey key) {
        Result<OrderDetailResponse> result = new Result<>();
        try {
            OrderDetailResponse detail = orderService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("查询订单详情成功 {} - {} - {}", ThreadLocalUtil.getToken(), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

}
