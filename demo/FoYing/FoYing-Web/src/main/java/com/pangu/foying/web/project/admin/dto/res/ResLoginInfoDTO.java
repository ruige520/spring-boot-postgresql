package com.pangu.foying.web.project.admin.dto.res;

import java.io.Serializable;

/**
 * @Author 陈漫斌
 * @Description 返回管理员登陆信息
 * @Date 2018/12/11 17:21
 * @Modified By
 */
public class ResLoginInfoDTO implements Serializable {
    private String id;
    private String account;
    private String realName;
    private String telephone;
    private String email;
    private String workNumber;
    private String extentionNumber;
    private String roleName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getExtentionNumber() {
        return extentionNumber;
    }

    public void setExtentionNumber(String extentionNumber) {
        this.extentionNumber = extentionNumber;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
