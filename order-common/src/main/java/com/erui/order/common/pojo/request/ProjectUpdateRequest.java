package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.ProjectProfitInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:49
 */
public class ProjectUpdateRequest {
    private Long id;

    private String projectStatus;

    ProjectProfitInfo projectProfit;

    List<AttachmentInfo> attachments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public ProjectProfitInfo getProjectProfit() {
        return projectProfit;
    }

    public void setProjectProfit(ProjectProfitInfo projectProfit) {
        this.projectProfit = projectProfit;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}
