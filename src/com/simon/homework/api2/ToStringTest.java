package com.simon.homework.api2;

public class ToStringTest{
    static int i = 1;
    public static void main(String args[]){
        //println底层实现是打印对象的toString方法
        System.out.println("love " + new ToStringTest());//love java
        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}
