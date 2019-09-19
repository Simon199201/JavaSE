package com.simon.javase.internet.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws IOException {
        File file = new File("tcp3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        try (ServerSocket ss = new ServerSocket(10000)) {
            Socket s = ss.accept();
            System.out.println("连接成功：" + s.getInetAddress().getHostName());
            InputStream inputStream = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while (true) {
//                int length = inputStream.read(bytes);
                String line = br.readLine();
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
