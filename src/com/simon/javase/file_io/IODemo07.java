package com.simon.javase.file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo07 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("java03.txt");
        FileOutputStream fos = new FileOutputStream("java04.txt");
        byte[] bys = new byte[5];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
            System.out.println(new String(bys, 0, len));
        }
        fis.close();
        fos.close();

    }
}
