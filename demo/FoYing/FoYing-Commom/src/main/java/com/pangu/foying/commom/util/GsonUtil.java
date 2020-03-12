package com.pangu.foying.commom.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/3/5 15:39
 * @Modified By
 */
public class GsonUtil {
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").disableHtmlEscaping().create();
    private static GsonUtil instance = new GsonUtil();
    private GsonUtil(){
    }
    /**
     * 获取 GsonUtil对象
     * @return
     */
    public static GsonUtil getInstance(){
        return instance;
    }

    /**
     * 获取 Gson 对象
     * @return
     */
    public Gson getGson(){
        return gson;
    }
}
