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
import com.erui.order.common.pojo.response.ProjectDialogListResponse;
import com.erui.order.common.pojo.response.ProjectListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.mapper.ProjectMapper;
import com.erui.order.mapper.ProjectProfitMapper;
import com.erui.order.mapper.PurchRequisitionMapper;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.Project;
import com.erui.order.model.entity.ProjectExample;
import com.erui.order.model.entity.ProjectProfit;
import com.erui.order.service.*;
import com.erui.order.service.util.ProjectFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private static Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private PurchRequisitionService purchRequisitionService;
    @Autowired
    private ProjectProfitMapper projectProfitMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private OrgService orgService;
    @Autowired
    private ProjectProfitService projectProfitService;
    @Autowired
    private AttachmentService attachmentService;


    /**
     * 项目立项
     * @param orderId
     * @return
     * @throws Exception
     */
    public Long insert(Long orderId) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            throw new Exception("订单不存在");
        }

        BigDecimal totalPriceUsd = order.getTotalPriceUsd();

        Project project = new Project();
        project.setOrderId(orderId);
        project.setProjectNo(order.getContractNo());
        project.setProjectStatus(ProjectStatusEnum.INIT.getCode());
        project.setBusinessUid(order.getTechnicalId());
        project.setSendDeptId(order.getBusinessUnitId());
        project.setTotalPriceUsd(order.getTotalPriceUsd());
        project.setProcessProgress(ProcessProgressEnum.SUBMIT.getCode());
        // 是否已经创建采购申请单 1：未创建  2：已创建保存状态 3:已创建并提交
        project.setPurchReqCreate((short) 1);
        // 采购合同未完成
        project.setPurchDone(Boolean.FALSE);
        // 初步利润率固定 84.51
        project.setProfitPercent(new BigDecimal("84.51"));
        project.setProfit(totalPriceUsd.multiply(project.getProfitPercent())); // 利润额
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            project.setCreateUserId(userInfo.getId());
        }
        project.setDeleteFlag(Boolean.FALSE);
        project.setCreateTime(new Date());

        int insertNum = projectMapper.insert(project);


        Long projectId = project.getId();
        if (projectId == null) {
            throw new Exception("项目操作失败");
        }
        // 插入项目利润
        ProjectProfit projectProfit = new ProjectProfit();
        projectProfit.setCountryBn(order.getCountry());
        projectProfit.setTradeTerm(order.getTradeTerms());
        projectProfit.setProjectId(projectId);
        projectProfit.setContractAmountUsd(totalPriceUsd);
        projectProfit.setExchangeRate(new BigDecimal("6.7"));
        projectProfit.setContractAmount(totalPriceUsd.multiply(projectProfit.getExchangeRate()));
        projectProfit.setCreateUserId(userInfo.getId());
        projectProfit.setCreateTime(new Date());
        projectProfit.setDeleteFlag(Boolean.FALSE);
        projectProfitMapper.insert(projectProfit);
        return projectId;
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
        if (ProjectStatusEnum.fromCode(projectSelective.getProjectStatus()) != ProjectStatusEnum.EXECUTING) {
            projectSelective.setStartDate(new Date());
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
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PROJECT, id, attachments);
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
        // 要求采购到货期
        if (queryRequest.getRequirePurchaseDate() != null) {
            criteria.andRequirePurchaseDateEqualTo(queryRequest.getRequirePurchaseDate());
        }
        // 执行事业部
        if (queryRequest.getSendDeptId() != null) {
            criteria.andSendDeptIdEqualTo(queryRequest.getSendDeptId());
        }
        // 事业部项目负责人
        if (queryRequest.getBusinessUid() != null) {
            criteria.andBusinessUidEqualTo(queryRequest.getBusinessUid());
        }

        //项目创建日期
        if (queryRequest.getCreateTimeStart() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(queryRequest.getCreateTimeStart());
        }
        if (queryRequest.getCreateTimeEnd() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(queryRequest.getCreateTimeEnd());
        }

        List<Project> projects = projectMapper.selectByExample(example);
        List<ProjectListResponse> projectListResponses = new ArrayList<>();
        for (Project project : projects) {
            ProjectListResponse orderListResponse = ProjectFactory.projectListResponse(project);
            orderListResponse.setSendDeptName(orgService.findOrgNameById(project.getSendDeptId()));
            orderListResponse.setBusinessUserName(userService.findNameById(project.getBusinessUid()));
            projectListResponses.add(orderListResponse);
        }

        // 输出
        Page<Order> page = (Page) projects;
        Pager<ProjectListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), projectListResponses);
        return pager;
    }

    @Override
    public List<Long> projectIds(ProjectQueryRequest queryRequest) {
        ProjectExample example = new ProjectExample();
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
        // 要求采购到货期
        if (queryRequest.getRequirePurchaseDate() != null) {
            criteria.andRequirePurchaseDateEqualTo(queryRequest.getRequirePurchaseDate());
        }
        // 执行事业部
        if (queryRequest.getSendDeptId() != null) {
            criteria.andSendDeptIdEqualTo(queryRequest.getSendDeptId());
        }
        // 事业部项目负责人
        if (queryRequest.getBusinessUid() != null) {
            criteria.andBusinessUidEqualTo(queryRequest.getBusinessUid());
        }

        //项目创建日期
        if (queryRequest.getCreateTimeStart() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(queryRequest.getCreateTimeStart());
        }
        if (queryRequest.getCreateTimeEnd() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(queryRequest.getCreateTimeEnd());
        }

        List<Project> projects = projectMapper.selectByExample(example);
        return projects.stream().map(Project::getId).collect(Collectors.toList());
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
        detail.setSendDeptName(orgService.findOrgNameById(project.getSendDeptId()));
        detail.setProjectProfit(projectProfitInfo);
        detail.setAttachments(attachmentInfos);
        return detail;
    }


    @Override
    public Pager<ProjectDialogListResponse> dialogList(ProjectQueryRequest queryRequest) {
        List<Long> projectIds = purchRequisitionService.projectIdsByCurrentUser();
        Pager<ProjectDialogListResponse> pager = null;
        if (projectIds.size() == 0) {
            pager = new Pager<>(queryRequest.getPage(), queryRequest.getRows()
                    , 0, 0, new ArrayList<>());
        } else {
            // 分页
            PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

            ProjectExample example = new ProjectExample();
            example.setOrderByClause("id desc");
            ProjectExample.Criteria criteria = example.createCriteria();
            // 未删除
            criteria.andDeleteFlagEqualTo(Boolean.FALSE).andPurchDoneEqualTo(Boolean.FALSE);
            // 销售合同号
            // 项目号
            if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
                criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
            }
            if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
                criteria.andProjectNoLike("%" + queryRequest.getContractNo() + "%");
            }
            if (StringUtils.isNotBlank(queryRequest.getProjectName())) {
                criteria.andProjectNameLike("%" + queryRequest.getProjectName() + "%");
            }
            List<Project> projects = projectMapper.selectByExample(example);
            List<ProjectDialogListResponse> projectListResponses = new ArrayList<>();
            for (Project project : projects) {
                ProjectDialogListResponse projectDialogListResponse = new ProjectDialogListResponse();
                projectDialogListResponse.setContractNo(project.getProjectNo());
                projectDialogListResponse.setProjectNo(project.getProjectNo());
                projectDialogListResponse.setProjectName(project.getProjectName());
                projectListResponses.add(projectDialogListResponse);
            }

            // 输出
            Page<Order> page = (Page) projects;
            pager = new Pager<>(page.getPageNum(), page.getPageSize()
                    , page.getPages(), page.getTotal(), projectListResponses);
        }
        return pager;


    }


    @Override
    public List<Long> orderIdsByProjectIds(List<Long> projectIds) {
        if (projectIds == null || projectIds.size() == 0) {
            return new ArrayList<>();
        }

        ProjectExample example = new ProjectExample();
        ProjectExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andIdIn(projectIds);

        List<Project> projects = projectMapper.selectByExample(example);
        return projects.stream().map(Project::getOrderId).collect(Collectors.toList());
    }


    @Override
    public void updatePurchContractDoneByOrderId(Long orderId) {
        Project projectSelective = new Project();
        projectSelective.setPurchDone(Boolean.TRUE);

        ProjectExample example = new ProjectExample();
        example.createCriteria().andOrderIdEqualTo(orderId);


        projectMapper.updateByExampleSelective(projectSelective, example);
    }
}
