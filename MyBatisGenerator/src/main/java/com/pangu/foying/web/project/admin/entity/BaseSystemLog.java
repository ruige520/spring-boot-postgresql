package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;

public class BaseSystemLog extends BaseEntity {
    private String id;

    private String accessMode;

    private String businessModule;

    private String actionType;

    private String hostIp;

    private String operUrl;

    private String operParams;

    private String operResult;

    private String status;

    private Timestamp addTime;

    private String addUserId;

    private String addUserName;

    private Timestamp modifyTime;

    private String modifyUserId;

    private String modifyName;

    private String deleteName;

    private Timestamp deleteTime;

    private Boolean deleteMark;

    public BaseSystemLog(String id, String accessMode, String businessModule, String actionType, String hostIp, String operUrl, String operParams, String operResult, String status, Timestamp addTime, String addUserId, String addUserName, Timestamp modifyTime, String modifyUserId, String modifyName, String deleteName, Timestamp deleteTime, Boolean deleteMark) {
        this.id = id;
        this.accessMode = accessMode;
        this.businessModule = businessModule;
        this.actionType = actionType;
        this.hostIp = hostIp;
        this.operUrl = operUrl;
        this.operParams = operParams;
        this.operResult = operResult;
        this.status = status;
        this.addTime = addTime;
        this.addUserId = addUserId;
        this.addUserName = addUserName;
        this.modifyTime = modifyTime;
        this.modifyUserId = modifyUserId;
        this.modifyName = modifyName;
        this.deleteName = deleteName;
        this.deleteTime = deleteTime;
        this.deleteMark = deleteMark;
    }

    public BaseSystemLog() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode == null ? null : accessMode.trim();
    }

    public String getBusinessModule() {
        return businessModule;
    }

    public void setBusinessModule(String businessModule) {
        this.businessModule = businessModule == null ? null : businessModule.trim();
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp == null ? null : hostIp.trim();
    }

    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl == null ? null : operUrl.trim();
    }

    public String getOperParams() {
        return operParams;
    }

    public void setOperParams(String operParams) {
        this.operParams = operParams == null ? null : operParams.trim();
    }

    public String getOperResult() {
        return operResult;
    }

    public void setOperResult(String operResult) {
        this.operResult = operResult == null ? null : operResult.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Boolean getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Boolean deleteMark) {
        this.deleteMark = deleteMark;
    }
}