package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/15 16:32
 * @Modified By
 */
public class ReqGetDateDTO {
    @NotEmpty(message = "name不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReqGetDateDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
