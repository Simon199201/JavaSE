package com.simon.javase.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo05 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("java03.txt");
//        //第一次读取数据
//        int b = fis.read();
//        System.out.println((char) b);
//
//        //第二次读取数据
//        int c = fis.read();
//        System.out.println((char) c);
//
//        //再多读取两次
//        c = fis.read();
//        System.out.println((char) c);
//        fis.close();
//
//        int b = fis.read();
//        while (b != -1) {
//            System.out.println((char) b);
//            b = fis.read();
//        }


        //优化
        int b;
        while ((b=fis.read()) != -1) {
            System.out.println((char) b);
        }
    }
}
