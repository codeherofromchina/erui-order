package com.erui.order.service;

import com.erui.order.common.pojo.request.LogisticsDataInfoSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;

import java.util.List;

public interface LogisticsDataInfoService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param logisticsDataId
     * @return
     * @throws Exception
     */
    void insertOnDuplicateIdUpdate(Long logisticsDataId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception;


    Long insert(Long logisticsDataId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception;

    void delete(Long... ids);

    int updateById(Long logisticsDataInfoId, LogisticsDataInfoSaveRequest logisticsDataInfoSaveRequest) throws Exception;

    List<LogisticsDataInfoDetailResponse> listByLogisticsDataId(Long parentId);

    LogisticsDataInfoDetailResponse detail(Long id);
}

