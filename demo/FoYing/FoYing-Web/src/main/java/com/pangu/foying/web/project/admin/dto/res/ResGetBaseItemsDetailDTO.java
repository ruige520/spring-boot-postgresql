package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 17:36
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ResGetBaseItemsDetailDTO {
    private String id;
    private String enCode;
    private String itemName;
    private String remark;
    private Integer sortCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "ResGetBaseItemsDetailDTO{" +
                "id='" + id + '\'' +
                ", enCode='" + enCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", remark='" + remark + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}
