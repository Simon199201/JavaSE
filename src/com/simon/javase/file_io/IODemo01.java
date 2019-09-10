package com.simon.javase.file_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("java.txt");
        //写入文件
        fos.write(97);
        //关闭输出流对象并释放资源
        fos.close();
    }
}
