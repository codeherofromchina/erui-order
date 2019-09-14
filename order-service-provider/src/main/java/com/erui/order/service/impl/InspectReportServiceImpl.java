package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InspectReportStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.InspectReportQueryRequest;
import com.erui.order.common.pojo.request.InspectReportSaveRequest;
import com.erui.order.common.pojo.response.InspectReportDetailResponse;
import com.erui.order.common.pojo.response.InspectReportListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InspectReportMapper;
import com.erui.order.model.entity.InspectReport;
import com.erui.order.model.entity.InspectReportExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.InspectReportService;
import com.erui.order.service.util.InspectReportFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
public class InspectReportServiceImpl implements InspectReportService {
    private static Logger LOGGER = LoggerFactory.getLogger(InspectReportServiceImpl.class);
    @Autowired
    private InspectReportMapper inspectReportMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(InspectReportSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        InspectReport InspectReport = InspectReportFactory.InspectReport(insertRequest);
        InspectReport.setCreateTime(new Date());
        InspectReport.setCreateUserId(userInfo.getId());
        int insertNum = inspectReportMapper.insert(InspectReport);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long InspectReportId = InspectReport.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.INSPECT_REPORT, InspectReportId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return InspectReportId;
    }

    @Override
    public void update(Long id, InspectReportSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectReport InspectReport = inspectReportMapper.selectByPrimaryKey(id);
        if (InspectReport == null) {
            throw new Exception("对象唯一标识错误");
        }
        InspectReportStatusEnum requestStatusEnum = InspectReportStatusEnum.valueOf(updateRequest.getInspectReportStatus());
        if (requestStatusEnum == InspectReportStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        InspectReportStatusEnum statusEnum = InspectReportStatusEnum.valueOf(InspectReport.getInspectReportStatus());
        if (statusEnum != InspectReportStatusEnum.INIT && statusEnum != InspectReportStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long InspectReportId = InspectReport.getId();
        // 修改基本信息
        InspectReport InspectReportSelective = InspectReportFactory.InspectReport(updateRequest);
        InspectReportSelective.setId(InspectReportId);
        InspectReportSelective.setUpdateTime(new Date());
        InspectReportSelective.setUpdateUserId(userInfo.getId());

        inspectReportMapper.updateByPrimaryKeySelective(InspectReportSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSPECT_REPORT, InspectReportId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<InspectReportListResponse> list(InspectReportQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        InspectReportExample example = new InspectReportExample();
        example.setOrderByClause("id desc");
        InspectReportExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andInspectReportStatusEqualTo(queryRequest.getStatus());
        }
        List<InspectReport> InspectReports = inspectReportMapper.selectByExample(example);

        List<InspectReportListResponse> InspectReportListResponses = new ArrayList<>();
        for (InspectReport InspectReport : InspectReports) {
            InspectReportListResponse InspectReportListResponse = InspectReportFactory.InspectReportListResponse(InspectReport);
            InspectReportListResponses.add(InspectReportListResponse);
        }
        // 输出
        Page<InspectReport> page = (Page) InspectReports;
        Pager<InspectReportListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), InspectReportListResponses);
        return pager;
    }

    @Override
    public InspectReportDetailResponse detail(Long id) throws Exception {
        // 准备数据
        InspectReport InspectReport = inspectReportMapper.selectByPrimaryKey(id);
        if (InspectReport == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSPECT_REPORT, id);

        // 组织数据
        InspectReportDetailResponse detail = InspectReportFactory.InspectReportDetailResponse(InspectReport);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

