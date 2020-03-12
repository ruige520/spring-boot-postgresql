package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 9:42
 * @Modified By
 */
public class ReqUpdateBaseManagerDTO {
    @NotEmpty(message = "id不能为空")
    private String id;
    @NotEmpty(message = "姓名不能为空")
    private String realName;
    private String telephone;
    private String email;
    private String remark;
    private Integer sortCode;
    private String workNumber;
    private String extentionNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getExtentionNumber() {
        return extentionNumber;
    }

    public void setExtentionNumber(String extentionNumber) {
        this.extentionNumber = extentionNumber;
    }
}
