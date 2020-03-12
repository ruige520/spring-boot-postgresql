package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/18 9:38
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ResGetBaseItemsForEditDTO {
    private String id;
    private Integer mainId;
    private Integer parentId;
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

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

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
        return "ResGetBaseItemsForEditDTO{" +
                "id='" + id + '\'' +
                ", mainId=" + mainId +
                ", parentId=" + parentId +
                ", enCode='" + enCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", remark='" + remark + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}
