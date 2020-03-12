package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:54
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class ReqItemsDetailListForShowDTO {
    @NotEmpty(message = "字典编号不能为空!")
    private String baseItemsEnCode; //字典信息enCode
    private String keyword;//关键字

    public String getBaseItemsEnCode() {
        return baseItemsEnCode;
    }

    public void setBaseItemsEnCode(String baseItemsEnCode) {
        this.baseItemsEnCode = baseItemsEnCode;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "ReqItemsDetailListForShowDTO{" +
                "baseItemsEnCode='" + baseItemsEnCode + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
