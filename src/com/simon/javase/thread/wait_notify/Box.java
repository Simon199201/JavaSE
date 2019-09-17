package com.simon.javase.thread.wait_notify;

public class Box {
    private int num;
    private boolean isEmpty = true;

    public synchronized int getNum() {
        if (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        System.out.println("获取第" + (num + 1) + "瓶奶");
        notifyAll();
        return num;
    }

    public synchronized void setNum(int num) {
        if (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num = num;
        isEmpty = false;
        System.out.println("生产第" + (this.num + 1) + "瓶奶");
        notifyAll();
    }
}
