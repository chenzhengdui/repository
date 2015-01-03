package org.javatribe.ams.entity;

import java.util.Date;

public class AssetType {
    private Integer astyId;//资产类型ID

    private String astyName;//资产类型名称

    private String astyNote;//备注

    private Date astyModifyDate;

    private Date astyCreateDate;//创建日期

    public Integer getAstyId() {
        return astyId;
    }

    public void setAstyId(Integer astyId) {
        this.astyId = astyId;
    }

    public String getAstyName() {
        return astyName;
    }

    public void setAstyName(String astyName) {
        this.astyName = astyName == null ? null : astyName.trim();
    }

    public String getAstyNote() {
        return astyNote;
    }

    public void setAstyNote(String astyNote) {
        this.astyNote = astyNote == null ? null : astyNote.trim();
    }

    public Date getAstyModifyDate() {
        return astyModifyDate;
    }

    public void setAstyModifyDate(Date astyModifyDate) {
        this.astyModifyDate = astyModifyDate;
    }

    public Date getAstyCreateDate() {
        return astyCreateDate;
    }

    public void setAstyCreateDate(Date astyCreateDate) {
        this.astyCreateDate = astyCreateDate;
    }
}