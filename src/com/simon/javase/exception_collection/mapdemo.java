package com.simon.javase.exception_collection;

import com.simon.javase.api_1.Student;

import java.util.*;

public class mapdemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("小龙女", "杨过");
        map.put("郭靖", "黄蓉");
        map.put("牛魔王", "铁扇公主");
        Set<String> strings = map.keySet();
        System.out.println(strings);
        System.out.println("------");
        //方式一：keySet
        for (String key : strings) {
            System.out.println(key + "的另一半是" + map.get(key));
        }
        System.out.println("------");

        Collection<String> values = map.values();
        System.out.println(values);
        System.out.println("------");
        //方式二：entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m : entries) {
            System.out.println(m.getKey() + "的另一半是" + m.getValue());

        }

        //如果学生作为key的话，需要重写hashCode和equal方法，自动生成
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student("王祖贤", 18, "1", "北京"), "北京");
        hashMap.put(new Student("刘德华", 18, "2", "北京"), "西安");
        hashMap.put(new Student("张曼玉", 18, "3", "北京"), "上海");
        hashMap.put(new Student("张曼玉", 18, "3", "北京"), "武汉");
        Set<Map.Entry<Student, String>> entries1 = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries1) {
            System.out.println(entry);
        }

        //统计字符串中每个字符出现的次数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.nextLine();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (hashMap1.get(key) != null) {
                Integer count = hashMap1.get(key);
                count++;
                hashMap1.put(key, count);
            } else {
                hashMap1.put(key, 1);
            }
        }
        Set<Character> characters = hashMap1.keySet();
        for (Character ch : characters) {
            System.out.print(ch+"("+hashMap1.get(ch)+")");
        }
    }
}
