package com.simon.homework.thread;

/**
 * 创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
 */
public class Test01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+": "+i);
                    }
                }
            }
        });
        t1.start();

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
