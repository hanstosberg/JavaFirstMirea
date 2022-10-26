package ru.mirea.task3;

import java.util.Scanner;
public class ConverterTest {
    public static void main(String[] args) {
        Converter con = new Converter(1000);
        System.out.println("Choose currency");
        System.out.println("1) Dollar");
        System.out.println("2) Euro");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(con.getCurrencyUSD());
        } else if (choice == 2) {
            System.out.println(con.getCurrencyEUR());
        } else {
            System.out.println("error");
        }
    }
}