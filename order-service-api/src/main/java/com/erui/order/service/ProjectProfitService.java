package com.erui.order.service;

import com.erui.order.common.pojo.ProjectProfitInfo;

public interface ProjectProfitService {

    int insertOnDuplicateProjectIdUpdate(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    public int insert(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    public int updateByProjectId(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception;

    public ProjectProfitInfo findByProjectId(Long projectId);
}

