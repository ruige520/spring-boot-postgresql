package com.pangu.foying.web.project.admin.entity;

public class BaseManagerRole {
    private String id;

    private String baseManagerId;

    private String baseRoleId;

    public BaseManagerRole(String id, String baseManagerId, String baseRoleId) {
        this.id = id;
        this.baseManagerId = baseManagerId;
        this.baseRoleId = baseRoleId;
    }

    public BaseManagerRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBaseManagerId() {
        return baseManagerId;
    }

    public void setBaseManagerId(String baseManagerId) {
        this.baseManagerId = baseManagerId == null ? null : baseManagerId.trim();
    }

    public String getBaseRoleId() {
        return baseRoleId;
    }

    public void setBaseRoleId(String baseRoleId) {
        this.baseRoleId = baseRoleId == null ? null : baseRoleId.trim();
    }
}