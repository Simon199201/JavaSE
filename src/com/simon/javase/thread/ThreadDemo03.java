package com.simon.javase.thread;

/**
 * Lock
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        SellTicketLock mySell = new SellTicketLock();
        Thread t1 = new Thread(mySell, "窗口1");
        Thread t2 = new Thread(mySell, "窗口2");
        Thread t3 = new Thread(mySell, "窗口3");
        t2.start();
        t1.start();
        t3.start();

    }


}
