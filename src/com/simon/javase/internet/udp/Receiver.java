package com.simon.javase.internet.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * udp接收数据
 */
public class Receiver {
    public static void main(String[] args) throws IOException {
        //创建接收端的socket对象
        DatagramSocket ds = new DatagramSocket(12306);

        //定义数据
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        //接收数据
        while (true) {
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
        }
        //关闭接收端
//        ds.close();
    }
}
