package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverConsignStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignMapper;
import com.erui.order.model.entity.DeliverConsign;
import com.erui.order.model.entity.DeliverConsignExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.DeliverConsignService;
import com.erui.order.service.util.DeliverConsignFactory;
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
public class DeliverConsignServiceImpl implements DeliverConsignService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignServiceImpl.class);
    @Autowired
    private DeliverConsignMapper DeliverConsignMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(DeliverConsignSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        DeliverConsign DeliverConsign = DeliverConsignFactory.DeliverConsign(insertRequest);
        DeliverConsign.setCreateTime(new Date());
        DeliverConsign.setCreateUserId(userInfo.getId());
        int insertNum = DeliverConsignMapper.insert(DeliverConsign);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long DeliverConsignId = DeliverConsign.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_CONSIGN, DeliverConsignId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return DeliverConsignId;
    }

    @Override
    public void update(Long id, DeliverConsignSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsign DeliverConsign = DeliverConsignMapper.selectByPrimaryKey(id);
        if (DeliverConsign == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverConsignStatusEnum requestStatusEnum = DeliverConsignStatusEnum.valueOf(updateRequest.getDeliverConsignStatus());
        if (requestStatusEnum == DeliverConsignStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

//        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(DeliverConsign.getDeliverConsignStatus());
//        if (statusEnum != DeliverConsignStatusEnum.INIT && statusEnum != DeliverConsignStatusEnum.SAVED) {
//            throw new Exception("对象当前状态错误");
//        }

        Long DeliverConsignId = DeliverConsign.getId();
        // 修改基本信息
        DeliverConsign DeliverConsignSelective = DeliverConsignFactory.DeliverConsign(updateRequest);
        DeliverConsignSelective.setId(DeliverConsignId);
        DeliverConsignSelective.setUpdateTime(new Date());
        DeliverConsignSelective.setUpdateUserId(userInfo.getId());

        DeliverConsignMapper.updateByPrimaryKeySelective(DeliverConsignSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_CONSIGN, DeliverConsignId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverConsignListResponse> list(DeliverConsignQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPageNum(), queryRequest.getPageSize());

        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("id desc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

//        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
//        if (queryRequest.getStatus() != null) {
//            criteria.andDeliverConsignStatusEqualTo(queryRequest.getStatus());
//        }
        List<DeliverConsign> DeliverConsigns = DeliverConsignMapper.selectByExample(example);

        List<DeliverConsignListResponse> DeliverConsignListResponses = new ArrayList<>();
        for (DeliverConsign DeliverConsign : DeliverConsigns) {
            DeliverConsignListResponse DeliverConsignListResponse = DeliverConsignFactory.DeliverConsignListResponse(DeliverConsign);
            DeliverConsignListResponses.add(DeliverConsignListResponse);
        }
        // 输出
        Page<DeliverConsign> page = (Page) DeliverConsigns;
        Pager<DeliverConsignListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), DeliverConsignListResponses);
        return pager;
    }

    @Override
    public DeliverConsignDetailResponse detail(Long id) throws Exception {
        // 准备数据
        DeliverConsign DeliverConsign = DeliverConsignMapper.selectByPrimaryKey(id);
        if (DeliverConsign == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_CONSIGN, id);

        // 组织数据
        DeliverConsignDetailResponse detail = DeliverConsignFactory.DeliverConsignDetailResponse(DeliverConsign);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

