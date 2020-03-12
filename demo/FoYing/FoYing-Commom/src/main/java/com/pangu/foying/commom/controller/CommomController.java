package com.pangu.foying.commom.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * @Author 陈漫斌
 * @Description 通用控制器
 * @Date 2018/12/10 10:05
 * @Modified By
 */
public class CommomController {

    /**
     * @Description 接口参数错误信息
     * @author 陈漫斌
     * @date 2018/12/11 14:31
     * @param errors
     * @Modified By
     */
    public String errorMsg(BindingResult errors) {
        if (errors != null && errors.getAllErrors() != null && !errors.getAllErrors().isEmpty()){
            StringBuilder msg = new StringBuilder();
            for(FieldError fieldError : errors.getFieldErrors()){
                msg.append(fieldError.getDefaultMessage() + " ");
            }
            return msg.toString();
        }
        return "参数异常";
    }
}
