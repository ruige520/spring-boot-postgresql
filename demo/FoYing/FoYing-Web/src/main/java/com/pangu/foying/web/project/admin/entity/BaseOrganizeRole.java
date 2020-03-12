package com.pangu.foying.web.project.admin.entity;

public class BaseOrganizeRole {
    private String id;

    private String baseOrganizeId;

    private String baseRoleId;

    public BaseOrganizeRole(String id, String baseOrganizeId, String baseRoleId) {
        this.id = id;
        this.baseOrganizeId = baseOrganizeId;
        this.baseRoleId = baseRoleId;
    }

    public BaseOrganizeRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBaseOrganizeId() {
        return baseOrganizeId;
    }

    public void setBaseOrganizeId(String baseOrganizeId) {
        this.baseOrganizeId = baseOrganizeId == null ? null : baseOrganizeId.trim();
    }

    public String getBaseRoleId() {
        return baseRoleId;
    }

    public void setBaseRoleId(String baseRoleId) {
        this.baseRoleId = baseRoleId == null ? null : baseRoleId.trim();
    }
}