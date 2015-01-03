package org.javatribe.ams.entity;

import java.util.Date;

public class Users {
    private Integer userId;

    private String userNo;//账号

    private String userPassword;//密码

    private String userName;//用户名

    private String userRealName;//真实姓名

    private Boolean userSex;//性别

    private String userPhone;//联系方式

    private String userEmail;//邮箱

    private String userPhotoUrl;//头像

    private Boolean userEnable;//用户是否可用

    private String userNote;//备注

    private Date userModifyDate;//最后一次修改用户信息的日期

    private Date userCreateDate;//创建用户日期

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl == null ? null : userPhotoUrl.trim();
    }

    public Boolean getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(Boolean userEnable) {
        this.userEnable = userEnable;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public Date getUserModifyDate() {
        return userModifyDate;
    }

    public void setUserModifyDate(Date userModifyDate) {
        this.userModifyDate = userModifyDate;
    }

    public Date getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
}