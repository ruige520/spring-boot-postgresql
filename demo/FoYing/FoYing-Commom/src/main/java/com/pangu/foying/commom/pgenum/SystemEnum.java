package com.pangu.foying.commom.pgenum;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/10 9:33
 * @Modified By
 */
public enum SystemEnum {

    /**
     * @Description 100-200 为成功的结果码，除非有特殊情况需自定义，否则成功统一用100
     */
    SUCCESS("100","成功"),

    /**
     * @Description 201以上为失败的结果码，除非有特殊情况需自定义，否则失败统一用201
     */
    ERROR("201","失败"),

    /**
     * @Description 无权限
     */
    UNAUTHORIZED("202","无权限");

    private String _ResCode = "";//结果码
    private String _ResMsg = "";//结果信息

    private SystemEnum(String describe, String _ResMsg){
        this._ResCode = describe;
        this._ResMsg = _ResMsg;
    }

    public String get_ResCode() {
        return _ResCode;
    }
    public String get_ResMsg() {
        return _ResMsg;
    }
}
