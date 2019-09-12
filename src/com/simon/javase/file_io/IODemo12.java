package com.simon.javase.file_io;

import java.io.*;

/**
 * 字符流复制java文件 改进版
 * 不涉及到字符编码问题，可以这么搞
 */
public class IODemo12 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        String path = "IODemo10.java";
        String outPath = "IODemo11.java";
        FileReader isr = new FileReader(path);
        FileWriter osw = new FileWriter(outPath);
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars, 0, len);
        }
        isr.close();
        osw.close();
    }
}
