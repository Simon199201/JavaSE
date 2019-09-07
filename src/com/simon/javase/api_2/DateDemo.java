package com.simon.javase.api_2;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println("getTime is " + date.getTime());

        date.setTime(1000 * 60 * 60);
        System.out.println(date);

        date.setTime(System.currentTimeMillis());

        System.out.println(date);
    }
}
