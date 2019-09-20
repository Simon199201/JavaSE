package com.simon.homework.jdk_new_feature.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * 1.    使用lambda表达式分别将以下功能封装到Function对象中
 * a)    求Integer类型ArrayList中所有元素的平均数
 * b)    将Map<String,Integer>中value存到ArrayList<Integer>中
 * 2.    已知学生成绩如下 姓名    成绩 岑小村    59 谷天洛    82 渣渣辉    98 蓝小月    65 皮几万    70
 * 3.    以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
 */
public class Test245_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        int sum = arrayList.stream().mapToInt(value -> value).sum();
        System.out.println("average is " + sum / arrayList.size());


        Map<String, Integer> map = new HashMap<>();
        map.put("simon", 30);
        map.put("simon1", 30);
        List<Integer> collect = map.values().stream().collect(Collectors.toList());
        System.out.println(collect);

        int size = map.size();
        int sum1 = map.values().stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        }).sum();

        int average = sum1 / size;
        System.out.println("平均值是" + average);
    }

}
