package com.simon.homework.jdk_new_feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 【代码题】
 * 问题： 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
 */
public class Test245_04 {
    public static void main(String[] args) {
        String[] arr = {"冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"};
        List<String> stringList = Stream.of(arr).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("郭");
            }
        }).collect(Collectors.toList());
        String[] strings = toArray(stringList, new Function<List<String>, String[]>() {
            @Override
            public String[] apply(List<String> strings) {
                String[] arr = new String[strings.size()];
                for (int i = 0; i < strings.size(); i++) {
                    arr[i] = strings.get(i);
                }
                return arr;
            }
        });
        System.out.println(Arrays.toString(strings));

        System.out.println("-------");
        /**
         * 1、取出前2个元素并在控制台打印输出。 2、取出后2个元素并在控制台打印输出。
         */
        Stream.of(arr).skip(arr.length-2).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    private static String[] toArray(List<String> arr, Function<List<String>, String[]> function) {
        return function.apply(arr);
    }


}
