package com.simon.javase.thread;

import com.simon.javase.thread.wait_notify.Box;
import com.simon.javase.thread.wait_notify.Consumer;
import com.simon.javase.thread.wait_notify.Produce;

/**
 * 生产者 消费者  wait notify
 */
public class ThreadDemo04 {
    public static void main(String[] args) {
        //创建一个奶箱 Box
        Box box = new Box();
        //创建生产者和消费者
        Produce produce = new Produce(box);
        Consumer consumer = new Consumer(box);

        //创建线程
        Thread t1 = new Thread(produce);
        Thread t2 = new Thread(consumer);

        //启动线程
        t1.start();
        t2.start();
    }

}
