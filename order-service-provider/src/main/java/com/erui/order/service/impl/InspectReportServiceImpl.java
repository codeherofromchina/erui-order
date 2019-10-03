package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InspectReportStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.InspectReportQueryRequest;
import com.erui.order.common.pojo.request.InspectReportSaveRequest;
import com.erui.order.common.pojo.response.InspectReportDetailResponse;
import com.erui.order.common.pojo.response.InspectReportListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.*;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import com.erui.order.service.util.InspectReportFactory;
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
public class InspectReportServiceImpl implements InspectReportService {
    private static Logger LOGGER = LoggerFactory.getLogger(InspectReportServiceImpl.class);
    @Autowired
    private InspectReportMapper inspectReportMapper;
    @Autowired
    private InspectApplyMapper inspectApplyMapper;
    @Autowired
    private InspectApplyGoodsMapper inspectApplyGoodsMapper;
    @Autowired
    private InspectApplyGoodsService inspectApplyGoodsService;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private UserService userService;
    @Autowired
    private InstockService instockService;

    @Override
    public Long insert(Long inspectApplyId) throws Exception {
        InspectApply inspectApply = inspectApplyMapper.selectByPrimaryKey(inspectApplyId);
        if (inspectApply == null) {
            throw new Exception("报检单不存在");
        }
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织数据
        InspectReport inspectReport = new InspectReport();
        inspectReport.setInspectApplyId(inspectApplyId);
        inspectReport.setInspectApplyNo(inspectApply.getInspectApplyNo());
        inspectReport.setReportFirst(inspectApply.getMasteer());
        inspectReport.setSupplierName(inspectApply.getSupplierName());
        if (inspectApply.getMasteer()) {
            inspectReport.setCheckTimes((short) 1);
            Long qualityUid = findProjectQualityUidByInspectApplyId(inspectApplyId);
            inspectReport.setCheckUserId(qualityUid);
        } else {
            Long pInspectApply = inspectApply.getpId();
            InspectApply parentInspectApply = inspectApplyMapper.selectByPrimaryKey(pInspectApply);
            InspectReport parentInspectReport = findByInspectApplyId(parentInspectApply.getId());

            inspectReport.setCheckTimes(parentInspectApply.getNum());
            // 取父级的质检人和质检部门
            inspectReport.setCheckDeptId(parentInspectReport.getCheckDeptId());
            inspectReport.setCheckDeptName(parentInspectReport.getCheckDeptName());
            inspectReport.setCheckUserId(parentInspectReport.getCheckUserId());
        }
        inspectReport.setReportProcess(true);
        inspectReport.setMsg(inspectApply.getMsg());
        inspectReport.setInspectReportStatus(InspectReportStatusEnum.INIT.getCode());
        inspectReport.setIsShow(Boolean.TRUE);

        inspectReport.setCreateTime(new Date());
        inspectReport.setCreateUserId(userInfo.getId());
        inspectReport.setDeleteFlag(Boolean.FALSE);
        inspectReportMapper.insert(inspectReport);
        Long inspectReportId = inspectReport.getId();

        InspectApplyGoodsExample inspectApplyGoodsExample = new InspectApplyGoodsExample();
        inspectApplyGoodsExample.createCriteria().andInspectApplyIdEqualTo(inspectApplyId);
        InspectApplyGoods inspectApplyGoodsSelective = new InspectApplyGoods();
        inspectApplyGoodsSelective.setInspectReportId(inspectReportId);
        inspectApplyGoodsMapper.updateByExampleSelective(inspectApplyGoodsSelective, inspectApplyGoodsExample);

        return inspectReportId;
    }

    @Override
    public void update(Long id, InspectReportSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectReport inspectReport = inspectReportMapper.selectByPrimaryKey(id);
        if (inspectReport == null) {
            throw new Exception("对象唯一标识错误");
        }
        InspectReportStatusEnum requestStatusEnum = InspectReportStatusEnum.valueOf(updateRequest.getInspectReportStatus());
        if (requestStatusEnum != InspectReportStatusEnum.SAVED && requestStatusEnum != InspectReportStatusEnum.SUBMITED ) {
            throw new Exception("请求对象的状态错误");
        }

        InspectReportStatusEnum statusEnum = InspectReportStatusEnum.valueOf(inspectReport.getInspectReportStatus());
        if (statusEnum != InspectReportStatusEnum.INIT && statusEnum != InspectReportStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long inspectReportId = inspectReport.getId();
        // 修改基本信息
        InspectReport inspectReportSelective = InspectReportFactory.inspectReport(updateRequest);
        inspectReportSelective.setId(inspectReportId);
        inspectReportSelective.setUpdateTime(new Date());
        inspectReportSelective.setUpdateUserId(userInfo.getId());

        inspectReportMapper.updateByPrimaryKeySelective(inspectReportSelective);

        // 商品信息
        List<InspectReportGoodsInfo> inspectReportGoodsInfos = updateRequest.getInspectReportGoodsInfos();
        inspectApplyGoodsService.updateByInspectReportId(inspectReportId, inspectReportGoodsInfos);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSPECT_REPORT, inspectReportId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }

        if (InspectReportStatusEnum.SUBMITED.getCode() == updateRequest.getInspectReportStatus()) {
            // 推送消息到入库
            instockService.insert(inspectReportId);
        }
    }

    @Override
    public Pager<InspectReportListResponse> list(InspectReportQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        InspectReportExample example = new InspectReportExample();
        example.setOrderByClause("id desc");
        InspectReportExample.Criteria criteria = example.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getInspectApplyNo())) {
            criteria.andInspectApplyNoLike("%" + queryRequest.getInspectApplyNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getPurchNo())) {
            criteria.andPurchNoLike("%" + queryRequest.getPurchNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getSupplierName())) {
            criteria.andSupplierNameLike("%" + queryRequest.getSupplierName() + "%");
        }

        InspectReportStatusEnum inspectReportStatusEnum = InspectReportStatusEnum.valueOf(queryRequest.getInspectReportStatus());
        if (inspectReportStatusEnum != null) {
            criteria.andInspectReportStatusEqualTo(inspectReportStatusEnum.getCode());
        }

        if (queryRequest.getCheckDate() != null) {
            criteria.andCheckDateEqualTo(queryRequest.getCheckDate());
        }

        if (queryRequest.getCheckTimes() != null) {
            criteria.andCheckTimesEqualTo(queryRequest.getCheckTimes());
        }

        List<InspectReport> inspectReports = inspectReportMapper.selectByExample(example);

        List<InspectReportListResponse> inspectReportListResponses = new ArrayList<>();
        for (InspectReport inspectReport : inspectReports) {
            InspectReportListResponse inspectReportListResponse = InspectReportFactory.inspectReportListResponse(inspectReport);

            inspectReportListResponses.add(inspectReportListResponse);
        }
        // 输出
        Page<InspectReport> page = (Page) inspectReports;
        Pager<InspectReportListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), inspectReportListResponses);
        return pager;
    }

    @Override
    public InspectReportDetailResponse detail(Long id) throws Exception {
        // 准备数据
        InspectReport inspectReport = inspectReportMapper.selectByPrimaryKey(id);
        if (inspectReport == null) {
            throw new Exception("对象信息不存在");
        }
        // 商品
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = inspectApplyGoodsService.listByInpsectReportId(inspectReport.getId());
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByInspectApplyGoods(inspectApplyGoodsInfos);
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSPECT_REPORT, id);

        // 组织数据
        InspectReportDetailResponse detail = InspectReportFactory.inspectReportDetailResponse(inspectReport);
        detail.setCheckUserName(userService.findNameById(detail.getCheckUserId()));

        detail.setGoodsInfos(goodsInfoList);
        detail.setAttachments(attachmentInfos);

        return detail;
    }

    /**
     * 通过报检单ID查找质检信息
     *
     * @param inspectApplyId
     * @return
     */
    private InspectReport findByInspectApplyId(Long inspectApplyId) {
        InspectReportExample example = new InspectReportExample();
        example.createCriteria().andInspectApplyIdEqualTo(inspectApplyId);

        List<InspectReport> inspectReports = inspectReportMapper.selectByExample(example);
        if (inspectReports != null && inspectReports.size() > 0) {
            return inspectReports.get(0);
        }
        return null;
    }


    private Long findProjectQualityUidByInspectApplyId(Long inspectApplyId) {
        InspectApplyGoodsExample inspectApplyGoodsExample = new InspectApplyGoodsExample();
        inspectApplyGoodsExample.createCriteria().andInspectApplyIdEqualTo(inspectApplyId);
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = inspectApplyGoodsService.listByInspectApplyId(inspectApplyId);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByInspectApplyGoods(inspectApplyGoodsInfos);

        List<Long> orderGoodsIdList = goodsInfoList.stream().map(GoodsInfo::getOrderGoodsId).collect(Collectors.toList());
        if (orderGoodsIdList.size() == 0) {
            return null;
        }
        OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
        orderGoodsExample.createCriteria().andIdIn(orderGoodsIdList);
        List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExample(orderGoodsExample);

        List<Long> orderIds = orderGoodsList.stream().map(OrderGoods::getOrderId).collect(Collectors.toList());
        if (orderIds.size() == 0) {
            return null;
        }
        ProjectExample projectExample = new ProjectExample();
        projectExample.createCriteria().andOrderIdIn(orderIds);
        List<Project> projects = projectMapper.selectByExample(projectExample);
        Project project = projects.stream().filter(vo -> vo.getQualityUid() != null).findFirst().get();
        if (project == null) {
            return null;
        }
        return project.getQualityUid();
    }
}

