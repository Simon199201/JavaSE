package com.simon.javase.file_io;

import java.io.File;

/**
 * 就业课(2.1)-File类&IO流
 * 遍历目录
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        File file = new File("/Users/simon/Workpace/BigData/JavaSE");
        printDir(file);
    }

    private static void printDir(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println(f.getAbsolutePath());

                    } else {
                        printDir(f);
                    }
                }
            }

        }
    }
}
