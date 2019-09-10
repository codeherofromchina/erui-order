package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InstockStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.InstockQueryRequest;
import com.erui.order.common.pojo.request.InstockSaveRequest;
import com.erui.order.common.pojo.response.InstockDetailResponse;
import com.erui.order.common.pojo.response.InstockListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InstockMapper;
import com.erui.order.model.entity.Instock;
import com.erui.order.model.entity.InstockExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.InstockService;
import com.erui.order.service.util.InstockFactory;
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
public class InstockServiceImpl implements InstockService {
    private static Logger LOGGER = LoggerFactory.getLogger(InstockServiceImpl.class);
    @Autowired
    private InstockMapper instockMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(InstockSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        Instock Instock = InstockFactory.Instock(insertRequest);
        Instock.setCreateTime(new Date());
        Instock.setCreateUserId(userInfo.getId());
        int insertNum = instockMapper.insert(Instock);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long InstockId = Instock.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.INSTOCK, InstockId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return InstockId;
    }

    @Override
    public void update(Long id, InstockSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Instock Instock = instockMapper.selectByPrimaryKey(id);
        if (Instock == null) {
            throw new Exception("对象唯一标识错误");
        }
        InstockStatusEnum requestStatusEnum = InstockStatusEnum.valueOf(updateRequest.getInstockStatus());
        if (requestStatusEnum == InstockStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        InstockStatusEnum statusEnum = InstockStatusEnum.valueOf(Instock.getInstockStatus());
        if (statusEnum != InstockStatusEnum.INIT && statusEnum != InstockStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long InstockId = Instock.getId();
        // 修改基本信息
        Instock InstockSelective = InstockFactory.Instock(updateRequest);
        InstockSelective.setId(InstockId);
        InstockSelective.setUpdateTime(new Date());
        InstockSelective.setUpdateUserId(userInfo.getId());

        instockMapper.updateByPrimaryKeySelective(InstockSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSTOCK, InstockId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<InstockListResponse> list(InstockQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPageNum(), queryRequest.getPageSize());

        InstockExample example = new InstockExample();
        example.setOrderByClause("id desc");
        InstockExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andInstockStatusEqualTo(queryRequest.getStatus());
        }
        List<Instock> Instocks = instockMapper.selectByExample(example);

        List<InstockListResponse> InstockListResponses = new ArrayList<>();
        for (Instock Instock : Instocks) {
            InstockListResponse InstockListResponse = InstockFactory.InstockListResponse(Instock);
            InstockListResponses.add(InstockListResponse);
        }
        // 输出
        Page<Instock> page = (Page) Instocks;
        Pager<InstockListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), InstockListResponses);
        return pager;
    }

    @Override
    public InstockDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Instock Instock = instockMapper.selectByPrimaryKey(id);
        if (Instock == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSTOCK, id);

        // 组织数据
        InstockDetailResponse detail = InstockFactory.InstockDetailResponse(Instock);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

