package com.simon.javase.internet.tcp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket socket = new Socket("192.168.199.187", 10000);
        try {

            //获取socket的输出流
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            //写入数据
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入要发送的数据");
                String s = scanner.nextLine();
                if (s.equals("886")) {
                    break;
                }
                bw.write(s, 0, s.length());
                bw.newLine();
                bw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }

    }
}
