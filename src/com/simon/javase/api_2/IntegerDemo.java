package com.simon.javase.api_2;

public class IntegerDemo {
    public static void main(String[] args) {
        String a = Integer.toString(4);
        System.out.println("a is : " + a);

        int b = Integer.parseInt("5");
        System.out.println("b is " + b);

        //自动装箱：把基本数据类型转换成对应的包装类型
        Integer i = 100;

        //拆箱：把包装类类型
        i += 100;
        //只要是对象，在使用前就必须进行不为null的判断
    }
}
