package com.springmvc.common.utils;

import com.springmvc.entity.UUser;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordEncry {


    //随机数生成器
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    //指定散列算法为md5
    private static String algorithmName = "MD5";
    //散列迭代次数
    private static final int hashIterations = 2;

    /**
     * 生成随机盐值对密码进行加密
     * @param userLogin  登录识别串（用户名）
     * @return
     */
    public static UUser encrypt(UUser userLogin) {

        String newPassword =
                new SimpleHash(algorithmName,userLogin.getPswd(),null,hashIterations).toHex();

        userLogin.setPswd(newPassword);
        return userLogin;


    }
}