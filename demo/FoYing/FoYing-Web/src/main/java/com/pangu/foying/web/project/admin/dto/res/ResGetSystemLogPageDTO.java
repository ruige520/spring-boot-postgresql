package com.pangu.foying.web.project.admin.dto.res;

import java.sql.Timestamp;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/19 11:01
 * @Modified By
 */
public class ResGetSystemLogPageDTO {
    private String id;
    private String accessMode;//接口访问方式
    private String businessModule;//系统模块
    private String actionType;//操作类型
    private String hostip;//主机IP
    private String operurl;//请求地址
    private String operParams;//请求参数
    private String operResult;//访问结果
    private String status;//状态
    private Timestamp addTime;//添加时间
    private String addUserName;//添加人名称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public String getBusinessModule() {
        return businessModule;
    }

    public void setBusinessModule(String businessModule) {
        this.businessModule = businessModule;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getOperParams() {
        return operParams;
    }

    public void setOperParams(String operParams) {
        this.operParams = operParams;
    }

    public String getOperResult() {
        return operResult;
    }

    public void setOperResult(String operResult) {
        this.operResult = operResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getHostip() {
        return hostip;
    }

    public void setHostip(String hostip) {
        this.hostip = hostip;
    }

    public String getOperurl() {
        return operurl;
    }

    public void setOperurl(String operurl) {
        this.operurl = operurl;
    }
}
