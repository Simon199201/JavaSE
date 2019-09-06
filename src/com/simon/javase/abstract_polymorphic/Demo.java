package com.simon.javase.abstract_polymorphic;

/**
 * 测试类
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(15);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();


    }
}
