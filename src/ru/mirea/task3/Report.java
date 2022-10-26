package ru.mirea.task3;

import java.util.ArrayList;

public class Report {
    ArrayList<Employee> list = new ArrayList<>();

    public Report(ArrayList<Employee> list) {
        this.list = list;
    }

    public void generateReport() {
        for (Employee emp : list) {
            String temp = emp.toString();
            System.out.format("%15s %n", temp);

        }
    }
}