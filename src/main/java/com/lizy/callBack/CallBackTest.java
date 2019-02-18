package com.lizy.callBack;

import java.util.concurrent.ExecutionException;

/**
 * Created By Lizhengyuan on 18-12-12
 */
public class CallBackTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Li li = new Li();
        Wang wang = new Wang(li);
        //wang.askQuestion("1+1=");
        wang.askQuestion2("1+1=");
    }

}
