package ru.mirea.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите длину массива:");
        int max = sc.nextInt();
        while(max<1){
            System.out.println("Введите длину массива:");
            max = sc.nextInt();
        }
        int[] list = new int[max];
        for (int i = 0; i < max; i++) {
            int temp = rand.nextInt(0,max);
            list[i] = temp;
        }
        System.out.println(Arrays.toString(list));
        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if(list[i] % 2==0)
                secondList.add(list[i]);
        }
        System.out.println(secondList);
    }
}