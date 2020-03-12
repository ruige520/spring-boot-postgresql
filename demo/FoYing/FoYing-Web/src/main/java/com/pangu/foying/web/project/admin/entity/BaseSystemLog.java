package com.pangu.foying.web.project.admin.entity;

import com.pangu.foying.commom.entity.BaseEntity;

import java.sql.Timestamp;

public class BaseSystemLog extends BaseEntity {
    private String id;

    private String accessmode;

    private String businessmodule;

    private String actiontype;

    private String hostip;

    private String operurl;

    private String operparams;

    private String operresult;

    private String status;

    public BaseSystemLog(String id, String accessmode, String businessmodule, String actiontype, String hostip, String operurl, String operparams, String operresult, String status, Timestamp addTime, String addUserId, String addUserName, Timestamp modifyTime, String modifyUserId, String modifyName, String deleteName, Timestamp deleteTime, Boolean deleteMark) {
        this.id = id;
        this.accessmode = accessmode;
        this.businessmodule = businessmodule;
        this.actiontype = actiontype;
        this.hostip = hostip;
        this.operurl = operurl;
        this.operparams = operparams;
        this.operresult = operresult;
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

    public String getAccessmode() {
        return accessmode;
    }

    public void setAccessmode(String accessmode) {
        this.accessmode = accessmode == null ? null : accessmode.trim();
    }

    public String getBusinessmodule() {
        return businessmodule;
    }

    public void setBusinessmodule(String businessmodule) {
        this.businessmodule = businessmodule == null ? null : businessmodule.trim();
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype == null ? null : actiontype.trim();
    }

    public String getHostip() {
        return hostip;
    }

    public void setHostip(String hostip) {
        this.hostip = hostip == null ? null : hostip.trim();
    }

    public String getOperurl() {
        return operurl;
    }

    public void setOperurl(String operurl) {
        this.operurl = operurl == null ? null : operurl.trim();
    }

    public String getOperparams() {
        return operparams;
    }

    public void setOperparams(String operparams) {
        this.operparams = operparams == null ? null : operparams.trim();
    }

    public String getOperresult() {
        return operresult;
    }

    public void setOperresult(String operresult) {
        this.operresult = operresult == null ? null : operresult.trim();
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