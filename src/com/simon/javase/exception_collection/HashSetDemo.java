package com.simon.javase.exception_collection;

import com.simon.javase.api_1.Student;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("王祖贤",18,"1","北京"));
        hashSet.add(new Student("刘德华",18,"2","北京"));
        hashSet.add(new Student("张曼玉",18,"3","北京"));
        hashSet.add(new Student("张曼玉",18,"3","北京"));
        System.out.println(hashSet);
    }
}
