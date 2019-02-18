package com.lizy.thread;

/**
 * Created By Lizhengyuan on 18-12-25
 */
public class buyTicket {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MyThread().start();
        new MyThread().start();

    }
    static class MyThread extends Thread {
        private int ticket = 5;

        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() +">>>>>>>>>>"+ ticket--);
                if (ticket < 0) {
                    break;
                }
            }
        }
    }
}

        /*
        在第一种方法中，我们new了3个Thread对象，即三个线程分别执行三个对象中的代码，
        因此便是三个线程去独立地完成卖票的任务；而在第二种方法中，
        我们同样也new了3个Thread对象，但只有一个Runnable对象，
        3个Thread对象共享这个Runnable对象中的代码，因此，便会出现3个线程共同完成卖票任务的结果。
        如果我们new出3个Runnable对象，作为参数分别传入3个Thread对象中，
        那么3个线程便会独立执行各自Runnable对象中的代码，即3个线程各自卖5张票
        */
