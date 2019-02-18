package com.lzy.commonTest;

import org.junit.Test;

import java.util.Random;

/**
 * Created By Lizhengyuan on 18-12-26
 */
public class RandomTest {

    /**
     * 生成四位随机码
     */
    @Test
    public void createRandomStr() {
        int len = 4;
        String str = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < len; ++i) {
            int number = random.nextInt(10);// [0,10)
            sb.append(str.charAt(number));
        }
        System.out.println(sb.toString());
    }

}
