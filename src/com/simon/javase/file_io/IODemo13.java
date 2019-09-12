package com.simon.javase.file_io;

import java.io.*;

/**
 * 字符缓冲流
 */
public class IODemo13 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        String path = "IODemo10.java";
        String outPath = "IODemo12.java";
        BufferedReader isr = new BufferedReader(new FileReader(path));
        BufferedWriter osw = new BufferedWriter(new FileWriter(outPath));
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars, 0, len);
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
