package com.pangu.foying.commom.pgenum;

/**
 * @Author 陈漫斌
 * @Description 接口访问方式
 * @Date 2019/1/23 14:37
 * @Modified By
 */
public enum AccessModeEnum {
    /**
     * 前台页面
     */
    pageAccess("前台页面"),

    /**
     * 后台接口
     */
    backAccess("后台接口"),

    /**
     * 微信页面
     */
    weChatAccess("微信页面");

    private String describe = "";
    private AccessModeEnum(String describe){
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
