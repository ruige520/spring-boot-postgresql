package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 16:45
 * @Modified By
 */
public class ReqAddBaseRoleDTO {
    @NotEmpty(message = "角色编号不能为空!")
    private String roleEncode;
    @NotEmpty(message = "角色名称不能为空!")
    private String roleName;
    @NotEmpty(message = "角色类型不能为空!")
    private String roleType;
    private String remark;
    private Integer sortCode;
    private String baseNavIds;//导航栏Id列表
    private String baseOrgIds;//组织机构Id

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

    public String getBaseNavIds() {
        return baseNavIds;
    }

    public void setBaseNavIds(String baseNavIds) {
        this.baseNavIds = baseNavIds;
    }

    public String getBaseOrgIds() {
        return baseOrgIds;
    }

    public void setBaseOrgIds(String baseOrgIds) {
        this.baseOrgIds = baseOrgIds;
    }
}
