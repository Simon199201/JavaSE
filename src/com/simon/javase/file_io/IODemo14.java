package com.simon.javase.file_io;

import java.io.*;

/**
 * 字符缓冲流 特有功能复制java文件
 */
public class IODemo14 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        String path = "IODemo10.java";
        String outPath = "IODemo13.java";
        BufferedReader isr = new BufferedReader(new FileReader(path));
        BufferedWriter osw = new BufferedWriter(new FileWriter(outPath));
        String len;
        while ((len = isr.readLine()) != null) {
            osw.write(len);
            osw.newLine();
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
