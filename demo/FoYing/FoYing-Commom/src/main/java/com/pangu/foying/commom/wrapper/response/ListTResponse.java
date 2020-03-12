package com.pangu.foying.commom.wrapper.response;


import com.pangu.foying.commom.pgenum.SystemEnum;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description 多实体响应结果
 * @Date 2018/12/10 9:24
 * @Modified By
 */
public class ListTResponse<T> extends ResponseBase {
    //实体列表
    protected List<T> entityList;

    public ListTResponse() { }
    public ListTResponse(String _ResCode, String _ResMsg) {
        super(_ResCode, _ResMsg);
    }
    public ListTResponse(String _ResCode, String _ResMsg, List<T> entityList) {
        this(_ResCode, _ResMsg);
        this.entityList = entityList;
    }
    public List<T> getEntityList() {
        return entityList;
    }
    public void setEntityList(List<T> entityList) {
        this.entityList = entityList;
    }

    public static ListTResponse error() {
        return new ListTResponse(SystemEnum.ERROR.get_ResCode(), SystemEnum.ERROR.get_ResMsg());
    }

    public static ListTResponse error(String msg) {
        return new ListTResponse(SystemEnum.ERROR.get_ResCode(), msg);
    }

    public static ListTResponse success() {
        return new ListTResponse(SystemEnum.SUCCESS.get_ResCode(), SystemEnum.SUCCESS.get_ResMsg());
    }

    public static ListTResponse success(String msg) {
        return new ListTResponse(SystemEnum.SUCCESS.get_ResCode(), msg);
    }
}
