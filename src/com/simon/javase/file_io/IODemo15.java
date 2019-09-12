package com.simon.javase.file_io;

import java.io.*;
import java.util.ArrayList;

/**
 * 字符缓冲流 集合到java文件
 */
public class IODemo15 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("你好");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("info1.txt"));
        for (String s : arrayList) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

    }
}
