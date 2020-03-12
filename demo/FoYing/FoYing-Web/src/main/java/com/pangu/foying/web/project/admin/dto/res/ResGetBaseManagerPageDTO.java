package com.pangu.foying.web.project.admin.dto.res;

import org.dozer.Mapping;

import java.sql.Timestamp;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 10:20
 * @Modified By
 */
public class ResGetBaseManagerPageDTO {
    @Mapping("id")
    private String id;

    @Mapping("account")
    private String account;

    @Mapping("realName")
    private String realname;

    @Mapping("telephone")
    private String telephone;

    @Mapping("email")
    private String email;

    @Mapping("isLock")
    private Boolean isLock;

    @Mapping("addTime")
    private Timestamp addTime;

    @Mapping("addUserName")
    private String addUserName;

    @Mapping("modifyTime")
    private Timestamp modifyTime;

    @Mapping("modifyName")
    private String modifyName;

    @Mapping("remark")
    private String remark;

    private String roleName;//角色

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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
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

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
