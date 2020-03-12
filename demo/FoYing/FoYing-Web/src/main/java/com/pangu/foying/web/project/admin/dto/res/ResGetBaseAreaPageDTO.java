package com.pangu.foying.web.project.admin.dto.res;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/16 13:42
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ResGetBaseAreaPageDTO {
    private String id;

    private String mainId;

    private String parentId;

    private String enCode;

    private String areaName;

    private String simpleSpelling;

    private Integer areaLevel;

    private String remark;

    private Integer sortCode;

    private Boolean isSys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getEnCode() {
        return enCode;
    }

    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getSimpleSpelling() {
        return simpleSpelling;
    }

    public void setSimpleSpelling(String simpleSpelling) {
        this.simpleSpelling = simpleSpelling;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
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

    public Boolean getSys() {
        return isSys;
    }

    public void setSys(Boolean sys) {
        isSys = sys;
    }
}
