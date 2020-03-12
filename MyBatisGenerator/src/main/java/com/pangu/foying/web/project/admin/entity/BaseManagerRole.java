package com.pangu.foying.web.project.admin.entity;

public class BaseManagerRole extends BaseEntity {
    private String id;

    private String baseManagerID;

    private String baseRoleID;

    public BaseManagerRole(String id, String baseManagerID, String baseRoleID) {
        this.id = id;
        this.baseManagerID = baseManagerID;
        this.baseRoleID = baseRoleID;
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

    public String getBaseManagerID() {
        return baseManagerID;
    }

    public void setBaseManagerID(String baseManagerID) {
        this.baseManagerID = baseManagerID == null ? null : baseManagerID.trim();
    }

    public String getBaseRoleID() {
        return baseRoleID;
    }

    public void setBaseRoleID(String baseRoleID) {
        this.baseRoleID = baseRoleID == null ? null : baseRoleID.trim();
    }
}