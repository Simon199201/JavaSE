package com.simon.javase.thread;

import java.util.Random;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object object = new Object();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "run");

        //方法一
        while (true) {
//            synchronized (object) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + ":开始售卖第" + tickets + "张票！");
//                    tickets--;
//                }
//            }
            sellTicket();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":开始售卖第" + tickets + "张票！");
            tickets--;
        }
    }
}
