package com.pangu.foying.web.commom.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @Author 陈漫斌
 * @Description AES-ECB 加解密工具
 * @Date 2019/8/7 16:14
 * @Modified By
 */
public class AESECBUtil {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(AESECBUtil.class);

    //加解密算法
    private static final String KEY_ALGORITHM = "AES";
    //字符编码
    private static final String CHAR_SET = "UTF-8";
    //AES的密钥长度
    private static final Integer SECRET_KEY_LENGTH = 128;
    //加解密算法/工作模式/填充方式
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    /**
     * @Description 加密
     * @author 陈漫斌
     * @date 2019/8/7 16:41
     * @param content 明文
     * @param key 密钥
     * @Modified By
     */
    public static String encrypt(String content, String key) {
        if (StringUtils.isAnyEmpty(content, key)) {
            LOG.error("AES encryption params is null");
            return null;
        }
        try {
            //创建密码器
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            byte[] byteContent = content.getBytes(CHAR_SET);
            //初始化为加密密码器
            cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(key));
            byte[] encryptByte = cipher.doFinal(byteContent);
            return Base64.encodeBase64String(encryptByte);
        } catch (Exception e) {
            LOG.error("AES encryption operation has exception,content:{},password:{}", content, key, e);
        }
        return null;
    }

    /**
     * @Description 解密
     * @author 陈漫斌
     * @date 2019/8/7 16:42
     * @param encryptContent 密文
     * @param key 密钥
     * @Modified By
     */
    public static String decrypt(String encryptContent, String key) {
        if (StringUtils.isAnyEmpty(encryptContent, key)) {
            LOG.error("AES decryption params is null");
            return null;
        }
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            //设置为解密模式
            cipher.init(Cipher.DECRYPT_MODE, getSecretKey(key));
            //执行解密操作
            byte[] result = cipher.doFinal(Base64.decodeBase64(encryptContent));
            return new String(result, CHAR_SET);
        } catch (Exception e) {
            LOG.error("AES decryption operation has exception,content:{},password:{}", encryptContent, key, e);
        }
        return null;
    }

    private static SecretKeySpec getSecretKey(String key) throws Exception {
        //生成指定算法密钥的生成器
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM);
        keyGenerator.init(SECRET_KEY_LENGTH, new SecureRandom(key.getBytes()));
        //生成密钥
        SecretKey secretKey = keyGenerator.generateKey();
        //转换成AES的密钥
        return new SecretKeySpec(secretKey.getEncoded(), KEY_ALGORITHM);
    }
}
