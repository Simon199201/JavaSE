package com.simon.homework.file_io;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("java.txt");
        if (file.exists()) {
            System.out.println("文件大小:"+file.length());
            System.out.println("绝对路径:"+file.getAbsolutePath());
//            System.out.println("父路径:"+file.getParentFile().getAbsolutePath());

        }
    }
}
