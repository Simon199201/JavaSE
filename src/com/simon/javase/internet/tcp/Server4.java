package com.simon.javase.internet.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {
    public static void main(String[] args) throws IOException {
        File file = new File("tcp4.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        try (ServerSocket ss = new ServerSocket(10000)) {
            Socket s = ss.accept();
            System.out.println("连接成功：" + s.getInetAddress().getHostName());
            InputStream inputStream = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            while ((line = br.readLine()) != null) {
//                int length = inputStream.read(bytes);
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            s.getOutputStream().write("文件传输结束".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        bufferedWriter.close();
    }
}
