package com.simon.javase.internet.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket socket = new Socket("192.168.199.187", 10000);

        //获取socket的输出流
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        //写入数据

        outputStream.write("hello,tcp".getBytes());
        byte[] bytes = new byte[1024];
        while (true) {
            //读取数据
            int length = inputStream.read(bytes);
            //解析数据
            System.out.println("客户端收到服务端消息："+new String(bytes, 0, length));
        }

    }
}
