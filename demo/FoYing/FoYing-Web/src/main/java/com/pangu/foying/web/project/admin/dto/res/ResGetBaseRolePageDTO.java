package com.pangu.foying.web.project.admin.dto.res;

import java.sql.Timestamp;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 16:56
 * @Modified By
 */
public class ResGetBaseRolePageDTO {
    private String id;
    private String roleEncode;//角色编号
    private String roleName;//角色名称
    private String roleType;//角色类型
    private Timestamp addTime;
    private String addUserName;
    private Timestamp modifyTime;
    private String modifyName;
    private String remark;
    private Integer sortCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleEncode() {
        return roleEncode;
    }

    public void setRoleEncode(String roleEncode) {
        this.roleEncode = roleEncode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
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

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }
}
