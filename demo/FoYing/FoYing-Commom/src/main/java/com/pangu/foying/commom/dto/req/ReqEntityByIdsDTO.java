package com.pangu.foying.commom.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/17 16:27
 * @Modified By
 */
public class ReqEntityByIdsDTO {
    @NotEmpty(message = "id列表不能为空")
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
