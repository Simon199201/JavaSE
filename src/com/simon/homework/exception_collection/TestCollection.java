package com.simon.homework.exception_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 【代码题】
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        int[] arr = new int[collection.size()];
        for (int i = 0; i < collection.size(); i++) {
            arr[i] = ((ArrayList<Integer>) collection).get(i);

        }
        System.out.println(Arrays.toString(arr));


        System.out.println(collection.isEmpty());

    }


}
