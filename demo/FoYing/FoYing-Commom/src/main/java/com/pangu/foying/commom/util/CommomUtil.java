package com.pangu.foying.commom.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommomUtil {

    private static final String get = "get";
    //15位或18位身份号正则表达式
    private static Pattern pattern1 = Pattern.compile("(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)"
            + "|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}[0-9Xx]$)");
    //密码必须是包含大写字母、小写字母、数字、特殊符号（不是字母，数字，下划线，汉字的字符）的8位以上组合
    private static String PW_PATTERN = "^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";


    /**
     * 身份证校验
     *
     * @param idCard
     * @return
     * @author lyl
     */
    public static boolean isIdCard(String idCard) {
        Matcher matcher = pattern1.matcher(idCard);
        return matcher.matches();
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullOrEmpty(String str) {
        return !isNullOrEmpty(str);
    }


    public static void setNullVal(Object obj) {
        if (null == obj) {
            throw new NullPointerException();
        }
        try {
            Class<?> c = obj.getClass();
            Field[] fields = c.getDeclaredFields();
            for (int n = 0; n < fields.length; n++) {
                Field field = fields[n];
                String fieldName = field.getName();
                String getMethodName = get + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                Method getMethod = c.getMethod(getMethodName, new Class[]{});
                Object value = getMethod.invoke(obj, new Object[]{});
                String type = field.getGenericType().toString();
                if (null == value) {
                    field.setAccessible(true);
                    if (type.contains("String")) {
                        field.set(obj, "");
                    } else if (type.contains("Timestamp") || type.contains("Boolean") || type.contains("Integer") || type.contains("Date")) {
                        field.set(obj, null);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Map<String, Object> mapSetNullVal(Map<String, Object> map) {
        if(null == map){
            return map;
        }
        try {
            Set<String> set = map.keySet();
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                Object val = map.get(key);
                if (null == val) {
                    map.put(key, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "") + System.currentTimeMillis();
    }

    /**
     * 密码复杂程度校验
     * 密码必须是包含大写字母、小写字母、数字、特殊符号（不是字母，数字，下划线，汉字的字符）的8位以上组合
     */
    public static boolean passwordCheck(String regex){
        if (isNullOrEmpty(regex)) {
            return false;
        }
        return regex.matches(PW_PATTERN);
    }

    //获取性别
    public static String getSexDes(String type) {
        if ("1".equals(type)) {
            return "男";
        }
        if ("2".equals(type)) {
            return "女";
        }
        if ("0".equals(type)) {
            return "未知";
        }
        if ("3".equals(type)) {
            return "保密";
        }
        return "";
    }

    /**
     * 手机号码前三后四脱敏
     */
    public static String mobileEncrypt(String mobile){
        if(isNullOrEmpty(mobile) || (mobile.length() != 11)){
            return mobile;
        }
        return mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
    }

    /**
     * 身份证号码前三后四脱敏
     */
    public static String idCardEncrypt(String idCard){
        if(isNullOrEmpty(idCard) || (idCard.length() < 8)){
            return idCard;
        }
        return idCard.replaceAll("(?<=\\w{3})\\w(?=\\w{4})", "*");
    }


//    public static void main(String[] args) {
//    	System.out.println(isIdCard("44025385021358X"));
//    	System.out.println(isIdCard("44025385021358x"));
//    	System.out.println(isIdCard("44062319230815312x"));
//    	System.out.println(isIdCard("44062319230815312X"));
//	}
}
