package com.simon.javase.jdk_new_feature.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 函数式接口：Predicate
 */
public class PredicateDemo01 {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "张曼玉,31", "范冰冰,36", "王祖蓝,34"};
        ArrayList<String> list = myFilter(strArray, s -> {
            String[] strings = s.split(",");
            return strings[0].length() > 2;
        }, s -> {
            String[] strings = s.split(",");
            return Integer.parseInt(strings[1]) > 33;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> predicate1, Predicate<String> predicate2) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : strArray) {
            if (predicate1.and(predicate2).test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
