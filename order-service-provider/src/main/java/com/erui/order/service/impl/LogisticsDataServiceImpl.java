package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverDetailStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.LogisticsDataQueryRequest;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverDetailMapper;
import com.erui.order.mapper.LogisticsDataMapper;
import com.erui.order.model.entity.*;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.LogisticsDataInfoService;
import com.erui.order.service.LogisticsDataService;
import com.erui.order.service.util.LogisticsDataFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
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
    private DeliverDetailMapper deliverDetailMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private LogisticsDataInfoService logisticsDataInfoService;

    @Override
    public Long insert(Long deliverDetailId) throws Exception {
        DeliverDetail deliverDetail = deliverDetailMapper.selectByPrimaryKey(deliverDetailId);
        if (deliverDetail == null) {
            throw new Exception("出库信息不存在");
        }
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        LogisticsData logisticsData = new LogisticsData();
        logisticsData.setContractNo(deliverDetail.getContractNo());
        logisticsData.setDeliverDetailNo(deliverDetail.getDeliverDetailNo());
        logisticsData.setTheAwbNo(genLogisticsDataTheAwbNo());
        logisticsData.setLogisticsDataStatus(DeliverDetailStatusEnum.PROCESS_LOGI.getCode());

        logisticsData.setCreateTime(new Date());
        logisticsData.setCreateUserId(userInfo.getId());
        logisticsData.setDeleteFlag(Boolean.FALSE);
        logisticsDataMapper.insert(logisticsData);

        return logisticsData.getId();
    }

    @Override
    public void update(Long id, LogisticsDataSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        LogisticsData logisticsData = logisticsDataMapper.selectByPrimaryKey(id);
        if (logisticsData == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverDetailStatusEnum requestStatusEnum = DeliverDetailStatusEnum.valueOf(updateRequest.getLogisticsDataStatus());
        if (requestStatusEnum != DeliverDetailStatusEnum.PROCESS_LOGI && requestStatusEnum != DeliverDetailStatusEnum.DONE_PROJECT) {
            throw new Exception("请求对象的状态错误");
        }

        DeliverDetailStatusEnum statusEnum = DeliverDetailStatusEnum.valueOf(logisticsData.getLogisticsDataStatus());
        if (statusEnum != DeliverDetailStatusEnum.PROCESS_LOGI) {
            throw new Exception("对象当前状态错误");
        }

        Long logisticsDataId = logisticsData.getId();
        // 修改基本信息
        LogisticsData LogisticsDataSelective = LogisticsDataFactory.logisticsData(updateRequest);
        LogisticsDataSelective.setId(logisticsDataId);
        LogisticsDataSelective.setUpdateTime(new Date());
        LogisticsDataSelective.setUpdateUserId(userInfo.getId());

        logisticsDataMapper.updateByPrimaryKeySelective(LogisticsDataSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.LOGISTICS_DATA, logisticsDataId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<LogisticsDataListResponse> list(LogisticsDataQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        LogisticsDataExample example = new LogisticsDataExample();
        example.setOrderByClause("id desc");
        LogisticsDataExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getDeliverDetailNo())) {
            criteria.andDeliverDetailNoLike("%" + queryRequest.getDeliverDetailNo() + "%");
        }
        if (queryRequest.getReleaseDate() != null) {
            criteria.andReleaseDateEqualTo(queryRequest.getReleaseDate());
        }
        DeliverDetailStatusEnum deliverDetailStatusEnum = DeliverDetailStatusEnum.valueOf(queryRequest.getLogisticsDataStatus());
        if (deliverDetailStatusEnum != null) {
            criteria.andLogisticsDataStatusEqualTo(deliverDetailStatusEnum.getCode());
        }
        List<LogisticsData> logisticsDataList = logisticsDataMapper.selectByExample(example);

        List<LogisticsDataListResponse> logisticsDataListResponses = new ArrayList<>();
        for (LogisticsData logisticsData : logisticsDataList) {
            LogisticsDataListResponse logisticsDataListResponse = LogisticsDataFactory.logisticsDataListResponse(logisticsData);


            logisticsDataListResponses.add(logisticsDataListResponse);
        }
        // 输出
        Page<LogisticsData> page = (Page) logisticsDataList;
        Pager<LogisticsDataListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), logisticsDataListResponses);
        return pager;
    }

    @Override
    public LogisticsDataDetailResponse detail(Long id) throws Exception {
        // 准备数据
        LogisticsData logisticsData = logisticsDataMapper.selectByPrimaryKey(id);
        if (logisticsData == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.LOGISTICS_DATA, id);
        List<LogisticsDataInfoDetailResponse> logisticsDataInfoDetailResponses = logisticsDataInfoService.listByLogisticsDataId(id);


        // 组织数据
        LogisticsDataDetailResponse detail = LogisticsDataFactory.LogisticsDataDetailResponse(logisticsData);
        detail.setAttachments(attachmentInfos);
        detail.setLogisticsDataInfoList(logisticsDataInfoDetailResponses);

        return detail;
    }


    // 生成运单号
    public String genLogisticsDataTheAwbNo() {
        String prefix = DateFormatUtils.format(new Date(), "yyyy");
        int number = 1;
        PageHelper.startPage(1, 1);
        LogisticsDataExample example = new LogisticsDataExample();
        example.setOrderByClause("the_awb_no desc");
        example.createCriteria().andTheAwbNoLike(prefix + "%");

        List<LogisticsData> logisticsDataList = logisticsDataMapper.selectByExample(example);
        if (logisticsDataList != null && logisticsDataList.size() > 0) {
            String inspectApplyNo = logisticsDataList.get(0).getTheAwbNo();
            String substring = inspectApplyNo.substring(prefix.length());
            if (StringUtils.isNumeric(substring)) {
                number = Integer.parseInt(substring);
                ++number;
            }
        }
        return String.format("%s%s", prefix, InspectApplyServiceImpl.APPLY_NO_FORMAT.format(number));
    }

}

