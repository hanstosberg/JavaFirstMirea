package ru.mirea.task3;

import java.util.Random;
public class TwoRandomArrays {

    public static void main(String[] args) {
        double [] arrayrandom = new double [10];
        for (int i = 0; i < 10; i++) {
            arrayrandom[i] = (double) (Math.random() * 18);

        }
        String stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 1 - неотсортированный: " + stringanswer);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrayrandom.length; i++) {
                if (arrayrandom[i] < arrayrandom[i - 1]) {
                    double temp = arrayrandom[i];
                    arrayrandom[i] = arrayrandom[i - 1];
                    arrayrandom[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 1 - отсортированный: " + stringanswer);

        //Задание 6.2
        Random gen = new Random();
        for (int i = 0; i < arrayrandom.length; i++) {
            arrayrandom[i] = gen.nextDouble(100);

        }
        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 2 - неотсортированный: " + stringanswer);

        isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrayrandom.length; i++) {
                if (arrayrandom[i] < arrayrandom[i - 1]) {
                    double temp = arrayrandom[i];
                    arrayrandom[i] = arrayrandom[i - 1];
                    arrayrandom[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 2 - отсортированный: " + stringanswer);
    }
}
