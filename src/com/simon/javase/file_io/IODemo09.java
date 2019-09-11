package com.simon.javase.file_io;

import java.io.*;

/**
 * 复制图片
 */
public class IODemo09 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileOutputStream fos = new FileOutputStream("pic3.txt");
        FileInputStream fis = new FileInputStream("pic3.txt");

        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
//        int read;
//        while ((read= bis.read())!=-1) {
//            System.out.print((char)read);
//        }

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
        bis.close();

    }
}
