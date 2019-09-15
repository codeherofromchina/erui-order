package com.erui.order.service.util;

import com.erui.order.common.enums.ProcessProgressEnum;
import com.erui.order.common.enums.ProjectStatusEnum;
import com.erui.order.common.pojo.request.ProjectUpdateRequest;
import com.erui.order.common.pojo.response.ProjectDetailResponse;
import com.erui.order.common.pojo.response.ProjectListResponse;
import com.erui.order.model.entity.Project;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class ProjectFactory {

    public static Project project(ProjectUpdateRequest projectUpdateRequest) {
        if (projectUpdateRequest == null) {
            return null;
        }
        Project project = new Project();
        project.setId(projectUpdateRequest.getId());
        project.setDeliveryDate(projectUpdateRequest.getDeliveryDate());
        project.setProjectName(projectUpdateRequest.getProjectName());
        project.setTotalPriceUsd(projectUpdateRequest.getTotalPriceUsd());
        project.setProfitPercent(projectUpdateRequest.getProfitPercent());
        project.setProfit(projectUpdateRequest.getProfit());
        project.setExeChgDate(projectUpdateRequest.getExeChgDate());
        project.setRemarks(projectUpdateRequest.getRemarks());
        project.setProjectStatus(projectUpdateRequest.getProjectStatus());

        return project;
    }

    public static ProjectDetailResponse projectDetailResponse(Project project) {
        if (project == null) {
            return null;
        }
        ProjectDetailResponse projectDetailResponse = new ProjectDetailResponse();
        projectDetailResponse.setId(project.getId());
        projectDetailResponse.setProjectName(project.getProjectName());
        projectDetailResponse.setDeliveryDate(project.getDeliveryDate());
        projectDetailResponse.setTotalPriceUsd(project.getTotalPriceUsd());
        projectDetailResponse.setProfitPercent(project.getProfitPercent());
        projectDetailResponse.setProfit(project.getProfit());
        projectDetailResponse.setExeChgDate(project.getExeChgDate());
        projectDetailResponse.setSendDeptId(project.getSendDeptId());
        projectDetailResponse.setRemarks(project.getRemarks());
        projectDetailResponse.setStartDate(project.getStartDate());
        projectDetailResponse.setProjectStatus(project.getProjectStatus());
        ProjectStatusEnum projectStatusEnum = ProjectStatusEnum.fromCode(project.getProjectStatus());
        if (projectStatusEnum != null) {
            projectDetailResponse.setProjectStatusName(projectStatusEnum.getName());
        }

        return projectDetailResponse;
    }

    public static ProjectListResponse projectListResponse(Project project) {
        if (project == null) {
            return null;
        }
        ProjectListResponse projectListResponse = new ProjectListResponse();
        projectListResponse.setId(project.getId());
        projectListResponse.setContractNo(project.getProjectNo());
        projectListResponse.setProjectNo(project.getProjectNo());
        projectListResponse.setProjectName(project.getProjectName());
        projectListResponse.setSendDeptId(project.getSendDeptId());
        projectListResponse.setBusinessUid(project.getBusinessUid());
        projectListResponse.setCreateTime(project.getCreateTime());
        projectListResponse.setStartDate(project.getStartDate());
        projectListResponse.setProcessProgress(project.getProcessProgress());
        ProcessProgressEnum processProgressEnum = ProcessProgressEnum.fromCode(project.getProcessProgress());
        if (processProgressEnum != null) {
            projectListResponse.setProcessProgressName(processProgressEnum.getName());
        }
        projectListResponse.setProjectStatus(project.getProjectStatus());
        ProjectStatusEnum projectStatusEnum = ProjectStatusEnum.fromCode(project.getProjectStatus());
        if (projectStatusEnum != null) {
            projectListResponse.setProjectStatusName(projectStatusEnum.getName());
        }
        projectListResponse.setPurchReqCreate(project.getPurchReqCreate());

        return projectListResponse;
    }
}
