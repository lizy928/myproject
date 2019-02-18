package com.lzy.commonTest;

import com.lizy.entity.User;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created By Lizhengyuan on 19-2-13
 */
public class Test1 {

        private static boolean Paddy;
        String s;
        private User user;
        String str=new String("good");
        char[]ch={'a','b','c'};
        public static void main(String args[]){
            Test1 ex=new Test1();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str+" and ");
            System.out.print(ex.ch);
        }
        public void change(String str,char ch[]){
            //引用类型变量，传递的是地址，属于引用传递。
            str="test ok";
            ch[0]='g';
        }
        @Test
        public void test(){
            Integer a = 128;
            Integer b= 128;
            System.out.println(a.compareTo(b));
            int aa = 128;
            int bb = 128;
            System.out.println(aa == bb );
        }

        @Test
        public void test1() throws UnsupportedEncodingException {
            String a = "sfdsf";
            String b= null;
            b = new String("a".getBytes(),"gbk").getBytes("utf-8").toString();
            System.out.println(b);
        }


        @Test
       public void test2(){
           System.out.println(Paddy);
            System.out.println(user);
            System.out.println("dsfd"+s);
       }
}
