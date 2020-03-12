package com.pangu.foying.commom.pgenum;

/**
 * @Author 陈漫斌
 * @Description 系统日志状态
 * @Date 2019/6/4 10:32
 * @Modified By
 */
public enum SystemLogStatus {
    /**
     * 成功
     */
    SUCCESS("成功"),

    /**
     * 失败
     */
    FAIL("失败"),

    /**
     * 未知
     */
    UNKNOWN("未知");

    private String describe = "";
    private SystemLogStatus(String describe){
        this.describe = describe;
    }

    /**
     * 获取枚举对应的中文描述
     * @return
     */
    public String getDescribe() {
        return describe;
    }

    public static String getDescribe(String enumName) {
        for (SystemLogStatus item : SystemLogStatus.values()){
            if (item.name().equals(enumName)){
                return item.getDescribe();
            }
        }
        return "";
    }
}
