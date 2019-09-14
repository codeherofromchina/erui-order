package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.ProcessProgressEnum;
import com.erui.order.common.enums.ProjectStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.ProjectProfitInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.ProjectQueryRequest;
import com.erui.order.common.pojo.request.ProjectUpdateRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.ProjectDetailResponse;
import com.erui.order.common.pojo.response.ProjectListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.ProjectMapper;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.Project;
import com.erui.order.model.entity.ProjectExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.OrderService;
import com.erui.order.service.ProjectProfitService;
import com.erui.order.service.ProjectService;
import com.erui.order.service.util.ProjectFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private static Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProjectProfitService projectProfitService;
    @Autowired
    private AttachmentService attachmentService;


    public int insert(Long orderId) throws Exception {
        OrderDetailResponse detail = orderService.detail(orderId);

        Project project = new Project();
        project.setProjectNo(detail.getContractNo());
        project.setBusinessUid(detail.getTechnicalId());
        project.setSendDeptId(detail.getBusinessUnitId());
        project.setTotalPriceUsd(detail.getTotalPriceUsd());
        project.setProcessId(detail.getProcessId());
        project.setProjectStatus(ProjectStatusEnum.INIT.getCode());
        project.setOrderId(detail.getId());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            project.setCreateUserId(userInfo.getId());
        }
        project.setDeleteFlag(Boolean.FALSE);
        project.setCreateTime(new Date());

//        project.setExecCoName(order1.getExecCoName());
//        project.setBusinessUnitName(order1.getBusinessUnitName());
//        project.setPurchReqCreate(Project.PurchReqCreateEnum.NOT_CREATE.getCode());
//        project.setOrderCategory(order1.getOrderCategory());
//        project.setOverseasSales(order1.getOverseasSales());
//        project.setPurchDone(Boolean.FALSE);
//        project.setProcessProgress("1");
//        project.setBusinessName(order1.getBusinessName());   //商务技术经办人名称
//        //新建项目审批状态为未审核
//        project.setAuditingStatus(0);


        return projectMapper.insert(project);
    }

    @Override
    public void update(Long id, ProjectUpdateRequest projectUpdateRequest) throws Exception {

        Project project = projectMapper.selectByPrimaryKey(id);
        if (project == null) {
            throw new Exception("项目唯一标识错误");
        }
        if (ProjectStatusEnum.fromCode(project.getProjectStatus()) != ProjectStatusEnum.INIT) {
            throw new Exception("项目当前状态错误");
        }

        Project projectSelective = ProjectFactory.project(projectUpdateRequest);
        projectSelective.setId(id);
        projectSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            projectSelective.setUpdateUserId(userInfo.getId());
        }

        projectMapper.updateByPrimaryKeySelective(projectSelective);

        // 项目利润
        ProjectProfitInfo projectProfit = projectUpdateRequest.getProjectProfit();
        projectProfitService.insertOnDuplicateProjectIdUpdate(id, projectProfit);

        // 项目附件
        List<AttachmentInfo> attachments = projectUpdateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insert(AttachmentTargetObjEnum.PROJECT, id, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(projectUpdateRequest));
            throw new Exception("订单附件数据操作失败");
        }

    }

    /**
     * 分页查询项目列表
     *
     * @param queryRequest
     * @return
     */
    public Pager<ProjectListResponse> list(ProjectQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        ProjectExample example = new ProjectExample();
        example.setOrderByClause("id desc");
        ProjectExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);
        // 销售合同号
        // 项目号
        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
        }
        // 项目号/合同标的
        if (StringUtils.isNotBlank(queryRequest.getProjectName())) {
            criteria.andProjectNameLike("%" + queryRequest.getProjectName() + "%");
        }
        // 项目开始日期
        if (queryRequest.getStartDate() != null) {
            criteria.andStartDateEqualTo(queryRequest.getStartDate());
        }
        // 项目状态
        ProjectStatusEnum projectStatusEnum = ProjectStatusEnum.fromCode(queryRequest.getProjectStatus());
        if (projectStatusEnum != null) {
            criteria.andProjectStatusEqualTo(projectStatusEnum.getCode());
        }
        // 流程进度
        ProcessProgressEnum processProgressEnum = ProcessProgressEnum.fromCode(queryRequest.getProcessProgress());
        if (processProgressEnum != null) {
            criteria.andProcessProgressEqualTo(processProgressEnum.getCode());
        }

        List<Project> projects = projectMapper.selectByExample(example);

        List<ProjectListResponse> projectListResponses = new ArrayList<>();
        for (Project project : projects) {
            ProjectListResponse orderListResponse = ProjectFactory.projectListResponse(project);
            projectListResponses.add(orderListResponse);
        }

        // 输出
        Page<Order> page = (Page) projects;
        Pager<ProjectListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), projectListResponses);
        return pager;
    }


    @Override
    public ProjectDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Project project = projectMapper.selectByPrimaryKey(id);
        if (project == null) {
            throw new Exception("项目不存在");
        }
        // 项目利润单
        ProjectProfitInfo projectProfitInfo = projectProfitService.findByProjectId(id);
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PROJECT, id);

        // 组织数据
        ProjectDetailResponse detail = ProjectFactory.projectDetailResponse(project);
        detail.setProjectProfit(projectProfitInfo);
        detail.setAttachments(attachmentInfos);
        return detail;
    }

}
