package com.pangu.foying.commom.util;

import java.lang.reflect.Field;

/**
 * @Author 陈漫斌
 * @Description 数据库工具类
 * @Date 2019/11/1 10:33
 * @Modified By
 */
public final class SqlUtil {

    private static int SQLSERVER_LIMIT = 2100;

    /**
     * @Description 获取JDBC执行 PreparedStatement 允许的最大列值长度
     * @author 陈漫斌
     * @date 2019/11/1 14:26
     * @param clazz
     * @Modified By
     */
    public static int getColValueSizes (Class<?> clazz) {
        int result = 0;
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            result = result + fields.length;
        }
        Class<?> suCl = clazz.getSuperclass();
        while (true) {
            if (suCl == null) {
                break;
            }
            if (!java.lang.Object.class.getName().equals(suCl.getName())) {
                fields = suCl.getDeclaredFields();
                if (fields != null) {
                    result = result + fields.length;
                }
            }
            suCl = suCl.getSuperclass();
        }
        if (result == 0) {
            return 10;
        }
        result = SQLSERVER_LIMIT / result;
        if (result > 20) {
            result = result - 10;
        }
        return result;
    }
}
