package com.simon.javase.internet.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();
        System.out.println("连接成功：" + s.getInetAddress().getHostName());
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
        byte[] bytes = new byte[1024];
        while (true) {
            int length = inputStream.read(bytes);
            System.out.println("服务端收到消息：" + new String(bytes, 0, length));
            outputStream.write("服务端已收到".getBytes());

        }
    }
}
