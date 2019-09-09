package com.simon.javase.file_io;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        //构造方法1
//        File file = new File("/Users/simon/Downloads/java.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //构造方法2
//        File parent = new File("/Users/simon/Downloads");
//        File file = new File(parent,"java.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file);

        //构造方法3
        File file = new File("/Users/simon/Downloads", "java.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file);

        System.out.println("--------");
        File dir = new File("/Users/simon/Downloads/itheima");
        System.out.println(dir.mkdir());
        //创建目录
        System.out.println("--------");
        File dirs = new File("/Users/simon/Downloads/itheima/dir/dir/dir");
        System.out.println(dirs.mkdirs());

        System.out.println("--------");
        //创建目录 目录跟路径后缀没有关系
        File dir1 = new File("/Users/simon/Downloads/itheima/dir/dir/dir/java.txt");
        System.out.println(dir1.mkdirs());

        //删除文件
        System.out.println("--------");
        File dir2 = new File("/Users/simon/Downloads/itheima/dir/dir/dir/java.txt");
        System.out.println(dir2.delete());

        //创建到本地目录下
        System.out.println("--------");
        File file1 = new File("java.txt");
        System.out.println(file1.createNewFile());


    }
}
