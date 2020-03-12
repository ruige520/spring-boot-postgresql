package com.pangu.foying.commom.util;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * @Author : 邱杭锐
 * @Date :  2019/9/6 11:56
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public class JsonUtil {

    /**
     * @Author : 邱杭锐
     * @Date : 2019/9/6 15:41
     * @Version : 01
     * @Description : 将List集合转化成json的字符串
     * @param : [list]
     * @return : java.lang.String
     */
    public static String listToJson(List list){
        if (list == null || list.size() <= 0)
            return null;
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray.toString();
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/9/6 15:50
     * @Version : 01
     * @Description : 将json的字符串转换成List集合
     * @param : [jsonArray, classz]
     * @return : java.util.List<T>
     */
    public static <T> List<T> jsonToList(String jsonArray,Class<T> classz){
        if (jsonArray == null || jsonArray == "" || classz == null)
            return null;
        List<T> list = JSONArray.parseArray(jsonArray, classz);
        return list;
    }

}
