package com.lizy.constant;

import org.junit.Test;

/**
 * Created By Lizhengyuan on 18-12-21
 */
public class test {

    @Test
    public void test(){
        EnumConstant enumByCode = EnumConstant.getEnumByCode(10002);
        System.out.println(enumByCode.getCode());
    }
}
