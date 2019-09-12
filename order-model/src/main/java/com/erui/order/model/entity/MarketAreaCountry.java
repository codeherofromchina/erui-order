package com.erui.order.model.entity;

import java.util.Date;

public class MarketAreaCountry extends MarketAreaCountryKey {
    private String status;

    private Date createdAt;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}