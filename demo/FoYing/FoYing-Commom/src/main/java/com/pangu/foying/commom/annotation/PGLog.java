package com.pangu.foying.commom.annotation;


import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;

import java.lang.annotation.*;

/**
 * @Author 陈漫斌
 * @Description 操作日志记录注解
 * @Date 2019/1/14 15:18
 * @Modified By
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PGLog {
    /**
     * 模块
     */
    String businessModule() default "";
    /**
     * 操作类型
     */
    ActionEnum actionType() default ActionEnum.All;
    /**
     * 接口访问方式
     */
    AccessModeEnum accessMode() default AccessModeEnum.pageAccess;
    /**
     * 是否获取返回值
     */
    boolean getRetValue() default false;
    /**
     * 是否获取入参值
     */
    boolean getArgValues() default false;
}
