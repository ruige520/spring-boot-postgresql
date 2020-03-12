package com.pangu.foying.web.project.admin.dto.res;

import org.dozer.Mapping;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/22 10:21
 * @Modified By
 */
public class ResGetSubAreaForDownDTO {
    @Mapping("mainId")
    private String mainId;//节点编号
    @Mapping("areaName")
    private String areaName;//地区名称
    public String getMainId() {
        return mainId;
    }
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
