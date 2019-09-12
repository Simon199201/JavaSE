package com.simon.javase.file_io;

import com.simon.javase.api_1.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 文件到集合改进版
 */
public class IODemo18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("info3.txt"));
        ArrayList<Student> students = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] arrs = line.split(",");
            Student student = new Student();
            student.setName(arrs[0]);
            student.setAge(Integer.parseInt(arrs[1]));
            student.setSid(arrs[2]);
            student.setAddress(arrs[3]);
            students.add(student);
        }
        br.close();
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
