package com.simon.javase.jdk_new_feature.predicate;

import java.util.function.Predicate;

/**
 * 函数式接口：Predicate
 */
public class PredicateDemo {
    public static void main(String[] args) {
        boolean result = checkString("helloworld", s -> s.length() > 8);
        System.out.println("checkString" + result);

        boolean result1 = checkStringWithAdd("java", s -> true, s -> true);
        System.out.println("checkStringWithAdd is " + result1);

        boolean result2 = checkStringWithOr("java", s -> true, s -> false);
        System.out.println("checkStringWithOr is " + result2);
    }

    private static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    /**
     * Predicate 逻辑非
     */
    private static boolean checkStringWithNegate(String s, Predicate<String> predicate) {
        return predicate.negate().test(s);
    }

    /**
     * Predicate 逻辑与
     */
    private static boolean checkStringWithAdd(String s, Predicate<String> predicate, Predicate<String> predicate1) {
        return predicate.and(predicate1).test(s);
    }

    /**
     * Predicate 逻辑与
     */
    private static boolean checkStringWithOr(String s, Predicate<String> predicate, Predicate<String> predicate1) {
        return predicate.or(predicate1).test(s);
    }
}
