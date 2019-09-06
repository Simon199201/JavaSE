package com.simon.homework.api2;

import java.util.Calendar;

/**
 * 就业课(2.1)-常用API第二部分
 * 【代码题】
 * 用程序判断2018年2月14日是星期几。
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018, 1, 14);
        int weekday = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("weekday is " + weekday);
    }
}
