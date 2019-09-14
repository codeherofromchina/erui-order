package com.erui.order.model.entity;

public class Org {
    private Long id;

    private String membership;

    private Long parentId;

    private String orgNameEn;

    private String orgName;

    private String orgStatus;

    private String deletedFlag;

    private String orgNode;

    private String usedForGoods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrgNameEn() {
        return orgNameEn;
    }

    public void setOrgNameEn(String orgNameEn) {
        this.orgNameEn = orgNameEn;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getOrgNode() {
        return orgNode;
    }

    public void setOrgNode(String orgNode) {
        this.orgNode = orgNode;
    }

    public String getUsedForGoods() {
        return usedForGoods;
    }

    public void setUsedForGoods(String usedForGoods) {
        this.usedForGoods = usedForGoods;
    }
}