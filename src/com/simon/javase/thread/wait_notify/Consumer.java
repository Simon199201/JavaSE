package com.simon.javase.thread.wait_notify;

public class Consumer implements Runnable {
    private Box box;
    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.getNum();
        }
    }
}
