package com.lastisee.thread;

public class ThreadTest {
    public final static int LOOP = 10000;
    public static int count = 0;
    public static final Object LOCK = new Object();
    public static void main(String[] args) {

        System.out.println("main start");
        Runnable r = new MyThread();
        Runnable r2 = new DecThread();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        //必须调用start方法才能创建新的线程
        t.start();
        t2.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count is: " + count);

    }
}
