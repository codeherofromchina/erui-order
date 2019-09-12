package com.erui.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.Result;
import com.erui.order.common.ResultStatus;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PrimaryKey;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.ProjectQueryRequest;
import com.erui.order.common.pojo.request.ProjectUpdateRequest;
import com.erui.order.common.pojo.response.ProjectDetailResponse;
import com.erui.order.common.pojo.response.ProjectListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.service.ProjectService;
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
 * @Date 2019/9/8 下午4:17
 */
@RestController
@RequestMapping("order/project")
@Validated
public class ProjectController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "updateProject", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Void> updateProject(@RequestBody @Valid ProjectUpdateRequest updateRequest, BindingResult bindingResult) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("更新项目 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(updateRequest));
        Result<Void> result = new Result<>();
        try {
            projectService.update(updateRequest.getId(), updateRequest);
            LOGGER.info("更新项目成功 - {} - {} ", JSON.toJSONString(userInfo), updateRequest.getId());
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("更新项目异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(updateRequest), e);
            result.setStatus(ResultStatus.FAIL)
                    .setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<Pager<ProjectListResponse>> list(@RequestBody ProjectQueryRequest queryRequest) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LOGGER.info("查询项目列表 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest));
        Result<Pager<ProjectListResponse>> result = new Result<>();
        try {
            // 查询列表
            Pager<ProjectListResponse> pageInfo = projectService.list(queryRequest);
            result.setData(pageInfo);
            LOGGER.info("查询项目列表成功 - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("查询项目列表异常 - {} - {} - {}", JSON.toJSONString(userInfo), JSON.toJSONString(queryRequest), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 获取项目的详情
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Result<ProjectDetailResponse> detail(@RequestBody PrimaryKey key) {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Result<ProjectDetailResponse> result = new Result<>();
        try {
            ProjectDetailResponse detail = projectService.detail(key.getId());
            result.setData(detail);
            LOGGER.info("查询项目详情成功 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), JSON.toJSONString(detail));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("查询项目详情异常 {} - {} - {}", JSON.toJSONString(userInfo), key.getId(), e);
            result.setStatus(ResultStatus.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
