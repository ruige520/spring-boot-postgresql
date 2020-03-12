package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/18 9:09
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ReqAddBaseItemsDTO {
    private Integer parentId;
    @NotEmpty(message = "字典编号不为空!")
    private String enCode;
    @NotEmpty(message = "字典名称不为空！")
    private String itemName;
    private String remark;
    private Integer sortCode;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getEnCode() {
        return enCode;
    }

    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    @Override
    public String toString() {
        return "ReqAddBaseItemsDTO{" +
                "parentId=" + parentId +
                ", enCode='" + enCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", remark='" + remark + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}
