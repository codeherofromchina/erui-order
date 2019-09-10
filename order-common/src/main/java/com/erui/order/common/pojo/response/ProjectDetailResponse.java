package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.ProjectProfitInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:49
 */
public class ProjectDetailResponse {
    private Long id;
    private String projectName;

    private ProjectProfitInfo projectProfit;
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
