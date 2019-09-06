package com.simon.javase.api_2;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);

        calendar.add(Calendar.DAY_OF_MONTH, -1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("day is " + day);
    }
}
