package com.pangu.foying.commom.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/17 16:26
 * @Modified By
 */
public class ReqEntityByIdDTO {
    @NotEmpty(message = "id不能为空")
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
