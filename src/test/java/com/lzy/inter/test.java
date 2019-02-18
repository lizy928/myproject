package com.lzy.inter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Lizhengyuan on 18-11-13
 */
public class test {

    @Test
    public void test(){
        userServiceImpl userService = new userServiceImpl();
        Map<String, Object> result = new HashMap<>();
        PassWordHandle passWordHandle = null;
        passWordHandle = (a , b) -> userService.login(a, b);
        Map<String, Object> map = passWordHandle.passWordHandle("lizy", "123456");
    }
}
