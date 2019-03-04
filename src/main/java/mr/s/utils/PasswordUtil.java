package mr.s.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordUtil {
    public static String encrypt(String password, String passwordSalt){
        int hashIterations = 2;//加密的次数
        Object salt = passwordSalt;//盐值
        Object credentials = password;//密码
        String hashAlgorithmName = "MD5";//加密方式
        Object simpleHash = new SimpleHash(hashAlgorithmName, credentials,
                salt, hashIterations);
        return simpleHash.toString();
    }
}
