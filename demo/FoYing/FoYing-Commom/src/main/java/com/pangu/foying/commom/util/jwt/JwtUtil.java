package com.pangu.foying.commom.util.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/3/7 16:37
 * @Modified By
 */
public final class JwtUtil {
    /**
     * @Description 生成 jwt
     * @author 陈漫斌
     * @date 2019/3/8 9:40
     * @param claims 私有声明
     * @param subject 客户端主体
     * @param secretKey 密钥
     * @param ttlMillis 过期时间
     * @Modified By
     */
    public static String createJWT(Map<String, Object> claims, String subject, String secretKey, long ttlMillis) {
        //签名算法
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //生成JWT的时间
        long nowMillis = System.currentTimeMillis();
        //这里其实就是new一个JwtBuilder，设置jwt的body
        JwtBuilder builder = Jwts.builder()
                //如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                .setClaims(claims)
                //设置jti(JWT ID)：是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setId(UUID.randomUUID().toString())
                //iat: jwt的签发时间
                .setIssuedAt(new Date(nowMillis))
                //代表这个JWT的主体，即它的所有人，这个是一个json格式的字符串，可以存放什么userid，roldid之类的，作为什么用户的唯一标志。
                .setSubject(subject)
                //设置签名使用的签名算法和签名使用的秘钥
                .signWith(signatureAlgorithm, secretKey);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            //设置过期时间
            builder.setExpiration(exp);
        }
        return builder.compact();
    }
    /**
     * @Description Token的解密
     * @author 陈漫斌
     * @date 2019/3/8 10:08
     * @param token 加密后的token
     * @param secretKey 密钥
     * @Modified By
     */
    public static Claims parseJWT(String token, String secretKey) {
        try {
            Claims claims = Jwts.parser()
                    //设置签名的秘钥
                    .setSigningKey(secretKey)
                    //设置需要解析的jwt
                    .parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {
        }
        return null;
    }

//    /**
//     * @Description 获取密钥签名
//     * @author 陈漫斌
//     * @date 2019/3/8 9:45
//     * @param secret
//     * @Modified By
//     */
//    private static Key getKeyInstance(SignatureAlgorithm signatureAlgorithm, String secret) {
//        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("secret");
//        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
//        return signingKey;
//    }

//    public static void main(String[] args) throws InterruptedException {
//        Map<String, Object> claims = new HashMap<>();
//        claims.put("pg_wx_id", "123456");
//        claims.put("pg_wx_account", "15688888888");
//        String secret = "000000";
//        String jwt = createJWT(claims, "mysub", secret,1000L * 1L);
//        System.out.println(jwt);
//        Thread.sleep(1000L * 5L);
//        String id = JWT.decode(jwt).getClaim("pg_wx_account").asString();
//        System.out.println("pg_wx_account =" + id);
//        claims = parseJWT(jwt, secret);
//        System.out.println("pg_wx_id =" + claims.get("pg_wx_id"));
//    }
}
