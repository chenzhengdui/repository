package org.javatribe.ams.entity;

import java.util.Date;

public class Feedback {
    private Integer feedId;//意见反馈ID

    private Integer userId;//用户ID

    private String feedTitle;//意见反馈的主题

    private String feedContent;//意见反馈的内容

    private Boolean feedStatus;//状态（0：未处理  1：已处理）

    private Date feedModifyDate;

    private Date feedCreateDate;//意见反馈的日期

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFeedTitle() {
        return feedTitle;
    }

    public void setFeedTitle(String feedTitle) {
        this.feedTitle = feedTitle == null ? null : feedTitle.trim();
    }

    public String getFeedContent() {
        return feedContent;
    }

    public void setFeedContent(String feedContent) {
        this.feedContent = feedContent == null ? null : feedContent.trim();
    }

    public Boolean getFeedStatus() {
        return feedStatus;
    }

    public void setFeedStatus(Boolean feedStatus) {
        this.feedStatus = feedStatus;
    }

    public Date getFeedModifyDate() {
        return feedModifyDate;
    }

    public void setFeedModifyDate(Date feedModifyDate) {
        this.feedModifyDate = feedModifyDate;
    }

    public Date getFeedCreateDate() {
        return feedCreateDate;
    }

    public void setFeedCreateDate(Date feedCreateDate) {
        this.feedCreateDate = feedCreateDate;
    }
}