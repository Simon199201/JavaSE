package com.simon.javase.file_io;

import java.io.*;
import java.util.ArrayList;

/**
 * 字符缓冲流 java文件到集合
 */
public class IODemo16 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("info1.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        bufferedReader.close();

        printList(arrayList);
    }

    private static void printList(ArrayList<String> arrayList) {
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
