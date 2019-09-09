package com.simon.javase.file_io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("java.txt");
        System.out.println(file.createNewFile());

        //是否是目录
        System.out.println(file.isDirectory());

        //是否是文件
        System.out.println(file.isFile());

        //是否存在

        System.out.println(file.exists());

        //获取绝对路径
        System.out.println(file.getAbsolutePath());

        //获取路径名字符串
        System.out.println(file.getPath());

        //获取此抽象路径表示的目录名或文件名
        System.out.println(file.getName());


        File file1 = new File("itcast");
        file1.mkdir();
        File file2 = new File(file1, "java.txt");
        file2.createNewFile();
        File file3 = new File(file1, "java");
        file3.mkdir();
        //获取目录中的目录和文件

        String[] list = file1.list();
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        System.out.println("--------");
        //获取目录中的目录和文件对应的File
        File[] files = file1.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println("文件名：" + f.getName());
                } else {
                    System.out.println("目录：" + f.getName());
                }
            }
        }

    }
}
