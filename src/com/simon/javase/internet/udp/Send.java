package com.simon.javase.internet.udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * udp发送数据
 */
public class Send {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象
        DatagramSocket ds = new DatagramSocket();
        DatagramPacket dp;

        //编写数据
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发送的文字：");
            String input = scanner.nextLine();
            if (input.equals("886")) {
                break;
            } else {
                dp = new DatagramPacket(input.getBytes(), input.getBytes().length, InetAddress.getByName("192.168.199.187"), 12306);
                //发送数据
                ds.send(dp);
            }

        }
        ds.close();
    }
}
