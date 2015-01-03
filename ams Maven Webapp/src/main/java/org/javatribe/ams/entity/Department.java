package org.javatribe.ams.entity;

import java.util.Date;

public class Department {
    private Integer depaId;

    private String depaNo;

    private String depaName;

    private String depaDescription;

    private String depaAddress;

    private String depaPhone;

    private Date depaModifyDate;

    private Date depaCreateDate;

    public Integer getDepaId() {
        return depaId;
    }

    public void setDepaId(Integer depaId) {
        this.depaId = depaId;
    }

    public String getDepaNo() {
        return depaNo;
    }

    public void setDepaNo(String depaNo) {
        this.depaNo = depaNo == null ? null : depaNo.trim();
    }

    public String getDepaName() {
        return depaName;
    }

    public void setDepaName(String depaName) {
        this.depaName = depaName == null ? null : depaName.trim();
    }

    public String getDepaDescription() {
        return depaDescription;
    }

    public void setDepaDescription(String depaDescription) {
        this.depaDescription = depaDescription == null ? null : depaDescription.trim();
    }

    public String getDepaAddress() {
        return depaAddress;
    }

    public void setDepaAddress(String depaAddress) {
        this.depaAddress = depaAddress == null ? null : depaAddress.trim();
    }

    public String getDepaPhone() {
        return depaPhone;
    }

    public void setDepaPhone(String depaPhone) {
        this.depaPhone = depaPhone == null ? null : depaPhone.trim();
    }

    public Date getDepaModifyDate() {
        return depaModifyDate;
    }

    public void setDepaModifyDate(Date depaModifyDate) {
        this.depaModifyDate = depaModifyDate;
    }

    public Date getDepaCreateDate() {
        return depaCreateDate;
    }

    public void setDepaCreateDate(Date depaCreateDate) {
        this.depaCreateDate = depaCreateDate;
    }
}