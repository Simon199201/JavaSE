package com.simon.homework.api2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {
    }

    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    public static Date StringToDate(String date, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(date);
    }
}
