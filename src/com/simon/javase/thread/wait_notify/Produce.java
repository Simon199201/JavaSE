package com.simon.javase.thread.wait_notify;

public class Produce implements Runnable {
    private Box box;

    public Produce(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            box.setNum(i);

        }
    }
}
