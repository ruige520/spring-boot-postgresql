package com.pangu.foying.commom.wrapper.response;


import com.pangu.foying.commom.pgenum.SystemEnum;

/**
 * @Author 陈漫斌
 * @Description 基础响应实体
 * @Date 2018/12/10 9:22
 * @Modified By
 */
public class ResponseBase {
    // 调用函数时返回的代码
    protected String _ResCode;

    // 调用函数时返回的信息
    protected String _ResMsg;

    public ResponseBase() {
    }

    public ResponseBase(String _ResCode, String _ResMsg) {
        this._ResCode = _ResCode;
        this._ResMsg = _ResMsg;
    }

    public String get_ResCode() {
        return _ResCode;
    }

    public void set_ResCode(String _ResCode) {
        this._ResCode = _ResCode;
    }

    public String get_ResMsg() {
        return _ResMsg;
    }

    public void set_ResMsg(String _ResMsg) {
        this._ResMsg = _ResMsg;
    }

    public static ResponseBase error(){
        return new ResponseBase(SystemEnum.ERROR.get_ResCode(), SystemEnum.ERROR.get_ResMsg());
    }

    public static ResponseBase error(String msg){
        return new ResponseBase(SystemEnum.ERROR.get_ResCode(), msg);
    }

    public static ResponseBase success(){
        return new ResponseBase(SystemEnum.SUCCESS.get_ResCode(), SystemEnum.SUCCESS.get_ResMsg());
    }

    public static ResponseBase success(String msg){
        return new ResponseBase(SystemEnum.SUCCESS.get_ResCode(), msg);
    }
}
