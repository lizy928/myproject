package com.lzy.commonTest;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.lang.String;

/**
 * Created By Lizhengyuan on 18-9-7
 */
//ScriptEngineManager
public class java8demo07 {
    public static void main(String args[]){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "Runoob";
        Integer result = null;
        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");

        }catch(ScriptException e){
            System.out.println("执行脚本错误: "+ e.getMessage());
        }
        System.out.println(result.toString());
    }
}
