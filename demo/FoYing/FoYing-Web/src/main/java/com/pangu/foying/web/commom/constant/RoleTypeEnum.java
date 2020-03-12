package com.pangu.foying.web.commom.constant;

/**
 * @Author 陈漫斌
 * @Description 角色类型
 * @Date 2018/12/12 10:19
 * @Modified By
 */
public enum RoleTypeEnum {
    /**
     * 系统用户
     */
    SystemManager("系统用户"),

    /**
     * 超级用户
     */
    SuperManager("超级用户");

    private String describe = "";
    private RoleTypeEnum(String describe){
        this.describe = describe;
    }
    /**
     * 获取枚举对应的中文描述
     * @return
     */
    public String getDescribe() {
        return describe;
    }
}
