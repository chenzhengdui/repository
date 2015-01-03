package org.javatribe.ams.entity;

import java.util.Date;

public class FeedbackReply {
    private Integer fereId;//意见反馈回复ID

    private Integer feedId;//意见反馈ID

    private Integer admiId;//管理员ID

    private String fereContent;//回复内容

    private Date fereModifyDate;

    private Date fereCreateDate;//回复日期

    public Integer getFereId() {
        return fereId;
    }

    public void setFereId(Integer fereId) {
        this.fereId = fereId;
    }

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public Integer getAdmiId() {
        return admiId;
    }

    public void setAdmiId(Integer admiId) {
        this.admiId = admiId;
    }

    public String getFereContent() {
        return fereContent;
    }

    public void setFereContent(String fereContent) {
        this.fereContent = fereContent == null ? null : fereContent.trim();
    }

    public Date getFereModifyDate() {
        return fereModifyDate;
    }

    public void setFereModifyDate(Date fereModifyDate) {
        this.fereModifyDate = fereModifyDate;
    }

    public Date getFereCreateDate() {
        return fereCreateDate;
    }

    public void setFereCreateDate(Date fereCreateDate) {
        this.fereCreateDate = fereCreateDate;
    }
}