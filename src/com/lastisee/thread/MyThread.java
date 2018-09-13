package com.lastisee.thread;

import static com.lastisee.thread.ThreadTest.LOCK;

public class MyThread implements Runnable {
    public void run() {
    for (int i = 0; i < ThreadTest.LOOP; i++) {
        synchronized (ThreadTest.LOCK) {
            ThreadTest.count++;
        }
    }
    }
}
class DecThread implements Runnable{
    public void run() {
        for (int i = 0; i < ThreadTest.LOOP; i++) {
            synchronized (ThreadTest.LOCK) {
                ThreadTest.count--;
            }
        }
    }
}