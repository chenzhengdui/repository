package org.javatribe.ams.entity;

import java.util.Date;

public class Scrap {
    private Integer acraId;

    private Integer userId;//用户ID

    private Integer asseId;//资产ID

    private String scraAddress;//资产的地址

    private String scraReason;//报废原因

    private String scraPhone;//用户的联系方式

    private String scraNote;//备注

    private Boolean scraStatus;//报废处理状态（0：未处理  1：已处理）

    private Date scraModifyDate;

    private Date scraCreateDate;//报废请求的日期

    public Integer getAcraId() {
        return acraId;
    }

    public void setAcraId(Integer acraId) {
        this.acraId = acraId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAsseId() {
        return asseId;
    }

    public void setAsseId(Integer asseId) {
        this.asseId = asseId;
    }

    public String getScraAddress() {
        return scraAddress;
    }

    public void setScraAddress(String scraAddress) {
        this.scraAddress = scraAddress == null ? null : scraAddress.trim();
    }

    public String getScraReason() {
        return scraReason;
    }

    public void setScraReason(String scraReason) {
        this.scraReason = scraReason == null ? null : scraReason.trim();
    }

    public String getScraPhone() {
        return scraPhone;
    }

    public void setScraPhone(String scraPhone) {
        this.scraPhone = scraPhone == null ? null : scraPhone.trim();
    }

    public String getScraNote() {
        return scraNote;
    }

    public void setScraNote(String scraNote) {
        this.scraNote = scraNote == null ? null : scraNote.trim();
    }

    public Boolean getScraStatus() {
        return scraStatus;
    }

    public void setScraStatus(Boolean scraStatus) {
        this.scraStatus = scraStatus;
    }

    public Date getScraModifyDate() {
        return scraModifyDate;
    }

    public void setScraModifyDate(Date scraModifyDate) {
        this.scraModifyDate = scraModifyDate;
    }

    public Date getScraCreateDate() {
        return scraCreateDate;
    }

    public void setScraCreateDate(Date scraCreateDate) {
        this.scraCreateDate = scraCreateDate;
    }
}