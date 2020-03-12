package com.pangu.foying.commom.wrapper.response;

import com.pangu.foying.commom.pgenum.SystemEnum;

/**
 * @Author 陈漫斌
 * @Description 异常信息响应实体
 * @Date 2018/12/10 9:24
 * @Modified By
 */
public class ExceptionResponse<T extends Exception> extends ResponseBase {
    //异常实体对象
    protected T entity;

    public ExceptionResponse() { }

    public ExceptionResponse(String _ResCode, String _ResMsg) {
        super(_ResCode, _ResMsg);
    }

    public ExceptionResponse(String _ResCode, String _ResMsg, T entity) {
        this(_ResCode, _ResMsg);
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }
    public void setEntity(T entity) {
        this.entity = entity;
    }

    public static ExceptionResponse error() {
        return new ExceptionResponse(SystemEnum.ERROR.get_ResCode(), SystemEnum.ERROR.get_ResMsg());
    }

    public static ExceptionResponse error(String msg) {
        return new ExceptionResponse(SystemEnum.ERROR.get_ResCode(), msg);
    }

    public static ExceptionResponse success() {
        return new ExceptionResponse(SystemEnum.SUCCESS.get_ResCode(), SystemEnum.SUCCESS.get_ResMsg());
    }

    public static ExceptionResponse success(String msg) {
        return new ExceptionResponse(SystemEnum.SUCCESS.get_ResCode(), msg);
    }
}
