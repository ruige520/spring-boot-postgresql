package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:57
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ReqEditBaseItemsDetailDTO {
    @NotEmpty(message = "主键不为空!")
    private String id;//主键
    @NotEmpty(message = "字典信息编号不能为空!")
    private String baseItemsEnCode;//字典信息enCode
    @NotEmpty(message = "字典详情编号不能不空!")
    private String enCode;//字典编号
    @NotEmpty(message = "字典名称不能为空!")
    private String itemName;//字典名称
    private String remark;//备注
    private Integer sortCode;//排序编号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseItemsEnCode() {
        return baseItemsEnCode;
    }

    public void setBaseItemsEnCode(String baseItemsEnCode) {
        this.baseItemsEnCode = baseItemsEnCode;
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
        return "ReqEditBaseItemsDetailDTO{" +
                "id='" + id + '\'' +
                ", baseItemsEnCode='" + baseItemsEnCode + '\'' +
                ", enCode='" + enCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", remark='" + remark + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}
