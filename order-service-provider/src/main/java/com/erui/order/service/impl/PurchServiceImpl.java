package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.PurchStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.PurchQueryRequest;
import com.erui.order.common.pojo.request.PurchSaveRequest;
import com.erui.order.common.pojo.response.PurchDetailResponse;
import com.erui.order.common.pojo.response.PurchListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchMapper;
import com.erui.order.model.entity.Purch;
import com.erui.order.model.entity.PurchExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.PurchService;
import com.erui.order.service.util.PurchFactory;
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
public class PurchServiceImpl implements PurchService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchServiceImpl.class);
    @Autowired
    private PurchMapper purchMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(PurchSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        Purch Purch = PurchFactory.Purch(insertRequest);
        Purch.setCreateTime(new Date());
        Purch.setCreateUserId(userInfo.getId());
        int insertNum = purchMapper.insert(Purch);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long PurchId = Purch.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH, PurchId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return PurchId;
    }

    @Override
    public void update(Long id, PurchSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Purch Purch = purchMapper.selectByPrimaryKey(id);
        if (Purch == null) {
            throw new Exception("对象唯一标识错误");
        }
        PurchStatusEnum requestStatusEnum = PurchStatusEnum.valueOf(updateRequest.getPurchStatus());
        if (requestStatusEnum == PurchStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        PurchStatusEnum statusEnum = PurchStatusEnum.valueOf(Purch.getPurchStatus());
        if (statusEnum != PurchStatusEnum.INIT && statusEnum != PurchStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long PurchId = Purch.getId();
        // 修改基本信息
        Purch PurchSelective = PurchFactory.Purch(updateRequest);
        PurchSelective.setId(PurchId);
        PurchSelective.setUpdateTime(new Date());
        PurchSelective.setUpdateUserId(userInfo.getId());

        purchMapper.updateByPrimaryKeySelective(PurchSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH, PurchId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<PurchListResponse> list(PurchQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchExample example = new PurchExample();
        example.setOrderByClause("id desc");
        PurchExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andPurchStatusEqualTo(queryRequest.getStatus());
        }
        List<Purch> Purchs = purchMapper.selectByExample(example);

        List<PurchListResponse> PurchListResponses = new ArrayList<>();
        for (Purch Purch : Purchs) {
            PurchListResponse PurchListResponse = PurchFactory.PurchListResponse(Purch);
            PurchListResponses.add(PurchListResponse);
        }
        // 输出
        Page<Purch> page = (Page) Purchs;
        Pager<PurchListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), PurchListResponses);
        return pager;
    }

    @Override
    public PurchDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Purch Purch = purchMapper.selectByPrimaryKey(id);
        if (Purch == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH, id);

        // 组织数据
        PurchDetailResponse detail = PurchFactory.PurchDetailResponse(Purch);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

