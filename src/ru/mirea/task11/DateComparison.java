package ru.mirea.task11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = new GregorianCalendar();
        Date nowTime = new Date();
        System.out.println("Введите год, месяц и день");
        c.set(Calendar.YEAR, sc.nextInt());
        c.set(Calendar.MONTH, sc.nextInt());
        c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.println("Введите часы, минуты и секунды");
        c.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        c.set(Calendar.MINUTE, sc.nextInt());
        c.set(Calendar.SECOND, sc.nextInt());
        Date userTime = c.getTime();
        System.out.println("Введенная дата " + ((userTime.getTime() < nowTime.getTime())? "раньше" : "позже") + " текущей");
    }

}
