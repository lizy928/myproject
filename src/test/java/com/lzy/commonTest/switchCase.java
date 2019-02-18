package com.lzy.commonTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;

/**
 * Created By Lizhengyuan on 18-11-15
 */
public class switchCase {

    public static void main(String[] args) {
        String str = "邀请好友#个";
        String[] strings = str.split("#");
        System.out.println(strings.length);
        //System.out.println(strings[0]);
        //System.out.println(strings[1]);
        System.out.println(str.contains("#"));
        System.out.println(str.replace("#","10"));


    }

    @Test
    public void test(){
        String str1 = "2390200";
        String str2 = "2390200";
        System.out.println(str1.equals(str2));
    }

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        System.out.println(list.isEmpty());
    }

    @Test
    public void test2(){
        Map<String, Object> map1 = new HashMap<>();
        map1.put("a",1);
        Map<String, Object> map2 = new HashMap<>();
        map1.put("b",2);
        map1.putAll(map2);
        System.out.println(map1);
    }


}
