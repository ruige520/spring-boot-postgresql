package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 17:09
 * @Modified By
 */
public class ResGetBaseRoleDTO {
    private String id;
    private String roleEncode;//角色编号
    private String roleName;//角色名称
    private String roleType;//角色类型
    private String remark;
    private Integer sortCode;
    private String baseOrgIds;//组织机构Id

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

    public String getBaseOrgIds() {
        return baseOrgIds;
    }

    public void setBaseOrgIds(String baseOrgIds) {
        this.baseOrgIds = baseOrgIds;
    }
}
