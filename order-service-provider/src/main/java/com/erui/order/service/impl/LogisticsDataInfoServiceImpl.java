package com.erui.order.service.impl;

import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.LogisticsDataInfoSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.LogisticsDataInfoMapper;
import com.erui.order.model.entity.LogisticsDataInfo;
import com.erui.order.model.entity.LogisticsDataInfoExample;
import com.erui.order.service.LogisticsDataInfoService;
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
    public int insert(Long logisticsDataId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) {
        LogisticsDataInfo logisticsDataInfo = LogisticsDataInfoFactory.logisticsDataInfo(logisticsDataInfoSaveRequest);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        logisticsDataInfo.setLogisticsDataId(logisticsDataId);
        if (userInfo != null) {
            logisticsDataInfo.setCreateUserId(userInfo.getId());
        }
        logisticsDataInfo.setCreateTime(new Date());
        logisticsDataInfo.setDeleteFlag(Boolean.FALSE);
        return logisticsDataInfoMapper.insert(logisticsDataInfo);
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
        LogisticsDataInfo LogisticsDataInfo = logisticsDataInfoMapper.selectByPrimaryKey(logisticsDataInfoId);
        if (LogisticsDataInfo == null) {
            throw new Exception("物流不存在");
        }

        LogisticsDataInfo logisticsDataInfo = LogisticsDataInfoFactory.logisticsDataInfo(logisticsDataInfoSaveRequest);
        logisticsDataInfo.setId(logisticsDataInfoId);
        logisticsDataInfo.setUpdateTime(new Date());
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            logisticsDataInfo.setUpdateUserId(userInfo.getId());
        }

        return logisticsDataInfoMapper.updateByPrimaryKeySelective(logisticsDataInfo);
    }

    @Override
    public List<LogisticsDataInfoDetailResponse> listByLogisticsDataId(Long logisticsDataId) {
        List<LogisticsDataInfo> LogisticsDataInfoList = listByLogisticsDataId02(logisticsDataId);
        return LogisticsDataInfoFactory.logisticsDataDetailResponse(LogisticsDataInfoList);
    }


    @Override
    public LogisticsDataInfoDetailResponse detail(Long id) {
        LogisticsDataInfo logisticsDataInfo = logisticsDataInfoMapper.selectByPrimaryKey(id);
        return LogisticsDataInfoFactory.logisticsDataDetailResponse(logisticsDataInfo);
    }

    private List<LogisticsDataInfo> listByLogisticsDataId02(Long logisticsDataId) {
        LogisticsDataInfoExample example = new LogisticsDataInfoExample();
        example.createCriteria().andLogisticsDataIdEqualTo(logisticsDataId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<LogisticsDataInfo> LogisticsDataInfoList = logisticsDataInfoMapper.selectByExample(example);
        if (LogisticsDataInfoList == null) {
            LogisticsDataInfoList = new ArrayList<>();
        }
        return LogisticsDataInfoList;
    }
}

