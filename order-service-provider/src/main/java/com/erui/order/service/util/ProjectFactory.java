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

        return projectDetailResponse;
    }

    public static ProjectListResponse projectListResponse(Project project) {
        if (project == null) {
            return null;
        }
        ProjectListResponse projectListResponse = new ProjectListResponse();
        projectListResponse.setId(project.getId());
        projectListResponse.setProjectNo(project.getProjectNo());
        projectListResponse.setProjectName(project.getProjectName());
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

        return projectListResponse;
    }
}
