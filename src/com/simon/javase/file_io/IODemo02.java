package com.simon.javase.file_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo02 {
    public static void main(String[] args) throws IOException {
        //写入单个字节
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("java.txt");
        //写入文件
        fos.write(97);
        //关闭输出流对象并释放资源
        fos.close();


        //写入一组字节
        FileOutputStream fos1 = new FileOutputStream("java1.txt");
        fos1.write("abcd".getBytes());
        fos1.close();

        //写入一组字节的一部分
        FileOutputStream fos2 = new FileOutputStream("java2.txt");
        String content = "abcd";
        fos2.write(content.getBytes(), 2, content.length()-2);
        fos2.close();

    }
}
