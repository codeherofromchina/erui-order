package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverDetailStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.DeliverDetailQueryRequest;
import com.erui.order.common.pojo.request.DeliverDetailSaveRequest;
import com.erui.order.common.pojo.response.DeliverDetailDetailResponse;
import com.erui.order.common.pojo.response.DeliverDetailListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverDetailMapper;
import com.erui.order.model.entity.DeliverDetail;
import com.erui.order.model.entity.DeliverDetailExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.DeliverDetailService;
import com.erui.order.service.util.DeliverDetailFactory;
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
public class DeliverDetailServiceImpl implements DeliverDetailService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverDetailServiceImpl.class);
    @Autowired
    private DeliverDetailMapper DeliverDetailMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(DeliverDetailSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        DeliverDetail DeliverDetail = DeliverDetailFactory.DeliverDetail(insertRequest);
        DeliverDetail.setCreateTime(new Date());
        DeliverDetail.setCreateUserId(userInfo.getId());
        int insertNum = DeliverDetailMapper.insert(DeliverDetail);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long DeliverDetailId = DeliverDetail.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_DETAIL, DeliverDetailId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return DeliverDetailId;
    }

    @Override
    public void update(Long id, DeliverDetailSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverDetail DeliverDetail = DeliverDetailMapper.selectByPrimaryKey(id);
        if (DeliverDetail == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverDetailStatusEnum requestStatusEnum = DeliverDetailStatusEnum.valueOf(updateRequest.getDeliverDetailStatus());
        if (requestStatusEnum == DeliverDetailStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        DeliverDetailStatusEnum statusEnum = DeliverDetailStatusEnum.valueOf(DeliverDetail.getDeliverDetailStatus());
        if (statusEnum != DeliverDetailStatusEnum.INIT && statusEnum != DeliverDetailStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long DeliverDetailId = DeliverDetail.getId();
        // 修改基本信息
        DeliverDetail DeliverDetailSelective = DeliverDetailFactory.DeliverDetail(updateRequest);
        DeliverDetailSelective.setId(DeliverDetailId);
        DeliverDetailSelective.setUpdateTime(new Date());
        DeliverDetailSelective.setUpdateUserId(userInfo.getId());

        DeliverDetailMapper.updateByPrimaryKeySelective(DeliverDetailSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_DETAIL, DeliverDetailId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverDetailListResponse> list(DeliverDetailQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        DeliverDetailExample example = new DeliverDetailExample();
        example.setOrderByClause("id desc");
        DeliverDetailExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andDeliverDetailStatusEqualTo(queryRequest.getStatus());
        }
        List<DeliverDetail> DeliverDetails = DeliverDetailMapper.selectByExample(example);

        List<DeliverDetailListResponse> DeliverDetailListResponses = new ArrayList<>();
        for (DeliverDetail DeliverDetail : DeliverDetails) {
            DeliverDetailListResponse DeliverDetailListResponse = DeliverDetailFactory.DeliverDetailListResponse(DeliverDetail);
            DeliverDetailListResponses.add(DeliverDetailListResponse);
        }
        // 输出
        Page<DeliverDetail> page = (Page) DeliverDetails;
        Pager<DeliverDetailListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), DeliverDetailListResponses);
        return pager;
    }

    @Override
    public DeliverDetailDetailResponse detail(Long id) throws Exception {
        // 准备数据
        DeliverDetail DeliverDetail = DeliverDetailMapper.selectByPrimaryKey(id);
        if (DeliverDetail == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_DETAIL, id);

        // 组织数据
        DeliverDetailDetailResponse detail = DeliverDetailFactory.DeliverDetailDetailResponse(DeliverDetail);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

