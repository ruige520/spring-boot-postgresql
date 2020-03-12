package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;

public class BaseOrganize extends BaseEntity {
    private String id;

    private Integer mainId;

    private Integer parentId;

    private String organizeName;

    private String organizeEnCode;

    private String name;

    private String mobilePhone;

    private String weChat;

    private String telephone;

    private String email;

    private String fax;

    private String address;

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

    public BaseOrganize(String id, Integer mainId, Integer parentId, String organizeName, String organizeEnCode, String name, String mobilePhone, String weChat, String telephone, String email, String fax, String address, Timestamp addTime, String addUserId, String addUserName, Timestamp modifyTime, String modifyUserId, String modifyName, String deleteName, Boolean deleteMark, Timestamp deleteTime, String remark, Integer sortCode) {
        this.id = id;
        this.mainId = mainId;
        this.parentId = parentId;
        this.organizeName = organizeName;
        this.organizeEnCode = organizeEnCode;
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.weChat = weChat;
        this.telephone = telephone;
        this.email = email;
        this.fax = fax;
        this.address = address;
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
    }

    public BaseOrganize() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName == null ? null : organizeName.trim();
    }

    public String getOrganizeEnCode() {
        return organizeEnCode;
    }

    public void setOrganizeEnCode(String organizeEnCode) {
        this.organizeEnCode = organizeEnCode == null ? null : organizeEnCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat == null ? null : weChat.trim();
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
}