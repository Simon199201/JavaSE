package com.simon.javase.file_io;

import java.io.*;

/**
 * 字符流复制java文件
 */
public class IODemo11 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        String path = "IODemo10.java";
        String outPath = "IODemo11.java";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outPath));
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars, 0, len);
        }
        isr.close();
        osw.close();
    }
}
