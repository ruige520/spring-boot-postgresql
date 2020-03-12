package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/18 9:40
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ResItemsListForShowDTO {
    private String primarykey;
    private Integer id;
    private Integer pid;
    private String enCode;
    private String itemName;
    private String remark;
    private Integer classLayer;//表示第几层
    private String isLeaf;//表示是否为叶子节点
    private String expanded = "true";//表示是否扩展

    public String getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(String primarykey) {
        this.primarykey = primarykey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Integer getClassLayer() {
        return classLayer;
    }

    public void setClassLayer(Integer classLayer) {
        this.classLayer = classLayer;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }
}
