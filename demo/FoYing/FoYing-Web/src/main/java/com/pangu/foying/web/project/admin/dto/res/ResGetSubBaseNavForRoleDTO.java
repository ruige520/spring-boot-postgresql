package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author 陈漫斌
 * @Description 获取导航栏用于角色绑定导航栏
 * @Date 2019/7/19 9:23
 * @Modified By
 */
public class ResGetSubBaseNavForRoleDTO {
    private String type = "0";// 固定0，为开启多选
    private String isChecked = "0"; //0未选中 1选中

    public ResGetSubBaseNavForRoleDTO() {
    }

    public ResGetSubBaseNavForRoleDTO(String isChecked) {
        this.isChecked = isChecked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }
}
