package com.simon.javase.file_io;

import java.io.*;

/**
 * 复制视频
 */
public class IODemo10 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("video.flv");
        FileOutputStream fos = new FileOutputStream("video1.flv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //第一种方法 42382
//        method1(fos, fis);
//        //第二种方法 64
//        method2(fos, fis);
//        //第三种方法 312
        method3(bos, bis);
//        //第四种方法 32
//        method4(bos, bis);
//        fis.close();
//        fos.close();
        bis.close();
        bos.close();

        System.out.println("共耗时：" + (System.currentTimeMillis() - start));
    }

    private static void method4(BufferedOutputStream bos, BufferedInputStream bis) throws IOException {
        byte[] bys1 = new byte[1024];
        int len1;
        while ((len1 = bis.read(bys1)) != -1) {
            bos.write(bys1, 0, len1);
        }
    }

    private static void method3(BufferedOutputStream bos, BufferedInputStream bis) throws IOException {
        int c;
        while ((c = bis.read()) != -1) {
            bos.write(c);
        }
    }

    private static void method2(FileOutputStream fos, FileInputStream fis) throws IOException {
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
    }

    private static void method1(FileOutputStream fos, FileInputStream fis) throws IOException {
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
    }

}
