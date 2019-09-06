package com.simon.javase.api_2;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("year is "+c.get(Calendar.YEAR));
        System.out.println("month is " + (c.get(Calendar.MONTH)+1));
        System.out.println("day is " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("--------");
        //n年前 n年后
        c.add(Calendar.YEAR, -3);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println("--------");

        c.set(2099, Calendar.AUGUST, 5);
        System.out.println("--------");

        System.out.println("year is "+c.get(Calendar.YEAR));
        System.out.println("month is " + (c.get(Calendar.MONTH)+1));
        System.out.println("day is " + c.get(Calendar.DAY_OF_MONTH));
    }

}
