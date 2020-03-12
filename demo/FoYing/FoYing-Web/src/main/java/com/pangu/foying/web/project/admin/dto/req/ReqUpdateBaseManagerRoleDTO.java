package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 9:51
 * @Modified By
 */
public class ReqUpdateBaseManagerRoleDTO {
    @NotEmpty(message = "id不能为空")
    private String id;
    private String roleIds;//角色id列表，用“,”分开

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}
