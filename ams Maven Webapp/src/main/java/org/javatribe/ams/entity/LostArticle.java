package org.javatribe.ams.entity;

import java.util.Date;

public class LostArticle {
    private Integer loarId;//失物招领ID

    private String loarTitle;//主题

    private String loarContent;//内容

    private String loarPhote;//图片

    private String loarPhone;//联系方式

    private Byte loarStatus;//状态（0：已处理  1：未处理）

    private Date loarModifyDate;

    private Date loarCreateDate;//创建日期

    public Integer getLoarId() {
        return loarId;
    }

    public void setLoarId(Integer loarId) {
        this.loarId = loarId;
    }

    public String getLoarTitle() {
        return loarTitle;
    }

    public void setLoarTitle(String loarTitle) {
        this.loarTitle = loarTitle == null ? null : loarTitle.trim();
    }

    public String getLoarContent() {
        return loarContent;
    }

    public void setLoarContent(String loarContent) {
        this.loarContent = loarContent == null ? null : loarContent.trim();
    }

    public String getLoarPhote() {
        return loarPhote;
    }

    public void setLoarPhote(String loarPhote) {
        this.loarPhote = loarPhote == null ? null : loarPhote.trim();
    }

    public String getLoarPhone() {
        return loarPhone;
    }

    public void setLoarPhone(String loarPhone) {
        this.loarPhone = loarPhone == null ? null : loarPhone.trim();
    }

    public Byte getLoarStatus() {
        return loarStatus;
    }

    public void setLoarStatus(Byte loarStatus) {
        this.loarStatus = loarStatus;
    }

    public Date getLoarModifyDate() {
        return loarModifyDate;
    }

    public void setLoarModifyDate(Date loarModifyDate) {
        this.loarModifyDate = loarModifyDate;
    }

    public Date getLoarCreateDate() {
        return loarCreateDate;
    }

    public void setLoarCreateDate(Date loarCreateDate) {
        this.loarCreateDate = loarCreateDate;
    }
}