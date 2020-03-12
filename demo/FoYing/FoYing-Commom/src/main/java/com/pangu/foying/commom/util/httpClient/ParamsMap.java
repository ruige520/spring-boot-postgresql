package com.pangu.foying.commom.util.httpClient;

/**
 * @Author 陈漫斌
 * @Description 请求参数对象
 * @Date 2018/9/29 8:48
 * @Modified By
 */
public class ParamsMap {
    //参数名
    public String paramsName;
    //参数值
    public String paramsValue;
    public ParamsMap() {
    }
    public ParamsMap(String paramsName, String paramsValue) {
        this.paramsName = paramsName;
        this.paramsValue = paramsValue;
    }
    public String getParamsName() {
        return paramsName;
    }

    public void setParamsName(String paramsName) {
        this.paramsName = paramsName;
    }

    public String getParamsValue() {
        return paramsValue;
    }

    public void setParamsValue(String paramsValue) {
        this.paramsValue = paramsValue;
    }
}
