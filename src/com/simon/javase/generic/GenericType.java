package com.simon.javase.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类型通配符
 */
public class GenericType {
    public static void main(String[] args) {
        //类型通配符
        List<?> list = new ArrayList<>();
        List<?> list1 = new ArrayList<Integer>();
        List<?> list2 = new ArrayList<String>();

        System.out.println("--------");

        List<? extends Number> list3 = new ArrayList<Integer>();
        List<? super Number> list4 = new ArrayList<Object>();
//        list3.add("S"); //报错 这种通配符仅表示它是各种泛型 List 的父类，并不能把元素加入到其中。
//        list3.get(0); //可以
    }
}
