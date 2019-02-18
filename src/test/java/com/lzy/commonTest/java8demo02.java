package com.lzy.commonTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Lizhengyuan on 18-9-7
 */
//方法调用
public class java8demo02 {

    public static void main(StringTest[] args) {
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);

        names.stream().forEach(e->{

        });
    }
}
