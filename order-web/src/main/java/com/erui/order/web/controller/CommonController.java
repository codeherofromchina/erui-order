package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.*;
import com.erui.order.common.pojo.response.OrderListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.*;
import net.bytebuddy.asm.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther 王晓丹
 * @Date 2019/8/5 上午8:55
 */
@RestController
@RequestMapping("order/common")
public class CommonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private OrgService orgService;
    @Autowired
    private BuyerService buyerService;
    @Autowired
    private PortService portService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private AreaService areaService;

    /**
     * 查询用户列表
     *
     * @return
     */
    @PostMapping("userList")
    public Result<Pager<UserInfo>> userList(@RequestBody UserListQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("userList - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<UserInfo>> result = new Result<>();
        try {
            Pager<UserInfo> pageInfo = userService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("userList成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("userList异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 执行事业部列表
     *
     * @return
     */
    @PostMapping("orgList")
    public Result<List<OrgInfo>> orgList(@RequestBody OrgListQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("orgList - {}", JSON.toJSONString(userInfo));
        Result<List<OrgInfo>> result = new Result<>();
        try {
            List<OrgInfo> orgInfoList = orgService.listAll(queryRequest);
            result.setData(orgInfoList);
            LOGGER.info("orgList成功 - {}", JSON.toJSONString(userInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("orgList异常 - {} - {}", JSON.toJSONString(userInfo), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 客户列表
     *
     * @return
     */
    @PostMapping("buyerList")
    public Result<Pager<BuyerInfo>> buyerList(@RequestBody BuyerListQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("buyerList - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<BuyerInfo>> result = new Result<>();
        try {
            Pager<BuyerInfo> pageInfo = buyerService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("buyerList 成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("buyerList 异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }


    /**
     * 执行事业部列表
     *
     * @return
     */
    @PostMapping("portList")
    public Result<List<PortInfo>> portList(@RequestBody PortListQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("orgList - {}", JSON.toJSONString(userInfo));
        Result<List<PortInfo>> result = new Result<>();
        try {
            List<PortInfo> orgInfoList = portService.listAll(queryRequest);
            result.setData(orgInfoList);
            LOGGER.info("orgList成功 - {}", JSON.toJSONString(userInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("orgList异常 - {} - {}", JSON.toJSONString(userInfo), e);
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * @return
     */
    @PostMapping("areaList")
    public Result<List<AreaInfo>> areaList() {
        Result<List<AreaInfo>> result = new Result<>();
        try {
            List<AreaInfo> areaInfoList = areaService.listAll();
            result.setData(areaInfoList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * @return
     */
    @PostMapping("countryList")
    public Result<List<CountryInfo>> countryList(@RequestBody CountryQueryRequest queryRequest) {
        Result<List<CountryInfo>> result = new Result<>();
        try {
            List<CountryInfo> countryInfoList = countryService.listAll(queryRequest);
            result.setData(countryInfoList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(ResultStatus.FAIL).setMessage(e.getMessage());
        }
        return result;
    }

}
