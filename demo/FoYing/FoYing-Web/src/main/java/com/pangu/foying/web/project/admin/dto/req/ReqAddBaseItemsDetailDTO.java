package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:52
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ReqAddBaseItemsDetailDTO {
    @NotEmpty(message = "关联父节点id不能为空!")
    private String baseItemsId;
    @NotEmpty(message = "字典编号不能为空!")
    private String enCode;
    @NotEmpty(message = "字典名称不能为空!")
    private String itemName;
    private String remark;
    private Integer sortCode;

    public String getBaseItemsId() {
        return baseItemsId;
    }

    public void setBaseItemsId(String baseItemsId) {
        this.baseItemsId = baseItemsId;
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
        return "ReqAddBaseItemsDetailDTO{" +
                "baseItemsId='" + baseItemsId + '\'' +
                ", enCode='" + enCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", remark='" + remark + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}
