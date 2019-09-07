package com.simon.javase.api_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        s = simpleDateFormat1.format(date);
        System.out.println(s);

        System.out.println("--------");
        String ss = "2020年01月12日 18:55:21";
        Date date1 = simpleDateFormat1.parse(ss);
        System.out.println(date1);

    }
}
