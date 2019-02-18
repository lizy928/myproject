package com.lizy.callBack;

import java.util.concurrent.*;

/**
 * Created By Lizhengyuan on 18-12-12
 */
public class Wang implements CallBack {

    Li li;

    public Wang(Li li){
        this.li=li;
    }

    // 主线程不关心异步执行的结果
    public void askQuestion(String  question)  {
        System.out.println("wnag：li,"+question);

        // Runnable异步方式，不等待,不关心返回值
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 注意，这里吧wang.this也传了过去
                li.solveAnswer(question,Wang.this);
            }
        }).start();

        System.out.println("wang：我逛街了");

    }

    // 主线程关心异步执行的结果
    public void askQuestion2(String  question) throws ExecutionException, InterruptedException {
        System.out.println("wnag：li," + question);

        // Callable异步方式，不等待
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() {
                li.solveAnswer(question, Wang.this);
                return null;
            }
        });
        Future<?> future = executorService.submit(futureTask);

        System.out.println("wang：我逛街了");
        // 对异步回调返回的结果继续处理
        Object o1 = future.get();
        System.out.println("wang：根据异步结果继续干活");

    }

    @Override
    public void solveProblem(String question, String answer) {
        System.out.println("wang:"+question+"答案是："+answer);
    }
}
