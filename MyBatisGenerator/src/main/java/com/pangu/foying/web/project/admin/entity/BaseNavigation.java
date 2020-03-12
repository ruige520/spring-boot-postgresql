package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;

public class BaseNavigation extends BaseEntity {
    private String id;

    private Integer mainId;

    private Integer parentId;

    private String navigationType;

    private String navigationName;

    private String title;

    private String subTitle;

    private String iconUrl;

    private String linkUrl;

    private Boolean isLock;

    private String actionType;

    private Boolean isSys;

    private Timestamp addTime;

    private String addUserId;

    private String addUserName;

    private Timestamp modifyTime;

    private String modifyUserId;

    private String modifyName;

    private Boolean deleteMark;

    private Timestamp deleteTime;

    private String deleteName;

    private String remark;

    private Integer sortCode;

    public BaseNavigation(String id, Integer mainId, Integer parentId, String navigationType, String navigationName, String title, String subTitle, String iconUrl, String linkUrl, Boolean isLock, String actionType, Boolean isSys, Timestamp addTime, String addUserId, String addUserName, Timestamp modifyTime, String modifyUserId, String modifyName, Boolean deleteMark, Timestamp deleteTime, String deleteName, String remark, Integer sortCode) {
        this.id = id;
        this.mainId = mainId;
        this.parentId = parentId;
        this.navigationType = navigationType;
        this.navigationName = navigationName;
        this.title = title;
        this.subTitle = subTitle;
        this.iconUrl = iconUrl;
        this.linkUrl = linkUrl;
        this.isLock = isLock;
        this.actionType = actionType;
        this.isSys = isSys;
        this.addTime = addTime;
        this.addUserId = addUserId;
        this.addUserName = addUserName;
        this.modifyTime = modifyTime;
        this.modifyUserId = modifyUserId;
        this.modifyName = modifyName;
        this.deleteMark = deleteMark;
        this.deleteTime = deleteTime;
        this.deleteName = deleteName;
        this.remark = remark;
        this.sortCode = sortCode;
    }

    public BaseNavigation() {
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

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType == null ? null : navigationType.trim();
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName == null ? null : navigationName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(Boolean isSys) {
        this.isSys = isSys;
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

    public String getDeleteName() {
        return deleteName;
    }

    public void setDeleteName(String deleteName) {
        this.deleteName = deleteName == null ? null : deleteName.trim();
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