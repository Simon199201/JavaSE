package com.simon.javase.internet.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client4 {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket socket = new Socket("192.168.199.187", 10000);
        File file = new File("JavaSE.iml");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //获取socket的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        //写入数据
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line, 0, line.length());
            bw.newLine();
            bw.flush();
        }
//        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println("收到服务端消息：" + new String(bytes, 0, read));
        br.close();
        socket.close();
    }

}
