package com.erui.order.service;

import com.erui.order.common.pojo.ProjectProfitInfo;

public interface ProjectProfitService {

    int insertOnDuplicateProjectIdUpdate(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    int insert(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    int updateByProjectId(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    ProjectProfitInfo findByProjectId(Long projectId);
}

