package com.simon.homework.internet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需求说明：创建新项目，按以下要求编写代码： 在项目下创建TCP 服务器端 端口号为8888
 * 1:等待客户端连接   如果有客户端连接  获取到客户端对象 2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        byte[] bytes = new byte[1024];
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
        int length;
        while ((length = bis.read(bytes)) != 0) {
            System.out.println("收到客户端发来的消息：" + new String(bytes, 0, length));
        }
    }
}
