package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:56
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ReqGetItemsDetailForEditDTO {
    @NotEmpty(message = "字典详情id不能为空!")
    private String id;//字典详情id
    @NotEmpty(message = "字典信息编号不能为空!")
    private String baseItemsEnCode; //字典信息enCode

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

    @Override
    public String toString() {
        return "ReqGetItemsDetailForEditDTO{" +
                "id='" + id + '\'' +
                ", baseItemsEnCode='" + baseItemsEnCode + '\'' +
                '}';
    }
}
