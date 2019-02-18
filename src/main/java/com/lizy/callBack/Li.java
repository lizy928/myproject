package com.lizy.callBack;

/**
 * Created By Lizhengyuan on 18-12-12
 */
public class Li {

    public void solveAnswer(String question, CallBack callBack){

        // 为了展示异步效果，所以故意进行延迟
        for(int i=0;i<10000000;i++){

        }
        System.out.println("li: do myself thing");


        String  answer = "";
        if("1+1=".equals(question)){
            answer="2";
        }else{
            answer="no answer";
        }

        System.out.println("li: get answer"+answer);
        callBack.solveProblem(question,answer);
    }
}
