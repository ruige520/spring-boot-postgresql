package com.pangu.foying.web.project.admin.entity;

public class BaseNavigationRole extends BaseEntity {
    private String id;

    private String baseNavigationId;

    private String baseRoleId;

    public BaseNavigationRole(String id, String baseNavigationId, String baseRoleId) {
        this.id = id;
        this.baseNavigationId = baseNavigationId;
        this.baseRoleId = baseRoleId;
    }

    public BaseNavigationRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBaseNavigationId() {
        return baseNavigationId;
    }

    public void setBaseNavigationId(String baseNavigationId) {
        this.baseNavigationId = baseNavigationId == null ? null : baseNavigationId.trim();
    }

    public String getBaseRoleId() {
        return baseRoleId;
    }

    public void setBaseRoleId(String baseRoleId) {
        this.baseRoleId = baseRoleId == null ? null : baseRoleId.trim();
    }
}