package com.lizy.thread;

/**
 * Created By Lizhengyuan on 18-12-25
 */
public class buyTicket3  extends Thread{

    private int ticket = 10;
    public void run(){
        for(int i =0;i<10;i++){
            synchronized (this){
                if(this.ticket>0){
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+"卖票---->"+(this.ticket--));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] arg){
        buyTicket3 t1 = new buyTicket3();
        new Thread(t1,"线程1").start();
        new Thread(t1,"线程2").start();
    }

}
