package com.simon.javase.file_io;

import com.simon.javase.api_1.Student;

import java.io.*;
import java.util.Properties;

/**
 * 序列化
 */
public class IODemo23 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        oos.writeObject(new Student());
        oos.close();

        //对象序反列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Student s = (Student) ois.readObject();
        String name = s.getName();
        System.out.println(name);
        ois.close();
    }

}
