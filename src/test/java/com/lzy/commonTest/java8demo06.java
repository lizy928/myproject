package com.lzy.commonTest;

import com.lizy.entity.User;

import java.util.Optional;

/**
 * Created By Lizhengyuan on 18-9-7
 */
//Optional
public class java8demo06 {
    public static void main(StringTest args[]){
       /* com.lzy.commonTest.java8demo06 java8Tester = new com.lzy.commonTest.java8demo06();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(java8Tester.sum(a,b));

        Optional c = Optional.of(1);
        System.out.println(c.orElse(2));*/

        User  user = new User(1,"sfe","dsf");
        Optional<User> userInfo = Optional.ofNullable(user);
        //User user2 = userInfo.filter(user1 -> user1.getId() == 1).get();
        System.out.println(userInfo.isPresent());
        System.out.println(userInfo.isPresent() ? userInfo.get() : null);



    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }
}
