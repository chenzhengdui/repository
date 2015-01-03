package org.javatribe.ams.entity;

import java.util.Date;

public class MessageBoardComments {
    private Integer mbcoId;//留言回复ID

    private Integer meboId;//留言ID

    private Integer userId;//用户ID

    private String mbcoContent;//回复内容

    private Date mbcoModifyDate;

    private Date mbcoCreateDate;//创建日期

    public Integer getMbcoId() {
        return mbcoId;
    }

    public void setMbcoId(Integer mbcoId) {
        this.mbcoId = mbcoId;
    }

    public Integer getMeboId() {
        return meboId;
    }

    public void setMeboId(Integer meboId) {
        this.meboId = meboId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMbcoContent() {
        return mbcoContent;
    }

    public void setMbcoContent(String mbcoContent) {
        this.mbcoContent = mbcoContent == null ? null : mbcoContent.trim();
    }

    public Date getMbcoModifyDate() {
        return mbcoModifyDate;
    }

    public void setMbcoModifyDate(Date mbcoModifyDate) {
        this.mbcoModifyDate = mbcoModifyDate;
    }

    public Date getMbcoCreateDate() {
        return mbcoCreateDate;
    }

    public void setMbcoCreateDate(Date mbcoCreateDate) {
        this.mbcoCreateDate = mbcoCreateDate;
    }
}