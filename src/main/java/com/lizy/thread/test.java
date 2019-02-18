package com.lizy.thread;

/**
 * Created By Lizhengyuan on 18-12-25
 */
public class test {
    private static int i = 20;
    public static void main(String[] args) {
        for (;;) {
            i --;
            if(i == 10){
                System.out.println("sdfds");
                return;
            }
        }
    }
}
