package com.lzy.commonTest;

import org.junit.Test;

/**
 * Created By Lizhengyuan on 18-12-17
 */
public class StringTest {

    @Test
    public void test(){
        java.lang.String str = "<p>Withdrawable Balance:</p><p>KSh balance_num<a href=\"www.baidu.com\" style=\"margin-left:50px\">汇率？</a></p><p>Daily maximum withdrawal amount: KSh <span style=\"color:red\">maxi_mum</span> </p>";
        str.replace("balance_num","200");
        System.out.println(str);
    }

    @Test
    public void test1(){
        String 我 = "李正元";
        if(我.equals("李正元")){
            System.out.println("是我");
            return;
        }
        System.out.println("不是我");

    }

}
