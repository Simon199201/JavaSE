package com.simon.homework.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }
}
