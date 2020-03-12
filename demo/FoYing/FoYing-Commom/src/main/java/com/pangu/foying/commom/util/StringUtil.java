package com.pangu.foying.commom.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther 李毅仁
 * @Date 2018/12/29
 */
public class StringUtil {

    public static String getDHStringByList(List<String> arrList) {
        String telephone = "";
        boolean b = false;
        for (String s : arrList) {
            if (b)
                telephone += ",";
            b = true;
            telephone += s;
        }
        return telephone;
    }

    public static String getDHStringByArray(String[] arr) {
        String telephone = "";
        boolean b = false;
        for (String s : arr) {
            if (b)
                telephone += ",";
            b = true;
            telephone += s;
        }
        return telephone;
    }
    /**
     * @Description 字符串数组去重
     * @author 陈漫斌
     * @date 2019/3/12 13:58
     * @param arr
     * @Modified By
     */
    public static String[] duplicateRemoval(String[] arr) {
        if (arr == null || arr.length <= 1){
            return arr;
        }
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        return set.toArray(new String[set.size()]);
    }


}
