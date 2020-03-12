package com.pangu.foying.commom.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/2/22 10:25
 * @Modified By
 */
public final class CheckTelPhone {
    //电话格式验证
    private static final String PHONE_CALL_PATTERN = "^(\\(\\d{3,4}\\)|\\d{3,4}-)?\\d{7,8}(-\\d{1,4})?$";
    //中国电信号码格式验证 手机段： 133,153,180,181,189,177,1700,173,199
    private static final String CHINA_TELECOM_PATTERN = "(^1(99|73|33|53|77|8[019])\\d{8}$)|(^1700\\d{7}$)";
    //中国联通号码格式验证 手机段：130,131,132,155,156,185,186,145,176,1709
    private static final String CHINA_UNICOM_PATTERN = "(^1(3[0-2]|4[5]|5[56]|7[6]|8[56])\\d{8}$)|(^1709\\d{7}$)";
    //中国移动号码格式验证  手机段：134,135,136,137,138,139,150,151,152,157,158,159,182,183,184,187,188,147,178,1705
    private static final String CHINA_MOBILE_PATTERN = "(^1(3[4-9]|4[7]|5[0-27-9]|7[8]|8[2-478])\\d{8}$)|(^1705\\d{7}$)";

    /**
     * @Description 验证电话号码的格式
     * @author 陈漫斌
     * @date 2018-3-26 下午3:00:38
     * @version 0.1
     * @param str
     * @return
     */
    public static boolean isPhoneCallNum(String str){
        return str == null || str.isEmpty() ? false : match(PHONE_CALL_PATTERN, str);
    }

    /**
     * @Description 验证【电信】手机号码的格式
     * @author 陈漫斌
     * @date 2018-3-26 下午3:01:26
     * @version 0.1
     * @param str
     * @return
     */
    public static boolean isChinaTelecomPhoneNum(String str) {
        return str == null || str.trim().equals("") ? false : match(CHINA_TELECOM_PATTERN, str);
    }

    /**
     * @Description 验证【联通】手机号码的格式
     * @author 陈漫斌
     * @date 2018-3-26 下午3:02:17
     * @version 0.1
     * @param str
     * @return
     */
    public static boolean isChinaUnicomPhoneNum(String str) {
        return str == null || str.trim().equals("") ? false : match(CHINA_UNICOM_PATTERN, str);
    }

    /**
     * @Description 验证【移动】手机号码的格式
     * @author 陈漫斌
     * @date 2018-3-26 下午3:08:08
     * @version 0.1
     * @param str
     * @return
     */
    public static boolean isChinaMobilePhoneNum(String str) {
        return str == null || str.trim().equals("") ? false : match(CHINA_MOBILE_PATTERN, str);
    }

    /**
     * @Description 验证手机和电话号码的格式
     * @author 陈漫斌
     * @date 2018-3-26 下午3:08:48
     * @version 0.1
     * @param str
     * @return
     */
    public static boolean isPhoneNum(String str) {
        // 如果字符串为空，直接返回false
        if (str == null || str.trim().equals("")) {
            return false;
        } else {
            int comma = str.indexOf(",");// 是否含有逗号
            int caesuraSign = str.indexOf("、");// 是否含有顿号
            int space = str.trim().indexOf(" ");// 是否含有空格
            if (comma == -1 && caesuraSign == -1 && space == -1) {
                // 如果号码不含分隔符,直接验证
                str=str.trim();
                return (isPhoneCallNum(str) || isChinaTelecomPhoneNum(str) || isChinaUnicomPhoneNum(str) || isChinaMobilePhoneNum(str)) ? true : false;
            } else {
                // 号码含分隔符,先把分隔符统一处理为英文状态下的逗号
                if (caesuraSign != -1) {
                    str=str.replaceAll("、", ",");
                }
                if (space != -1) {
                    str=str.replaceAll(" ", ",");
                }
                String[] phoneNumArr = str.split(",");
                //遍历验证
                for (String temp : phoneNumArr) {
                    temp=temp.trim();
                    if (isPhoneCallNum(temp) || isChinaTelecomPhoneNum(temp) || isChinaUnicomPhoneNum(temp) || isChinaMobilePhoneNum(temp)) {
                        continue;
                    } else {
                        return false;
                    }
                }
                return true;
            }
        }
    }
    /**
     * @Description 验证手机号码格式（电信、联通、移动）
     * @author 陈漫斌
     * @date 2019/3/7 14:25
     * @param str
     * @Modified By
     */
    public static boolean isTelphoneNum(String str){
        if (isChinaTelecomPhoneNum(str) || isChinaUnicomPhoneNum(str) || isChinaMobilePhoneNum(str)) {
            return true;
        }
        return false;
    }

    /**
     * @Description
     * @author 陈漫斌
     * @date 2018-3-26 下午2:59:09
     * @version 0.1
     * @param pat 表达式
     * @param str 待验证字符串
     * @return
     */
    private static boolean match(String pat, String str) {
        Pattern pattern = Pattern.compile(pat);
        Matcher match = pattern.matcher(str);
        return match.find();
    }
}
