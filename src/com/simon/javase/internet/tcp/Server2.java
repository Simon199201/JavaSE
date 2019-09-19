package com.simon.javase.internet.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        try (ServerSocket ss = new ServerSocket(10000)) {
            Socket s = ss.accept();
            System.out.println("连接成功：" + s.getInetAddress().getHostName());
            InputStream inputStream = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while (true) {
//                int length = inputStream.read(bytes);
                String line = br.readLine();
                System.out.println("服务端收到消息：" + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
