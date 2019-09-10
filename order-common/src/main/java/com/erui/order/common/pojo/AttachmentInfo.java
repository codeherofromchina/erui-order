package com.erui.order.common.pojo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/7/29 下午4:10
 *  OK 附件
 */
public class AttachmentInfo {
    private Long id;
    // 附件分组（在fastdfs中的分组）
    private String attachGroup;
    // 附件名称
    private String title;
    // 附件地址（在fastdfs中的fileId）
    private String url;
    // 前端显示上传时间
    private Date createTime;
    // 附件类型（在不同实体中类型意义不同）
    private Short attachType;
    /**
     * 附件的创建人
     */
    private String createUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttachGroup() {
        return attachGroup;
    }

    public void setAttachGroup(String attachGroup) {
        this.attachGroup = attachGroup;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getAttachType() {
        return attachType;
    }

    public void setAttachType(Short attachType) {
        this.attachType = attachType;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
}
