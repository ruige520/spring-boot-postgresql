package com.pangu.foying.commom.wrapper.response;

import com.pangu.foying.commom.pgenum.SystemEnum;

/**
 * @Author 陈漫斌
 * @Description 单实体响应结果
 * @Date 2018/12/10 9:26
 * @Modified By
 */
public class TResponse<T> extends ResponseBase {
    //实体对象
    protected T entity;

    public TResponse() { }
    public TResponse(String _ResCode, String _ResMsg) {
        super(_ResCode, _ResMsg);
    }
    public TResponse(String _ResCode, String _ResMsg, T entity) {
        this(_ResCode, _ResMsg);
        this.entity = entity;
    }
    public T getEntity() {
        return entity;
    }
    public void setEntity(T entity) {
        this.entity = entity;
    }

    public static TResponse error() {
        return new TResponse(SystemEnum.ERROR.get_ResCode(), SystemEnum.ERROR.get_ResMsg());
    }

    public static TResponse error(String msg) {
        return new TResponse(SystemEnum.ERROR.get_ResCode(), msg);
    }

    public static TResponse success() {
        return new TResponse(SystemEnum.SUCCESS.get_ResCode(), SystemEnum.SUCCESS.get_ResMsg());
    }

    public static TResponse success(String msg) {
        return new TResponse(SystemEnum.SUCCESS.get_ResCode(), msg);
    }

    public static TResponse<?> success(Object entity, String msg) {
        return new TResponse<>(SystemEnum.SUCCESS.get_ResCode(), msg, entity);
    }

}
