package com.simon.javase.api_2;

/**
 * 就业课(2.1)-常用API第二部分 046_Math
 */
public class MathDemo {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        System.out.println("--------");
        //>= 参数的整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");

        //<= 参数的整数
        System.out.println(Math.floor(12.34));

        System.out.println("--------");
        //最大值
        System.out.println(Math.max(2,10));

        System.out.println("--------");
        //最小值
        System.out.println(Math.min(2,10));

        System.out.println("--------");
        //x的n次方
        System.out.println(Math.pow(2, 10));

        System.out.println("--------");
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100+1));




    }
}
