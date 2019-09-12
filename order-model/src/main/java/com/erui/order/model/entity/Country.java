package com.erui.order.model.entity;

public class Country {
    private Long id;

    private String lang;

    private String regionBn;

    private String code;

    private String bn;

    private String countryName;

    private String intTelCode;

    private Long timeZone;

    private String status;

    private String deletedFlag;

    private String ediCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRegionBn() {
        return regionBn;
    }

    public void setRegionBn(String regionBn) {
        this.regionBn = regionBn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIntTelCode() {
        return intTelCode;
    }

    public void setIntTelCode(String intTelCode) {
        this.intTelCode = intTelCode;
    }

    public Long getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Long timeZone) {
        this.timeZone = timeZone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getEdiCode() {
        return ediCode;
    }

    public void setEdiCode(String ediCode) {
        this.ediCode = ediCode;
    }
}