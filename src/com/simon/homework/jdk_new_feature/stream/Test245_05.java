package com.simon.homework.jdk_new_feature.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 有如下整数1，-2，-3，4，-5 使用Stream取元素绝对值并打印
 */
public class Test245_05 {
    public static void main(String[] args) {
        Integer[] arr = {1, -2, -3, 4, -5};
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(-2);
//        arrayList.add(-3);
//        arrayList.add(4);
//        arrayList.add(-5);
//        arrayList.stream().map(Math::abs).forEach(System.out::println);
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(Math::abs).forEach(System.out::println);


        String[] ss = {"", "2"};
        Stream<String> stream1 = Stream.of(ss);

        Integer[] arr1 = {1, -2, -3, 4, -5};
        Stream<Integer> stream2 = Stream.of(arr1);

        int[] ints = {1, -2, -3, 4, -5};
        Stream<int[]> ints1 = Stream.of(ints);


    }
}
