package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;

public class BaseManager extends BaseEntity {
    private String id;

    private String account;

    private String password;

    private String salt;

    private String realName;

    private String telephone;

    private String email;

    private Boolean isLock;

    private Timestamp addTime;

    private String addUserId;

    private String addUserName;

    private Timestamp modifyTime;

    private String modifyUserId;

    private String modifyName;

    private String deleteName;

    private Boolean deleteMark;

    private Timestamp deleteTime;

    private String remark;

    private Integer sortCode;

    private String workNumber;

    private String extentionNumber;

    public BaseManager(String id, String account, String password, String salt, String realName, String telephone, String email, Boolean isLock, Timestamp addTime, String addUserId, String addUserName, Timestamp modifyTime, String modifyUserId, String modifyName, String deleteName, Boolean deleteMark, Timestamp deleteTime, String remark, Integer sortCode, String workNumber, String extentionNumber) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.salt = salt;
        this.realName = realName;
        this.telephone = telephone;
        this.email = email;
        this.isLock = isLock;
        this.addTime = addTime;
        this.addUserId = addUserId;
        this.addUserName = addUserName;
        this.modifyTime = modifyTime;
        this.modifyUserId = modifyUserId;
        this.modifyName = modifyName;
        this.deleteName = deleteName;
        this.deleteMark = deleteMark;
        this.deleteTime = deleteTime;
        this.remark = remark;
        this.sortCode = sortCode;
        this.workNumber = workNumber;
        this.extentionNumber = extentionNumber;
    }

    public BaseManager() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName == null ? null : addUserName.trim();
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    public String getDeleteName() {
        return deleteName;
    }

    public void setDeleteName(String deleteName) {
        this.deleteName = deleteName == null ? null : deleteName.trim();
    }

    public Boolean getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Boolean deleteMark) {
        this.deleteMark = deleteMark;
    }

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber == null ? null : workNumber.trim();
    }

    public String getExtentionNumber() {
        return extentionNumber;
    }

    public void setExtentionNumber(String extentionNumber) {
        this.extentionNumber = extentionNumber == null ? null : extentionNumber.trim();
    }
}