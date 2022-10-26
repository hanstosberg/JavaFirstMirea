package ru.mirea.task4;

import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Season season = Season.WINTER;
        switch (season){
            case AUTUMN -> System.out.println("i love autumn");
            case SPRING -> System.out.println("i love spring");
            case SUMMER -> System.out.println("i love summer");
            case WINTER -> System.out.println("i love winter");
        }
        for(Season season1 : Season.values()){
            System.out.println(season1);
            System.out.println("temperature: "+season1.getTempereture());
            System.out.println(season1.getDiscription());
        }

    }
}