package com.simon.javase.jdk_new_feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<>();
        manList.add("林心如");
        manList.add("张曼玉");
        manList.add("林青霞");
        manList.add("柳岩");
        manList.add("林志玲");
        manList.add("王祖贤");

        Stream<String> manLimit = manList.stream().filter(s -> s.length() >= 3).limit(3);
//        Stream<String> womanLimit = manList.stream().filter(s -> s.startsWith("林")).skip(1);
//        Stream<String> concat = Stream.concat(manLimit, womanLimit);
//        concat.map(Actor::new).forEach(actor -> {
//            System.out.println(actor.toString());
//        });

        List<String> names = manLimit.collect(Collectors.toList());
        System.out.println(names);
    }
}
