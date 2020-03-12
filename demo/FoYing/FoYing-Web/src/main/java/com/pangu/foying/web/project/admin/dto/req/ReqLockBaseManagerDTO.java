package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 9:48
 * @Modified By
 */
public class ReqLockBaseManagerDTO {
    @NotEmpty(message = "id不能为空")
    private String id;
    private Boolean isLock;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getLock() {
        return isLock;
    }

    public void setLock(Boolean lock) {
        isLock = lock;
    }
}
