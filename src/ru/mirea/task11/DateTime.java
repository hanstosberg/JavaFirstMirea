package ru.mirea.task11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {
        Calendar c = new GregorianCalendar();
        c.setTimeInMillis(System.currentTimeMillis());
        c.add(Calendar.MONTH, -1);

        Date date = c.getTime();
        Date dateNow = new Date();
        System.out.println("Developer Chikova");
        System.out.println("Task received: " + date);
        System.out.println("Task done: " + dateNow);
    }
}
