package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 10:12
 * @Modified By
 */
public class ReqUpdatePasswordDTO {
    @NotEmpty(message = "旧密码不能为空")
    private String oldPassword;
    @NotEmpty(message = "新密码不能为空")
    private String newPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
