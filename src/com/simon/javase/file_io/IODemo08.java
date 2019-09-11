package com.simon.javase.file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制图片
 */
public class IODemo08 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("pic1.png");
        FileOutputStream fos = new FileOutputStream("pic2.png");
        byte[] bys = new byte[5];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();

    }
}
