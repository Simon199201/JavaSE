package com.simon.homework.thread;

/**
 * 请编写程序，分别打印主线程的名称和子线程的名称。     要求使用两种方式实现：         第一种方式：继承Thread类。         第二种方法：实现Runnable接口。
 */
public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        t1.start();


        Thread myThread = new MyThread();
        myThread.start();
    }
}
