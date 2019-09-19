package com.simon.homework.internet;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 需求说明：创建新项目，按以下要求编写代码： 在项目下创建TCP 服务器端 端口号为8888
 * 1:等待客户端连接   如果有客户端连接  获取到客户端对象
 * 2:获取到客户端对象之后 当前在服务器读取数据,客户端传送数据
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.199.187", 8888);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发送的信息：");
            String input = scanner.nextLine();
            bos.write(input.getBytes());
            bos.flush();
        }
//        outputStream.close();
//        bos.close();
//        socket.close();

    }
}
