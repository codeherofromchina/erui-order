package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.ProjectTypeEnum;
import com.erui.order.common.enums.PurchRequisitionStatusEnum;
import com.erui.order.common.enums.PurchStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.ProjectQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.*;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import com.erui.order.service.util.GoodsInfoFactory;
import com.erui.order.service.util.PurchRequisitionFactory;
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
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchRequisitionServiceImpl implements PurchRequisitionService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchRequisitionServiceImpl.class);
    @Autowired
    private PurchRequisitionMapper purchRequisitionMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsService orderGoodsService;
    @Autowired
    private ProjectProfitService projectProfitService;
    @Autowired
    private PurchRequisitionGoodsService purchRequisitionGoodsService;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrgService orgService;
    @Autowired
    private ProjectService projectService;


    @Override
    public void update(Long id, PurchRequisitionSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        PurchRequisition purchRequisition = purchRequisitionMapper.selectByPrimaryKey(id);
        if (purchRequisition == null) {
            throw new Exception("采购申请唯一标识错误");
        }
        if (PurchRequisitionStatusEnum.valueOf(purchRequisition.getPurchRequisitionStatus()) != PurchRequisitionStatusEnum.SAVE) {
            throw new Exception("采购申请当前状态错误");
        }


        Long purchRequisitionId = purchRequisition.getId();
        // 修改基本信息
        PurchRequisition purchRequisitionSelective = PurchRequisitionFactory.purchRequisition(updateRequest);
        purchRequisitionSelective.setId(purchRequisitionId);
        purchRequisitionSelective.setProjectId(null);
        purchRequisitionSelective.setPurchStatus(PurchStatusEnum.INIT.getCode());
        purchRequisitionSelective.setUpdateTime(new Date());
        purchRequisitionSelective.setUpdateUserId(userInfo.getId());

        purchRequisitionMapper.updateByPrimaryKeySelective(purchRequisitionSelective);

        // 判断是保存还是提交采购申请，将状态写入到项目中
        PurchRequisitionStatusEnum purchRequisitionStatusEnum = PurchRequisitionStatusEnum.valueOf(purchRequisitionSelective.getPurchRequisitionStatus());
        if (purchRequisitionStatusEnum != null) {
            Project projectSelective = new Project();
            projectSelective.setId(purchRequisition.getId());
            projectSelective.setPurchReqCreate((short) (purchRequisitionStatusEnum == PurchRequisitionStatusEnum.SAVE ? 2 : 3));
            projectMapper.updateByPrimaryKeySelective(projectSelective);
        }

        // 采购申请商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoods = updateRequest.getPurchRequisitionGoods();
        purchRequisitionGoodsService.update(purchRequisitionId, purchRequisitionGoods);

        // 采购申请附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH_REQUISITION, purchRequisitionId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("采购申请附件数据操作失败");
        }
    }

    @Override
    public Long insert(PurchRequisitionSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 查找商品内容，从商品中写入一部分内容
        Long projectId = insertRequest.getProjectId();
        Project project = projectMapper.selectByPrimaryKey(projectId);
        if (project == null) {
            throw new Exception("项目不存在");
        }
        Order order = orderMapper.selectByPrimaryKey(project.getOrderId());
        ProjectProfitInfo projectProfitInfo = projectProfitService.findByProjectId(projectId);


        // 组织采购申请数据
        PurchRequisition PurchRequisition = PurchRequisitionFactory.purchRequisition(insertRequest);
        PurchRequisition.setProjectNo(project.getProjectNo());
        PurchRequisition.setPmUid(project.getBusinessUid());
        PurchRequisition.setDepartment(project.getSendDeptId());
        PurchRequisition.setTradeMethod(projectProfitInfo.getProjectType());
        PurchRequisition.setTransModeBn(order.getTradeTerms());
        PurchRequisition.setPurchStatus(PurchStatusEnum.INIT.getCode());
        PurchRequisition.setCreateTime(new Date());
        PurchRequisition.setCreateUserId(userInfo.getId());
        PurchRequisition.setDeleteFlag(Boolean.FALSE);
        int insertNum = purchRequisitionMapper.insert(PurchRequisition);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long purchRequisitionId = PurchRequisition.getId();

        // 判断是保存还是提交采购申请，将状态写入到项目中
        PurchRequisitionStatusEnum purchRequisitionStatusEnum = PurchRequisitionStatusEnum.valueOf(PurchRequisition.getPurchRequisitionStatus());
        if (purchRequisitionStatusEnum != null) {
            Project projectSelective = new Project();
            projectSelective.setId(projectId);
            projectSelective.setPurchReqCreate((short) (purchRequisitionStatusEnum == PurchRequisitionStatusEnum.SAVE ? 2 : 3));
            projectMapper.updateByPrimaryKeySelective(projectSelective);
        }

        // 采购申请商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoods = insertRequest.getPurchRequisitionGoods();
        if (purchRequisitionGoods != null && purchRequisitionGoods.size() > 0) {
            int purchRequisitionGoodsInsertNum = purchRequisitionGoodsService.insert(purchRequisitionId, purchRequisitionGoods);
            if (purchRequisitionGoods.size() != purchRequisitionGoodsInsertNum) {
                LOGGER.info("purchRequisitionGoodsInsertNum : {} - {}", purchRequisitionGoodsInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("采购申请商品数据操作失败");
            }
        }
        // 采购申请附件
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH_REQUISITION, purchRequisitionId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("采购申请附件数据操作失败");
            }
        }
        return purchRequisitionId;
    }

    @Override
    public Pager<PurchRequisitionListResponse> list(PurchRequisitionQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchRequisitionExample example = new PurchRequisitionExample();
        example.setOrderByClause("id desc");
        PurchRequisitionExample.Criteria criteria = example.createCriteria();
        // 未删除,且已提交
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andPurchRequisitionStatusEqualTo(PurchRequisitionStatusEnum.SUBMIT.getCode());
        // 未分单的采购申请
        criteria.andPurchaseUidIsNull();

        // 销售合同号
        // 项目号
        // 标的物
        // 要求采购到货日期
        List<Long> projectIds = null;
        if (!StringUtils.isAllBlank(queryRequest.getContractNo(), queryRequest.getProjectNo(), queryRequest.getProjectName()) || queryRequest.getRequirePurchaseDate() != null) {
            ProjectQueryRequest projectQueryRequest = new ProjectQueryRequest();
            projectQueryRequest.setContractNo(queryRequest.getContractNo());
            projectQueryRequest.setProjectNo(queryRequest.getProjectNo());
            projectQueryRequest.setProjectName(queryRequest.getProjectName());
            projectQueryRequest.setRequirePurchaseDate(queryRequest.getRequirePurchaseDate());
            projectIds = projectService.projectIds(projectQueryRequest);
        }

        if (projectIds != null) {
            if (projectIds.size() == 0) {
                criteria.andIdEqualTo(-1L);
            } else {
                criteria.andProjectIdIn(projectIds);
            }
        }

        // 下发日期
        if (queryRequest.getSubmitDate() != null) {
            criteria.andSubmitDateEqualTo(queryRequest.getSubmitDate());
        }

        List<PurchRequisition> purchRequisitions = purchRequisitionMapper.selectByExample(example);

        List<PurchRequisitionListResponse> purchRequisitionListResponses = new ArrayList<>();
        for (PurchRequisition purchRequisition : purchRequisitions) {
            PurchRequisitionListResponse purchRequisitionListResponse = PurchRequisitionFactory.purchRequisitionListResponse(purchRequisition);
            Project project = projectMapper.selectByPrimaryKey(purchRequisition.getProjectId());
            purchRequisitionListResponse.setContractNo(project.getProjectNo());
            purchRequisitionListResponse.setProjectNo(project.getProjectNo());
            purchRequisitionListResponse.setProjectName(project.getProjectName());
            purchRequisitionListResponse.setPmUserName(userService.findNameById(purchRequisition.getPmUid()));
            purchRequisitionListResponse.setStartDate(project.getStartDate());
            purchRequisitionListResponse.setRequirePurchaseDate(project.getRequirePurchaseDate());

            purchRequisitionListResponses.add(purchRequisitionListResponse);
        }

        // 输出
        Page<PurchRequisition> page = (Page) purchRequisitions;
        Pager<PurchRequisitionListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), purchRequisitionListResponses);
        return pager;
    }

    @Override
    public PurchRequisitionDetailResponse detail(Long id) throws Exception {
        // 准备数据
        PurchRequisition purchRequisition = purchRequisitionMapper.selectByPrimaryKey(id);
        if (purchRequisition == null) {
            throw new Exception("采购申请不存在");
        }
        // 商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos = purchRequisitionGoodsService.list(id);
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH_REQUISITION, id);

        // 组织数据
        PurchRequisitionDetailResponse detail = PurchRequisitionFactory.purchRequisitionDetailResponse(purchRequisition);
        detail.setPmUserName(userService.findNameById(purchRequisition.getPmUid()));
        detail.setDepartmentName(orgService.findOrgNameById(purchRequisition.getDepartment()));
        List<GoodsInfo> goodsInfos = new ArrayList<>();
        for (PurchRequisitionGoodsInfo purchRequisitionGoodsInfo : purchRequisitionGoodsInfos) {
            OrderGoodsInfo orderGoodsInfo = orderGoodsService.findById(purchRequisitionGoodsInfo.getOrderGoodsId());
            GoodsInfo goodsInfo = GoodsInfoFactory.goodsInfo(orderGoodsInfo, purchRequisitionGoodsInfo);
            goodsInfo.setId(purchRequisitionGoodsInfo.getId());
            goodsInfos.add(goodsInfo);
        }
        detail.setGoodsInfos(goodsInfos);
        detail.setAttachments(attachmentInfos);

        return detail;
    }


    @Override
    public PurchRequisitionDetailResponse detailByProjectId(Long projectId) throws Exception {
        Project project = projectMapper.selectByPrimaryKey(projectId);
        if (project == null) {
            throw new Exception("不存在的项目");
        }
        PurchRequisitionDetailResponse detailResponse;
        Short purchReqCreate = project.getPurchReqCreate();
        if (purchReqCreate == 1) {
            Order order = orderMapper.selectByPrimaryKey(project.getOrderId());
            ProjectProfitInfo projectProfitInfo = projectProfitService.findByProjectId(projectId);

            // 项目未提交采购申请，通过项目信息构建部分采购申请内容并返回
            detailResponse = new PurchRequisitionDetailResponse();
            detailResponse.setProjectId(project.getId());
            detailResponse.setProjectNo(project.getProjectNo());
            detailResponse.setPmUid(project.getBusinessUid());
            detailResponse.setPmUserName(userService.findNameById(project.getBusinessUid()));
            detailResponse.setDepartment(project.getSendDeptId());
            detailResponse.setDepartmentName(orgService.findOrgNameById(project.getSendDeptId()));
            detailResponse.setTradeMethod(projectProfitInfo.getProjectType());
            ProjectTypeEnum projectTypeEnum = ProjectTypeEnum.valueOf(projectProfitInfo.getProjectType());
            if (projectTypeEnum != null) {
                detailResponse.setTradeMethodName(projectTypeEnum.getName());
            }
            detailResponse.setTransModeBn(order.getTradeTerms());
            // 拼装商品内容
            List<OrderGoodsInfo> orderGoodsInfoList = orderGoodsService.list(order.getId());
            List<GoodsInfo> goodsInfoList = GoodsInfoFactory.goodsInfo(orderGoodsInfoList);
            detailResponse.setGoodsInfos(goodsInfoList);
            detailResponse.setAttachments(new ArrayList<>());
        } else {
            PurchRequisitionExample example = new PurchRequisitionExample();
            example.createCriteria().andProjectIdEqualTo(projectId).andDeleteFlagEqualTo(Boolean.FALSE);
            List<PurchRequisition> purchRequisitions = purchRequisitionMapper.selectByExample(example);
            if (purchRequisitions != null && purchRequisitions.size() > 0) {
                detailResponse = detail(purchRequisitions.get(0).getId());
            } else {
                throw new Exception("项目采购申请状态错误");
            }
        }
        return detailResponse;
    }


    @Override
    public List<Long> projectIdsByCurrentUser() {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        PurchRequisitionExample example = new PurchRequisitionExample();
        example.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE)
                .andPurchaseUidEqualTo(userInfo.getId());

        List<PurchRequisition> purchRequisitions = purchRequisitionMapper.selectByExample(example);
        return purchRequisitions.stream().map(PurchRequisition::getProjectId).collect(Collectors.toList());
    }
}
