package org.javatribe.ams.entity;

import java.util.Date;

public class Admin {
    private Integer admiId;

    private String admiNo;

    private String admiPassword;

    private String admiName;

    private Date admiModifyDate;

    private Date admiCreateDate;

    public Integer getAdmiId() {
        return admiId;
    }

    public void setAdmiId(Integer admiId) {
        this.admiId = admiId;
    }

    public String getAdmiNo() {
        return admiNo;
    }

    public void setAdmiNo(String admiNo) {
        this.admiNo = admiNo == null ? null : admiNo.trim();
    }

    public String getAdmiPassword() {
        return admiPassword;
    }

    public void setAdmiPassword(String admiPassword) {
        this.admiPassword = admiPassword == null ? null : admiPassword.trim();
    }

    public String getAdmiName() {
        return admiName;
    }

    public void setAdmiName(String admiName) {
        this.admiName = admiName == null ? null : admiName.trim();
    }

    public Date getAdmiModifyDate() {
        return admiModifyDate;
    }

    public void setAdmiModifyDate(Date admiModifyDate) {
        this.admiModifyDate = admiModifyDate;
    }

    public Date getAdmiCreateDate() {
        return admiCreateDate;
    }

    public void setAdmiCreateDate(Date admiCreateDate) {
        this.admiCreateDate = admiCreateDate;
    }
}