package com.simon.homework.api2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:hh:mm");
        System.out.println(simpleDateFormat.format(date));

        System.out.println("--------");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            Date date1 = simpleDateFormat1.parse("2018-03-04");
            System.out.println(simpleDateFormat2.format(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
