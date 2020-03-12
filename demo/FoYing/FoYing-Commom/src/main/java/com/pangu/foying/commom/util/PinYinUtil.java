package com.pangu.foying.commom.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author 陈漫斌
 * @Description 处理汉字和对应拼音转换的工具类
 * @Date 2018/12/10 9:16
 * @Modified By
 */
public class PinYinUtil {
    private PinYinUtil(){}
    /**
     * @param multiple 多个汉字
     * @param isUp 是否为大写字母
     * @return
     *    传入汉字字符串，拼接成对应的拼音,返回拼音的集合(包含多音字)
     */
    public static Set<String> getPinYinSet(String multiple, boolean isUp){
        if(multiple == null || multiple.isEmpty()){
            return null;
        }
        Set<String> lstResult = new HashSet<String>();
        char[] t1 = null;  //字符串转换成char数组
        t1 = multiple.toCharArray();

        //迭代汉字
        for(char ch : t1){
            String[] s = getPinYin(ch, isUp);
            Set<String> lstNew = new HashSet<String>();
            //迭代每个汉字的拼音数组
            for(String str : s){
                if(lstResult.size()==0){
                    lstNew.add(str);
                }else{
                    for(String ss : lstResult){
                        ss += str;
                        lstNew.add(ss);
                    }
                }
            }
            lstResult.clear();
            lstResult = lstNew;
        }
        return lstResult;
    }

    /**
     *
     * @param multiple 多个汉字
     * @param isUp 是否为大写字母
     * @return
     * 传入中文汉字，转换出对应拼音;
     * 注：出现同音字，默认选择汉字全拼的第一种读音
     */
    public static String getPinYin(String multiple, boolean isUp) {
        if(multiple == null || multiple.isEmpty()){
            return null;
        }
        char[] t1 = null;
        t1 = multiple.toCharArray();
        String[] t2 = new String[t1.length];

        // 设置汉字拼音输出的格式
        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
        if(isUp){
            t3.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        }else{
            t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        }
        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        t3.setVCharType(HanyuPinyinVCharType.WITH_V);
        String t4 = "";
        int t0 = t1.length;
        try {
            for (int i = 0; i < t0; i++) {
                // 判断能否为汉字字符
                // System.out.println(t1[i]);
                if (Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
                    t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);// 将汉字的几种全拼都存到t2数组中
                    t4 += t2[0];// 取出该汉字全拼的第一种读音并连接到字符串t4后
                } else {
                    // 如果不是汉字字符，间接取出字符并连接到字符串t4后
                    t4 += Character.toString(t1[i]);
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        return t4;
    }

    /**
     * @param simple 单个汉字
     * @param isUp 是否为大写字母
     * @return
     * 将单个汉字转换成汉语拼音，考虑到同音字问题，返回字符串数组的形式(包含多音字)
     */
    public static String[] getPinYin(char simple, boolean isUp){
        char[] t1 = {simple};
        String[] t2 = new String[t1.length];

        // 设置汉字拼音输出的格式
        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
        if(isUp){
            t3.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        }else{
            t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        }
        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        t3.setVCharType(HanyuPinyinVCharType.WITH_V);

        // 判断能否为汉字字符
        if (Character.toString(t1[0]).matches("[\\u4E00-\\u9FA5]+")) {
            try {
                // 将汉字的几种全拼都存到t2数组中
                t2 = PinyinHelper.toHanyuPinyinStringArray(t1[0], t3);
            } catch (BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
            }
        } else {
            // 如果不是汉字字符，则把字符直接放入t2数组中
            t2[0] = String.valueOf(simple);
        }
        return t2;
    }

    /**
     *
     * @param multiple 多个汉字
     * @param isUp 是否为大写字母
     * @return
     * 传入没有多音字的中文汉字，转换出对应拼音;
     * 注：如果传入的中文中有任一同音字都会返回字符串信息：false
     */
    public static String getNoPolyphone(String multiple, boolean isUp){
        if(multiple == null || multiple.isEmpty()){
            return null;
        }
        char[] t1 = null;
        t1 = multiple.toCharArray();
        String[] t2 = new String[t1.length];

        // 设置汉字拼音输出的格式
        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
        if(isUp){
            t3.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        }else{
            t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        }
        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        t3.setVCharType(HanyuPinyinVCharType.WITH_V);
        String t4 = "";
        int t0 = t1.length;
        try {
            for(int i = 0; i < t0; i++){
                // 判断能否为汉字字符
                // System.out.println(t1[i]);
                if(Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
                    t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);// 将汉字的几种全拼都存到t2数组中
                    if(t2.length>1){
                        return "false";
                    }else{
                        t4 += t2[0];// 取出该汉字全拼的第一种读音并连接到字符串t4后
                    }
                } else {
                    // 如果不是汉字字符，间接取出字符并连接到字符串t4后
                    t4 += Character.toString(t1[i]);
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        return t4;
    }

    /**
     * 返回汉字的首字母（若是多音字 则 取 第一个音的第一个字母）
     * @param multiple 多个汉字
     * @param isUp 是否为大写字母
     * @return
     */
    public static String getPinYinFirst(String multiple, boolean isUp){
        try{
            if(multiple == null || multiple.isEmpty()){
                return null;
            }
            StringBuilder result = new StringBuilder();
            char[] hanZis = multiple.toCharArray();

            // 设置汉字拼音输出的格式
            HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
            if(isUp){
                format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
            }else{
                format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            }
            format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            format.setVCharType(HanyuPinyinVCharType.WITH_V);

            String[] res = null;
            for(char c : hanZis){
                // 判断能否为汉字字符
                if(Character.toString(c).matches("[\\u4E00-\\u9FA5]+")){
                    res = PinyinHelper.toHanyuPinyinStringArray(c,format);
                    if(res == null || res.length == 0){
                        //转化失败
                        result.append(c);
                        continue;
                    }
                    //若是多音字 则 取 第一个音的第一个字母
                    result.append(res[0].substring(0, 1));
                }else{
                    //若不是汉字，则直接添加进结果中
                    result.append(c);
                }
            }
            return result.toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 返回汉字的首字母（若是多音字 则 取 第一个音的第一个字母）
     * @param multiple 多个汉字
     * @param isUp 是否为大写字母
     * @return
     */
    public static String getPinYinFirst(char[] multiple, boolean isUp) {
        try {
            if (multiple == null || multiple.length <= 0) {
                return null;
            }
            StringBuilder result = new StringBuilder();
            char[] hanZis = multiple;

            // 设置汉字拼音输出的格式
            HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
            if (isUp) {
                format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
            } else {
                format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            }
            format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            format.setVCharType(HanyuPinyinVCharType.WITH_V);

            String[] res = null;
            for (char c : hanZis) {
                // 判断能否为汉字字符
                if (Character.toString(c).matches("[\\u4E00-\\u9FA5]+")) {
                    res = PinyinHelper.toHanyuPinyinStringArray(c, format);
                    if (res == null || res.length == 0) {
                        //转化失败
                        result.append(c);
                        continue;
                    }
                    //若是多音字 则 取 第一个音的第一个字母
                    result.append(res[0].substring(0, 1));
                } else {
                    //若不是汉字，则直接添加进结果中
                    result.append(c);
                }
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 返回首字母
     */
    public static String getPYIndexStr(String strChinese, boolean bUpCase) {
        try {
            StringBuffer buffer = new StringBuffer();
            byte b[] = strChinese.getBytes("GBK");// 把中文转化成byte数组
            for (int i = 0; i < b.length; i++) {
                if ((b[i] & 255) > 128) {
                    int char1 = b[i++] & 255;
                    char1 <<= 8;// 左移运算符用“<<”表示，是将运算符左边的对象，向左移动运算符右边指定的位数，并且在低位补零。其实，向左移n位，就相当于乘上2的n次方
                    int chart = char1 + (b[i] & 255);
                    buffer.append(getPYIndexChar((char) chart, bUpCase));
                    continue;
                }
                char c = (char) b[i];
                if (!Character.isJavaIdentifierPart(c))// 确定指定字符是否可以是 Java
                    // 标识符中首字符以外的部分。
                    c = 'A';
                buffer.append(c);
            }
            return buffer.toString();
        } catch (Exception e) {
            System.out.println((new StringBuilder()).append("\u53D6\u4E2D\u6587\u62FC\u97F3\u6709\u9519")
                    .append(e.getMessage()).toString());
        }
        return null;
    }

    /**
     * 得到首字母
     */
    private static char getPYIndexChar(char strChinese, boolean bUpCase) {

        int charGBK = strChinese;

        char result;

        if (charGBK >= 45217 && charGBK <= 45252)

            result = 'A';

        else

        if (charGBK >= 45253 && charGBK <= 45760)

            result = 'B';

        else

        if (charGBK >= 45761 && charGBK <= 46317)

            result = 'C';

        else

        if (charGBK >= 46318 && charGBK <= 46825)

            result = 'D';

        else

        if (charGBK >= 46826 && charGBK <= 47009)

            result = 'E';

        else

        if (charGBK >= 47010 && charGBK <= 47296)

            result = 'F';

        else

        if (charGBK >= 47297 && charGBK <= 47613)

            result = 'G';

        else

        if (charGBK >= 47614 && charGBK <= 48118)

            result = 'H';

        else

        if (charGBK >= 48119 && charGBK <= 49061)

            result = 'J';

        else

        if (charGBK >= 49062 && charGBK <= 49323)

            result = 'K';

        else

        if (charGBK >= 49324 && charGBK <= 49895)

            result = 'L';

        else

        if (charGBK >= 49896 && charGBK <= 50370)

            result = 'M';

        else

        if (charGBK >= 50371 && charGBK <= 50613)

            result = 'N';

        else

        if (charGBK >= 50614 && charGBK <= 50621)

            result = 'O';

        else

        if (charGBK >= 50622 && charGBK <= 50905)

            result = 'P';

        else

        if (charGBK >= 50906 && charGBK <= 51386)

            result = 'Q';

        else

        if (charGBK >= 51387 && charGBK <= 51445)

            result = 'R';

        else

        if (charGBK >= 51446 && charGBK <= 52217)

            result = 'S';

        else

        if (charGBK >= 52218 && charGBK <= 52697)

            result = 'T';

        else

        if (charGBK >= 52698 && charGBK <= 52979)

            result = 'W';

        else

        if (charGBK >= 52980 && charGBK <= 53688)

            result = 'X';

        else

        if (charGBK >= 53689 && charGBK <= 54480)

            result = 'Y';

        else

        if (charGBK >= 54481 && charGBK <= 55289)

            result = 'Z';

        else

            result = (char) (65 + (new Random()).nextInt(25));

        if (!bUpCase)

            result = Character.toLowerCase(result);

        return result;

    }

//    public static void main(String[] args) {
//        Set<String> lst = PinYinUtil.getPinYinSet("张三",true);
//        for (String string : lst) {
//            System.out.println(string);
//        }
//        String[] strArr = PinYinUtil.getPinYin("李四".toCharArray()[1], false);
//        for(String s : strArr){
//        	System.out.println(s);
//        }
//        String str = PinYinUtil.getNoPolyphone("王五",true);
//        System.out.println(str);
//        String str2 = PinYinUtil.getPinYin("赵六",true);
//        System.out.println(str2);
//        System.out.println(getPinYinFirst("佛山市".toCharArray(),true));
//    }
}
