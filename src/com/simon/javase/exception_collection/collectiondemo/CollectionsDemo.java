package com.simon.javase.exception_collection.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println(list);
        System.out.println("--------");
        //升序排序
        Collections.sort(list);

        System.out.println(list);
        System.out.println("--------");
        //反转
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("--------");

        Collections.shuffle(list);

        System.out.println(list);
    }
}
