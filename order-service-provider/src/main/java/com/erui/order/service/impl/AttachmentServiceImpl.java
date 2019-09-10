package com.erui.order.service.impl;

import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.AttachmentMapper;
import com.erui.order.model.entity.Attachment;
import com.erui.order.model.entity.AttachmentExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午9:50
 */
@Service
@Transactional
public class AttachmentServiceImpl implements AttachmentService {
    private static Logger LOGGER = LoggerFactory.getLogger(AttachmentServiceImpl.class);

    @Autowired
    private AttachmentMapper attachmentMapper;
    @Autowired
    private UserService userService;

    @Override
    public int insert(AttachmentTargetObjEnum targetObj, Long targetObjId, List<AttachmentInfo> attachmentInfos) {
        int insertNum = 0;
        for (AttachmentInfo attachmentInfo : attachmentInfos) {
            insertNum += insert(targetObj, targetObjId, attachmentInfo);
        }
        return insertNum;
    }

    @Override
    public int insert(AttachmentTargetObjEnum targetObj, Long targetObjId, AttachmentInfo attachmentInfo) {
        Attachment attachment = new Attachment();
        attachment.setAttachGroup(attachmentInfo.getAttachGroup());
        attachment.setTitle(attachmentInfo.getTitle());
        attachment.setUrl(attachmentInfo.getUrl());
        attachment.setAttachType(attachmentInfo.getAttachType());
        attachment.setTargetObjId(targetObjId);
        attachment.setTargetObjTable(targetObj.getCode());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            attachment.setCreateUserId(userInfo.getId());
        }
        attachment.setCreateTime(new Date());
        attachment.setDeleteFlag(Boolean.FALSE);
        return attachmentMapper.insert(attachment);
    }


    @Override
    public int insertOnDuplicateIdUpdate(AttachmentTargetObjEnum targetObj, Long targetObjId, List<AttachmentInfo> attachmentInfos) throws Exception {
        AttachmentExample example = new AttachmentExample();
        example.createCriteria().andTargetObjTableEqualTo(targetObj.getCode())
                .andTargetObjIdEqualTo(targetObjId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<Attachment> attachments = attachmentMapper.selectByExample(example);
        Set<Long> attachmentIds = attachments.stream().map(Attachment::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (AttachmentInfo attachmentInfo : attachmentInfos) {
            Long id = attachmentInfo.getId();
            if (id == null) {
                updateNum += insert(targetObj, targetObjId, attachmentInfo);
            } else if (attachmentIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, attachmentInfo);
            } else {
                // 抛出异常，不是给定业务附件
                throw new Exception("附件错误");
            }
        }

        // 删除不存在的附件
        if (attachmentIds.size() > 0) {
            delete(attachmentIds.toArray(new Long[attachmentIds.size()]));
        }
        return updateNum;
    }

    /**
     * 删除附件
     * 设置附件的删除标志位为true
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) {
        if (ids == null || ids.length == 0) {
            return;
        }
        List<Long> idList = Arrays.asList(ids);
        AttachmentExample example = new AttachmentExample();
        example.createCriteria().andIdIn(idList);

        Attachment attachmentSelective = new Attachment();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            attachmentSelective.setUpdateUserId(userInfo.getId());
        }
        attachmentSelective.setDeleteFlag(Boolean.TRUE);
        attachmentSelective.setDeleteTime(new Date());
        attachmentMapper.updateByExampleSelective(attachmentSelective, example);
    }


    @Override
    public int updateById(Long id, AttachmentInfo attachmentInfo) throws Exception {
        Attachment attachment = attachmentMapper.selectByPrimaryKey(id);
        if (attachment == null) {
            throw new Exception("附件不存在");
        }
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            attachment.setUpdateUserId(userInfo.getId());
        }
        attachment.setUpdateTime(new Date());
        attachment.setAttachGroup(attachmentInfo.getAttachGroup());
        attachment.setTitle(attachmentInfo.getTitle());
        attachment.setUrl(attachmentInfo.getUrl());
        attachment.setAttachType(attachmentInfo.getAttachType());
        return attachmentMapper.updateByPrimaryKey(attachment);
    }


    @Override
    public List<AttachmentInfo> list(AttachmentTargetObjEnum targetObj, Long targetObjId) {
        AttachmentExample example = new AttachmentExample();
        example.createCriteria().andTargetObjTableEqualTo(targetObj.getCode())
                .andTargetObjIdEqualTo(targetObjId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<Attachment> attachments = attachmentMapper.selectByExample(example);
        // 组织数据
        List<AttachmentInfo> resultList = new ArrayList<>();
        for (Attachment attachment : attachments) {
            AttachmentInfo attachmentInfo = new AttachmentInfo();
            attachmentInfo.setId(attachment.getId());
            attachmentInfo.setAttachGroup(attachment.getAttachGroup());
            attachmentInfo.setTitle(attachment.getTitle());
            attachmentInfo.setUrl(attachment.getUrl());
            attachmentInfo.setCreateTime(attachment.getUpdateTime() == null ? attachment.getCreateTime() : attachment.getUpdateTime());
            attachmentInfo.setAttachType(attachment.getAttachType());
            // 根据用户id获取用户名称
            Long userId = attachment.getUpdateUserId() != null ? attachment.getUpdateUserId() : attachment.getCreateUserId();
            try {
                UserInfo userInfo = userService.findById(userId);
                attachmentInfo.setCreateUserName(userInfo.getUserName());
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("附件用户错误 - attachmentId:{} ", attachment.getId());
            }
            resultList.add(attachmentInfo);
        }
        return resultList;
    }

}
