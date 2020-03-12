package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/19 9:14
 * @Modified By
 */
public class ReqUpdateBaseNavigationRoleDTO {
    @NotEmpty(message = "角色id不能为空")
    private String baseRoleId;
    private String baseNavIds;

    public String getBaseRoleId() {
        return baseRoleId;
    }

    public void setBaseRoleId(String baseRoleId) {
        this.baseRoleId = baseRoleId;
    }

    public String getBaseNavIds() {
        return baseNavIds;
    }

    public void setBaseNavIds(String baseNavIds) {
        this.baseNavIds = baseNavIds;
    }
}
