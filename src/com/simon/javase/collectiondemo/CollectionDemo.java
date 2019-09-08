package com.simon.javase.collectiondemo;

import com.simon.javase.api_1.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Collection<Student> collection = new ArrayList();
        collection.add(student);
        collection.add(student);
        System.out.println(collection);

        Iterator iterator = collection.iterator();
        iterator.next();
    }
}
