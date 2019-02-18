package com.lzy.inter;

import java.util.Map;

/**
 * Created By Lizhengyuan on 18-12-11
 */
public class userServiceImpl implements userService {

    @Override
    public Map<String, Object> login(String userName, String passWord) {
        System.out.println(userName+">>>>>>>>>>>>>>>>>>>>>"+passWord);
        return null;
    }
}
