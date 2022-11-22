package ru.mirea.task11;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента, номер курса и дату рождения(год, месяц и день)");
        String n = sc.next();
        int s = sc.nextInt();
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, sc.nextInt());
        c.set(Calendar.MONTH, sc.nextInt()-1);
        c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        Student st = new Student(n, s, c.getTime());
        System.out.println(st.toString((1)));
        System.out.println(st.toString(2));
        System.out.println(st.toString(3));
    }
}
