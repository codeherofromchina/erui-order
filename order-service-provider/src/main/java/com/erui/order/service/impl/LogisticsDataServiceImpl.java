package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.LogisticsDataStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.LogisticsDataQueryRequest;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.LogisticsDataMapper;
import com.erui.order.model.entity.LogisticsData;
import com.erui.order.model.entity.LogisticsDataExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.LogisticsDataService;
import com.erui.order.service.util.LogisticsDataFactory;
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
public class LogisticsDataServiceImpl implements LogisticsDataService {
    private static Logger LOGGER = LoggerFactory.getLogger(LogisticsDataServiceImpl.class);
    @Autowired
    private LogisticsDataMapper logisticsDataMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(LogisticsDataSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        LogisticsData LogisticsData = LogisticsDataFactory.LogisticsData(insertRequest);
        LogisticsData.setCreateTime(new Date());
        LogisticsData.setCreateUserId(userInfo.getId());
        int insertNum = logisticsDataMapper.insert(LogisticsData);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long LogisticsDataId = LogisticsData.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.LOGISTICS_DATA, LogisticsDataId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return LogisticsDataId;
    }

    @Override
    public void update(Long id, LogisticsDataSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LogisticsData LogisticsData = logisticsDataMapper.selectByPrimaryKey(id);
        if (LogisticsData == null) {
            throw new Exception("对象唯一标识错误");
        }
        LogisticsDataStatusEnum requestStatusEnum = LogisticsDataStatusEnum.valueOf(updateRequest.getLogisticsDataStatus());
        if (requestStatusEnum == LogisticsDataStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        LogisticsDataStatusEnum statusEnum = LogisticsDataStatusEnum.valueOf(LogisticsData.getLogisticsDataStatus());
        if (statusEnum != LogisticsDataStatusEnum.INIT && statusEnum != LogisticsDataStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long LogisticsDataId = LogisticsData.getId();
        // 修改基本信息
        LogisticsData LogisticsDataSelective = LogisticsDataFactory.LogisticsData(updateRequest);
        LogisticsDataSelective.setId(LogisticsDataId);
        LogisticsDataSelective.setUpdateTime(new Date());
        LogisticsDataSelective.setUpdateUserId(userInfo.getId());

        logisticsDataMapper.updateByPrimaryKeySelective(LogisticsDataSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.LOGISTICS_DATA, LogisticsDataId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<LogisticsDataListResponse> list(LogisticsDataQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPageNum(), queryRequest.getPageSize());

        LogisticsDataExample example = new LogisticsDataExample();
        example.setOrderByClause("id desc");
        LogisticsDataExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getStatus() != null) {
            criteria.andLogisticsDataStatusEqualTo(queryRequest.getStatus());
        }
        List<LogisticsData> LogisticsDatas = logisticsDataMapper.selectByExample(example);

        List<LogisticsDataListResponse> LogisticsDataListResponses = new ArrayList<>();
        for (LogisticsData LogisticsData : LogisticsDatas) {
            LogisticsDataListResponse LogisticsDataListResponse = LogisticsDataFactory.LogisticsDataListResponse(LogisticsData);
            LogisticsDataListResponses.add(LogisticsDataListResponse);
        }
        // 输出
        Page<LogisticsData> page = (Page) LogisticsDatas;
        Pager<LogisticsDataListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), LogisticsDataListResponses);
        return pager;
    }

    @Override
    public LogisticsDataDetailResponse detail(Long id) throws Exception {
        // 准备数据
        LogisticsData LogisticsData = logisticsDataMapper.selectByPrimaryKey(id);
        if (LogisticsData == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.LOGISTICS_DATA, id);

        // 组织数据
        LogisticsDataDetailResponse detail = LogisticsDataFactory.LogisticsDataDetailResponse(LogisticsData);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

