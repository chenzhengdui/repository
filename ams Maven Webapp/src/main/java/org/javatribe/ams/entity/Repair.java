package org.javatribe.ams.entity;

import java.util.Date;

public class Repair {
    private Integer repaId;

    private Integer asseId;//资产ID

    private Integer userId;//用户ID

    private String repaAddress;//资产的地址

    private String repaReason;//报修原因

    private String repaNote;//备注

    private String repaPhone;//用户的联系方式

    private Boolean repaStatus;//报修状态（0：未修  1：已修）

    private String repaCommont;//维修后，用户评论

    private Date repaModifyDate;

    private Date repaCreateDate;//报修请求创建日期

    public Integer getRepaId() {
        return repaId;
    }

    public void setRepaId(Integer repaId) {
        this.repaId = repaId;
    }

    public Integer getAsseId() {
        return asseId;
    }

    public void setAsseId(Integer asseId) {
        this.asseId = asseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRepaAddress() {
        return repaAddress;
    }

    public void setRepaAddress(String repaAddress) {
        this.repaAddress = repaAddress == null ? null : repaAddress.trim();
    }

    public String getRepaReason() {
        return repaReason;
    }

    public void setRepaReason(String repaReason) {
        this.repaReason = repaReason == null ? null : repaReason.trim();
    }

    public String getRepaNote() {
        return repaNote;
    }

    public void setRepaNote(String repaNote) {
        this.repaNote = repaNote == null ? null : repaNote.trim();
    }

    public String getRepaPhone() {
        return repaPhone;
    }

    public void setRepaPhone(String repaPhone) {
        this.repaPhone = repaPhone == null ? null : repaPhone.trim();
    }

    public Boolean getRepaStatus() {
        return repaStatus;
    }

    public void setRepaStatus(Boolean repaStatus) {
        this.repaStatus = repaStatus;
    }

    public String getRepaCommont() {
        return repaCommont;
    }

    public void setRepaCommont(String repaCommont) {
        this.repaCommont = repaCommont == null ? null : repaCommont.trim();
    }

    public Date getRepaModifyDate() {
        return repaModifyDate;
    }

    public void setRepaModifyDate(Date repaModifyDate) {
        this.repaModifyDate = repaModifyDate;
    }

    public Date getRepaCreateDate() {
        return repaCreateDate;
    }

    public void setRepaCreateDate(Date repaCreateDate) {
        this.repaCreateDate = repaCreateDate;
    }
}