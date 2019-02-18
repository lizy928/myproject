package com.lizy.constant;

import java.util.Map;

/**
 * Created By Lizhengyuan on 18-12-21
 */
public enum  EnumConstant {

    PASSWORD_ERROR(10002, "密码错误"),
    TOKEN_INVLID(1003, "token无效");

    private Integer code;
    private String message;

    EnumConstant(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return this.code;
    }
    public String getMessage(){
        return this.getMessage();
    }

    public static Map assemblyMap(Map map, EnumConstant enumConstant){
        map.put("code", enumConstant.getCode());
        map.put("msg",enumConstant.getMessage());
        return map;
    }

    public static EnumConstant getEnumByCode(int code){
        for (EnumConstant enumConstant : EnumConstant.values()){
            return enumConstant.getCode().equals(code) ? enumConstant : null;
        }
        return null;
    }
}
