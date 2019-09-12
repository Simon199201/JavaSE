package com.simon.javase.file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 点名器
 */
public class IODemo17 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("info2.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            students.add(line);
        }

        br.close();
        Random random = new Random();
        int index = random.nextInt(students.size());
        String student = students.get(index);
        System.out.println("当前被点名的同学是：" + student);

    }
}
