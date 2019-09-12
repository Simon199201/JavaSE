package com.simon.javase.file_io;

import com.simon.javase.api_1.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 159_集合到文件数据排序改进版
 */
public class IODemo19 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            Student student = new Student();
            System.out.println("请输入学生的姓名");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("请输入学生的数学分数");
            student.setShuxue(scanner.nextInt());
            System.out.println("请输入学生的语文分数");
            student.setYuwen(scanner.nextInt());
            System.out.println("请输入学生的英语分数");
            student.setEnglish(scanner.nextInt());
            arrayList.add(student);
        }
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getShuxue() + o1.getYuwen() + o1.getEnglish() - o2.getShuxue() - o2.getYuwen() - o2.getEnglish();
            }
        });
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("info4.txt"));
        for (Student s : arrayList) {
            bufferedWriter.write(s.getName() + "," + s.getShuxue() + "," + s.getYuwen() + "," + s.getEnglish());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

    }
}
