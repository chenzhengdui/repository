package org.javatribe.ams.entity;

import java.util.Date;

public class Assets {
    private Integer asseId;

    private Integer astyId;//资产类型ID

    private String asseNo;//资产编号

    private String asseName;//资产名称

    private Double assePrice;//资产的单价

    private String assePlace;//资产所在地点

    private Date asseModifyDate;

    private Date asseCreateDate;//资产创建日期

    private Boolean asseStatus;//资产的状态（0：不可用  1：可用）

    private Boolean asseQrCode;//改资产是否有二维码

    public Integer getAsseId() {
        return asseId;
    }

    public void setAsseId(Integer asseId) {
        this.asseId = asseId;
    }

    public Integer getAstyId() {
        return astyId;
    }

    public void setAstyId(Integer astyId) {
        this.astyId = astyId;
    }

    public String getAsseNo() {
        return asseNo;
    }

    public void setAsseNo(String asseNo) {
        this.asseNo = asseNo == null ? null : asseNo.trim();
    }

    public String getAsseName() {
        return asseName;
    }

    public void setAsseName(String asseName) {
        this.asseName = asseName == null ? null : asseName.trim();
    }

    public Double getAssePrice() {
        return assePrice;
    }

    public void setAssePrice(Double assePrice) {
        this.assePrice = assePrice;
    }

    public String getAssePlace() {
        return assePlace;
    }

    public void setAssePlace(String assePlace) {
        this.assePlace = assePlace == null ? null : assePlace.trim();
    }

    public Date getAsseModifyDate() {
        return asseModifyDate;
    }

    public void setAsseModifyDate(Date asseModifyDate) {
        this.asseModifyDate = asseModifyDate;
    }

    public Date getAsseCreateDate() {
        return asseCreateDate;
    }

    public void setAsseCreateDate(Date asseCreateDate) {
        this.asseCreateDate = asseCreateDate;
    }

    public Boolean getAsseStatus() {
        return asseStatus;
    }

    public void setAsseStatus(Boolean asseStatus) {
        this.asseStatus = asseStatus;
    }

    public Boolean getAsseQrCode() {
        return asseQrCode;
    }

    public void setAsseQrCode(Boolean asseQrCode) {
        this.asseQrCode = asseQrCode;
    }
}