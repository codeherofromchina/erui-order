package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InspectApplyStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.InspectApplyQueryRequest;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InspectApplyMapper;
import com.erui.order.model.entity.InspectApply;
import com.erui.order.model.entity.InspectApplyExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.InspectApplyService;
import com.erui.order.service.util.InspectApplyFactory;
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
public class InspectApplyServiceImpl implements InspectApplyService {
    private static Logger LOGGER = LoggerFactory.getLogger(InspectApplyServiceImpl.class);
    @Autowired
    private InspectApplyMapper InspectApplyMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(InspectApplySaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        InspectApply InspectApply = InspectApplyFactory.InspectApply(insertRequest);
        InspectApply.setCreateTime(new Date());
        InspectApply.setCreateUserId(userInfo.getId());
        int insertNum = InspectApplyMapper.insert(InspectApply);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long InspectApplyId = InspectApply.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.INSPECT_APPLY, InspectApplyId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return InspectApplyId;
    }

    @Override
    public void update(Long id, InspectApplySaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectApply InspectApply = InspectApplyMapper.selectByPrimaryKey(id);
        if (InspectApply == null) {
            throw new Exception("对象唯一标识错误");
        }
        InspectApplyStatusEnum requestStatusEnum = InspectApplyStatusEnum.valueOf(updateRequest.getInspectApplyStatus());
        if (requestStatusEnum == InspectApplyStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        InspectApplyStatusEnum statusEnum = InspectApplyStatusEnum.valueOf(InspectApply.getInspectApplyStatus());
        if (statusEnum != InspectApplyStatusEnum.INIT && statusEnum != InspectApplyStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long InspectApplyId = InspectApply.getId();
        // 修改基本信息
        InspectApply InspectApplySelective = InspectApplyFactory.InspectApply(updateRequest);
        InspectApplySelective.setId(InspectApplyId);
        InspectApplySelective.setUpdateTime(new Date());
        InspectApplySelective.setUpdateUserId(userInfo.getId());

        InspectApplyMapper.updateByPrimaryKeySelective(InspectApplySelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSPECT_APPLY, InspectApplyId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<InspectApplyListResponse> list(InspectApplyQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        InspectApplyExample example = new InspectApplyExample();
        example.setOrderByClause("id desc");
        InspectApplyExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andInspectApplyStatusEqualTo(queryRequest.getStatus());
        }
        List<InspectApply> InspectApplys = InspectApplyMapper.selectByExample(example);

        List<InspectApplyListResponse> InspectApplyListResponses = new ArrayList<>();
        for (InspectApply InspectApply : InspectApplys) {
            InspectApplyListResponse InspectApplyListResponse = InspectApplyFactory.InspectApplyListResponse(InspectApply);
            InspectApplyListResponses.add(InspectApplyListResponse);
        }
        // 输出
        Page<InspectApply> page = (Page) InspectApplys;
        Pager<InspectApplyListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), InspectApplyListResponses);
        return pager;
    }

    @Override
    public InspectApplyDetailResponse detail(Long id) throws Exception {
        // 准备数据
        InspectApply InspectApply = InspectApplyMapper.selectByPrimaryKey(id);
        if (InspectApply == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSPECT_APPLY, id);

        // 组织数据
        InspectApplyDetailResponse detail = InspectApplyFactory.InspectApplyDetailResponse(InspectApply);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

