package com.lzy.inter;

import java.util.Map;

/**
 * Created By Lizhengyuan on 18-12-11
 */
public interface userService {

    Map<String, Object> login(String userName, String passWord);
}
