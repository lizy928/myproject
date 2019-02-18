package com.lzy.inter;

import java.util.Map;

/**
 * Created By Lizhengyuan on 18-12-11
 */
@FunctionalInterface
public interface PassWordHandle {

    Map<String ,Object> passWordHandle(String userName, String passWord);

}
