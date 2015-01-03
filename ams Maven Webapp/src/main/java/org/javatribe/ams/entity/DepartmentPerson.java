package org.javatribe.ams.entity;

import java.util.Date;

public class DepartmentPerson {
    private Integer depeId;

    private Integer depaId;

    private String depeNo;

    private String depeName;

    private String depePhone;

    private String depePosition;

    private String depeEmail;

    private Date depeModifyDate;

    private Date depeCreateDate;

    public Integer getDepeId() {
        return depeId;
    }

    public void setDepeId(Integer depeId) {
        this.depeId = depeId;
    }

    public Integer getDepaId() {
        return depaId;
    }

    public void setDepaId(Integer depaId) {
        this.depaId = depaId;
    }

    public String getDepeNo() {
        return depeNo;
    }

    public void setDepeNo(String depeNo) {
        this.depeNo = depeNo == null ? null : depeNo.trim();
    }

    public String getDepeName() {
        return depeName;
    }

    public void setDepeName(String depeName) {
        this.depeName = depeName == null ? null : depeName.trim();
    }

    public String getDepePhone() {
        return depePhone;
    }

    public void setDepePhone(String depePhone) {
        this.depePhone = depePhone == null ? null : depePhone.trim();
    }

    public String getDepePosition() {
        return depePosition;
    }

    public void setDepePosition(String depePosition) {
        this.depePosition = depePosition == null ? null : depePosition.trim();
    }

    public String getDepeEmail() {
        return depeEmail;
    }

    public void setDepeEmail(String depeEmail) {
        this.depeEmail = depeEmail == null ? null : depeEmail.trim();
    }

    public Date getDepeModifyDate() {
        return depeModifyDate;
    }

    public void setDepeModifyDate(Date depeModifyDate) {
        this.depeModifyDate = depeModifyDate;
    }

    public Date getDepeCreateDate() {
        return depeCreateDate;
    }

    public void setDepeCreateDate(Date depeCreateDate) {
        this.depeCreateDate = depeCreateDate;
    }
}