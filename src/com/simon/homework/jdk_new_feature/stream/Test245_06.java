package com.simon.homework.jdk_new_feature.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
 */
public class Test245_06 {
    public static void main(String[] args) {
        String[] arr1 = {"郭靖", "杨康"};
        String[] arr2 = {"黄蓉", "穆念慈"};

        List<String> collect = Stream.concat(Stream.of(arr1), Stream.of(arr2)).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
        Stream.of("", "").parallel();
    }
}
