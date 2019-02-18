package com.lizy.thread;

/**
 * Created By Lizhengyuan on 18-12-25
 */
public class buyTicket2 {

    static class MyThread2 implements Runnable{
        private int ticket = 5;
        public void run(){
            while(true){
                System.out.println(Thread.currentThread().getName()+">>>>>"+ ticket--);
                if(ticket < 0){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread2 m = new MyThread2();
        new Thread(m).start();
        new Thread(m).start();
        //CountDownLatch
    }

    /*
    由于3个Thread对象共同执行一个Runnable对象中的代码，因此可能会造成线程的不安全，
    比如可能ticket会输出-1（如果我们System.out....语句前加上线程休眠操作，该情况将很有可能出现），
    这种情况的出现是由于，一个线程在判断ticket为1>0后，还没有来得及减1，另一个线程已经将ticket减1，变为了0，
    那么接下来之前的线程再将ticket减1，便得到了-1。这就需要加入同步操作（即互斥锁），
    确保同一时刻只有一个线程在执行每次for循环中的操作。而在第一种方法中，并不需要加入同步操作，
    因为每个线程执行自己Thread对象中的代码，不存在多个线程共同执行同一个方法的情况。
    */
}
