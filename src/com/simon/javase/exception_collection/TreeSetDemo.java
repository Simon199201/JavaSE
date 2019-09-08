package com.simon.javase.exception_collection;

import com.simon.javase.api_1.Student;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(1);
        System.out.println(treeSet);

        //自然排序Comparable的使用
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("王祖贤",15,"1","北京"));
        students.add(new Student("刘德华",18,"2","北京"));
        students.add(new Student("张曼玉",18,"3","北京"));
        students.add(new Student("张曼玉",18,"3","北京"));
//      如果Student不实现Comparable接口，报错  System.out.println(students); //java.lang.ClassCastException
        System.out.println(students);
        System.out.println("--------");
        //使用比较器排序
        TreeSet<Student> students2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });
        students2.add(new Student("王祖贤",15,"1","北京"));
        students2.add(new Student("刘德华",18,"2","北京"));
        students2.add(new Student("张曼玉",18,"3","北京"));
        students2.add(new Student("张曼玉",18,"3","北京"));
//      如果Student不实现Comparable接口，报错  System.out.println(students); //java.lang.ClassCastException
        System.out.println(students2);

        System.out.println("--------");

        //获取1-20之间的随机数，要求随机数不能重复
        Set<Integer> set = new HashSet<>();
        while (set.size() != 10) {
            int random = new Random().nextInt(20) + 1;
            set.add(random);
        }
        System.out.println(set);
    }
}
