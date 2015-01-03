package org.javatribe.ams.entity;

import java.util.Date;

public class MessageBoard {
    private Integer meboId;//留言ID

    private Integer userId;//用户ID

    private String meboTitle;//主题

    private String meboContent;//内容

    private String meboPhotoUrl;//图片URL

    private Date meboModifyDate;

    private Date meboCreateDate;//创建日期

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

    public String getMeboTitle() {
        return meboTitle;
    }

    public void setMeboTitle(String meboTitle) {
        this.meboTitle = meboTitle == null ? null : meboTitle.trim();
    }

    public String getMeboContent() {
        return meboContent;
    }

    public void setMeboContent(String meboContent) {
        this.meboContent = meboContent == null ? null : meboContent.trim();
    }

    public String getMeboPhotoUrl() {
        return meboPhotoUrl;
    }

    public void setMeboPhotoUrl(String meboPhotoUrl) {
        this.meboPhotoUrl = meboPhotoUrl == null ? null : meboPhotoUrl.trim();
    }

    public Date getMeboModifyDate() {
        return meboModifyDate;
    }

    public void setMeboModifyDate(Date meboModifyDate) {
        this.meboModifyDate = meboModifyDate;
    }

    public Date getMeboCreateDate() {
        return meboCreateDate;
    }

    public void setMeboCreateDate(Date meboCreateDate) {
        this.meboCreateDate = meboCreateDate;
    }
}