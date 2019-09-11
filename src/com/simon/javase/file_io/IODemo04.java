package com.simon.javase.file_io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据，添加异常处理 1、如何实现换行
 */
public class IODemo04 {
    public static void main(String[] args) {
        //创建字节输出流对象  append:true，表示追加写入
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("~/java04.txt", true);
            fos.write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
