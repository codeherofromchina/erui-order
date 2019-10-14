package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.LogisticsDataInfoSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.LogisticsDataInfoMapper;
import com.erui.order.model.entity.LogisticsDataInfo;
import com.erui.order.model.entity.LogisticsDataInfoExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.LogisticsDataInfoService;
import com.erui.order.service.PortService;
import com.erui.order.service.util.LogisticsDataInfoFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class LogisticsDataInfoServiceImpl implements LogisticsDataInfoService {
    private static Logger LOGGER = LoggerFactory.getLogger(LogisticsDataInfoServiceImpl.class);
    @Autowired
    private LogisticsDataInfoMapper logisticsDataInfoMapper;
    @Autowired
    private PortService portService;
    @Autowired
    private AttachmentService attachmentService;


    @Override
    public void insertOnDuplicateIdUpdate(Long logisticsDataId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception {
        if (logisticsDataId == null) {
            throw new Exception("物流跟踪ID错误");
        }
        List<LogisticsDataInfo> logisticsDataInfos = listByLogisticsDataId02(logisticsDataId);
        Set<Long> logisticsDataInfoIds = logisticsDataInfos.stream().map(LogisticsDataInfo::getId).collect(Collectors.toSet());


        Long infoId = logisticsDataInfoSaveRequest.getId();
        if (infoId == null) {
            insert(logisticsDataId, logisticsDataInfoSaveRequest);
        } else if (logisticsDataInfoIds.remove(infoId)) {
            // 更新操作
            updateById(infoId, logisticsDataInfoSaveRequest);
        } else {
            // 抛出异常，不是给定业务数据
            throw new Exception("物流跟踪信息错误");
        }
    }


    @Override
    public Long insert(Long logisticsDataId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception {
        LogisticsDataInfo logisticsDataInfo = LogisticsDataInfoFactory.logisticsDataInfo(logisticsDataInfoSaveRequest);
        // 验证描述是否重复
        Short dynamicDescription = logisticsDataInfo.getDynamicDescription();
        if (dynamicDescription != null && dynamicDescription != 5 && listByLogisticsDataIdAndDynamicDescription(logisticsDataId, dynamicDescription) != null) {
            throw new Exception("动态物流描述除其他外不能重复");
        }

        logisticsDataInfo.setPortNameZh(portService.findPortNameByBn(logisticsDataInfo.getPortName()));
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        logisticsDataInfo.setLogisticsDataId(logisticsDataId);
        if (userInfo != null) {
            logisticsDataInfo.setCreateUserId(userInfo.getId());
        }
        logisticsDataInfo.setCreateTime(new Date());
        logisticsDataInfo.setDeleteFlag(Boolean.FALSE);

        logisticsDataInfoMapper.insert(logisticsDataInfo);

        Long id = logisticsDataInfo.getId();

        // 对象附件
        List<AttachmentInfo> attachments = new ArrayList<>();
        AttachmentInfo attachment = logisticsDataInfoSaveRequest.getAttachment();
        if (attachment != null) {
            attachments.add(attachment);
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.LOGISTICS_DATA_INFO, id, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            throw new Exception("对象附件数据操作失败");
        }
        return id;
    }


    /**
     * 删除采购合同商品
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
        LogisticsDataInfoExample example = new LogisticsDataInfoExample();
        example.createCriteria().andIdIn(idList);

        LogisticsDataInfo LogisticsDataInfoSelective = new LogisticsDataInfo();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            LogisticsDataInfoSelective.setUpdateUserId(userInfo.getId());
        }
        LogisticsDataInfoSelective.setDeleteFlag(Boolean.TRUE);
        LogisticsDataInfoSelective.setDeleteTime(new Date());

        logisticsDataInfoMapper.updateByExampleSelective(LogisticsDataInfoSelective, example);
    }

    @Override
    public int updateById(Long logisticsDataInfoId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception {
        LogisticsDataInfo logisticsDataInfo = logisticsDataInfoMapper.selectByPrimaryKey(logisticsDataInfoId);
        if (logisticsDataInfo == null) {
            throw new Exception("物流不存在");
        }

        LogisticsDataInfo logisticsDataInfoSelective = LogisticsDataInfoFactory.logisticsDataInfo(logisticsDataInfoSaveRequest);

        if (logisticsDataInfoSelective.getDynamicDescription() != null && logisticsDataInfoSelective.getDynamicDescription() != 5) {
            // 除其他描述外另外的需要验证重复
            if (logisticsDataInfo.getDynamicDescription() != null && logisticsDataInfoSelective.getDynamicDescription().shortValue() != logisticsDataInfo.getDynamicDescription()) {

                List<LogisticsDataInfo> logisticsDataInfos = listByLogisticsDataIdAndDynamicDescription(logisticsDataInfo.getLogisticsDataId(), logisticsDataInfoSelective.getDynamicDescription());
                if (logisticsDataInfos != null) {
                    throw new Exception("动态物流描述除其他外不能重复");
                }
            }
        }

        logisticsDataInfoSelective.setId(logisticsDataInfoId);
        logisticsDataInfoSelective.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        logisticsDataInfoSelective.setUpdateUserId(userInfo.getId());

        int updateNum = logisticsDataInfoMapper.updateByPrimaryKeySelective(logisticsDataInfoSelective);

        // 对象附件
        List<AttachmentInfo> attachments = new ArrayList<>();
        AttachmentInfo attachment = logisticsDataInfoSaveRequest.getAttachment();
        if (attachment != null) {
            attachments.add(attachment);
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.LOGISTICS_DATA_INFO, logisticsDataInfoId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            throw new Exception("对象附件数据操作失败");
        }

        return updateNum;
    }

    @Override
    public List<LogisticsDataInfoDetailResponse> listByLogisticsDataId(Long logisticsDataId) {
        List<LogisticsDataInfo> logisticsDataInfos = listByLogisticsDataId02(logisticsDataId);
        List<LogisticsDataInfoDetailResponse> logisticsDataInfoDetailResponses = LogisticsDataInfoFactory.logisticsDataDetailResponse(logisticsDataInfos);
        for (LogisticsDataInfoDetailResponse response : logisticsDataInfoDetailResponses) {
            List<AttachmentInfo> attachmentInfoList = attachmentService.list(AttachmentTargetObjEnum.LOGISTICS_DATA_INFO, response.getId());
            if (attachmentInfoList != null && attachmentInfoList.size() > 0) {
                response.setAttachment(attachmentInfoList.get(0));
            }
        }
        return logisticsDataInfoDetailResponses;
    }


    @Override
    public LogisticsDataInfoDetailResponse detail(Long id) {
        LogisticsDataInfo logisticsDataInfo = logisticsDataInfoMapper.selectByPrimaryKey(id);
        LogisticsDataInfoDetailResponse logisticsDataInfoDetailResponse = LogisticsDataInfoFactory.logisticsDataDetailResponse(logisticsDataInfo);
        List<AttachmentInfo> attachmentInfoList = attachmentService.list(AttachmentTargetObjEnum.LOGISTICS_DATA_INFO, logisticsDataInfoDetailResponse.getId());
        if (attachmentInfoList != null && attachmentInfoList.size() > 0) {
            logisticsDataInfoDetailResponse.setAttachment(attachmentInfoList.get(0));
        }
        return logisticsDataInfoDetailResponse;
    }

    private List<LogisticsDataInfo> listByLogisticsDataId02(Long logisticsDataId) {
        LogisticsDataInfoExample example = new LogisticsDataInfoExample();
        example.createCriteria().andLogisticsDataIdEqualTo(logisticsDataId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<LogisticsDataInfo> logisticsDataInfoList = logisticsDataInfoMapper.selectByExample(example);
        if (logisticsDataInfoList == null) {
            logisticsDataInfoList = new ArrayList<>();
        }
        return logisticsDataInfoList;
    }

    /**
     * 根据描述查找动态物流信息
     *
     * @param logisticsDataId
     * @param dynamicDescription
     * @return
     */
    private List<LogisticsDataInfo> listByLogisticsDataIdAndDynamicDescription(Long logisticsDataId, Short dynamicDescription) {
        LogisticsDataInfoExample example = new LogisticsDataInfoExample();
        example.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE).andLogisticsDataIdEqualTo(logisticsDataId).andDynamicDescriptionEqualTo(dynamicDescription);
        List<LogisticsDataInfo> logisticsDataInfos = logisticsDataInfoMapper.selectByExample(example);
        if (logisticsDataInfos != null && logisticsDataInfos.size() > 0) {
            return logisticsDataInfos;
        }
        return null;
    }

}

