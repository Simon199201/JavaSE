package com.simon.javase.innerclass;

public class Outer {
    private int num = 10;
    //成员内部类
    public class Inner{
        public void show(){
            System.out.println(num);//内部类可以直接访问外部类的成员变量和方法
        }
    }
    public void method(){
//        show();外部类不能直接访问内部类的方法和成员变量
        class a{

        }
    }
}
