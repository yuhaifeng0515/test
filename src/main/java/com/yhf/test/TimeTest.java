package com.yhf.test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TimeTest {

    public static void main(String[] args) {
        Calendar calendar = GregorianCalendar.getInstance(Locale.CHINA);
        System.out.println(calendar.getTime());

        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2.getTime());
    }
}
