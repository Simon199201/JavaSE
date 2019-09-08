package com.simon.javase.generic;

public class GenericDemo {
    public static void main(String[] args) {
        //泛型类
        Generic<String> generic = new Generic<>();
        generic.setT("hello");
        System.out.println(generic.getT());
        System.out.println("--------");
        Generic<Integer> generic1 = new Generic<>();
        generic1.setT(1);
        System.out.println(generic1.getT());

        System.out.println("--------");

        Generic<Boolean> generic2 = new Generic<>();
        generic2.show(true);

        System.out.println("--------");

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show("林青霞");
        genericMethod.show(true);
        genericMethod.show(5.55);

        GenericInterface<String> imp = new GenericInterfaceImpl<>();
        imp.show("我是泛型接口实现的方法");
    }
}
