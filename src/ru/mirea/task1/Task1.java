
package ru.mirea.task1;
import java.util.Random;
public class Task1 {


    public static int Factorial(int x) {
        int i = 1;
        int answer = 1;

        while (i != x) {
            answer *= (i + 1);
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        //Задание 3

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int answer = 0;
        //С помощью цикла for
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println("Сумма числел массива циклом for: " + answer);

        //С помощью цикла for
        answer=0;
        int j=0;
        while (j!=arr.length)
        {
            answer += arr[j];
            j++;
        }
        System.out.println("Сумма числел массива циклом while: " + answer);

        //С помощью цикла do while
        answer=0;
        j=0;
        do{
            answer+=arr[j];
            j++;
        }
        while (j<arr.length);
        System.out.println("Сумма числел массива циклом do while: " + answer);


        //Задание 4
        String stringanswer = "";
        for (int i = 0; i < args.length; i++) {
            stringanswer += args[i] + " ";
        }
        System.out.println("Аргументы командной строки: " + stringanswer);

        //Задание 5

        stringanswer = "";
        for (int i = 1; i < 11; i++) {
            stringanswer += 1 + "/" + i + " ; ";
        }
        System.out.println("Гармонический ряд: " + stringanswer);


        //Задание 6.1
        int[] arrayrandom=new int[10];
        for (int i = 0; i < 10; i++) {
            arrayrandom[i] = (int) (Math.random() * 100);

        }
        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 1 - неотсортированный: " + stringanswer);

        boolean isSorted=false;
        while(!isSorted) {
            isSorted=true;
            for (int i = 1; i < arrayrandom.length; i++) {
                if (arrayrandom[i] < arrayrandom[i - 1]) {
                    int temp = arrayrandom[i];
                    arrayrandom[i] = arrayrandom[i - 1];
                    arrayrandom[i - 1] = temp;
                    isSorted=false;
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
            arrayrandom[i] = gen.nextInt(100);

        }
        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 2 - неотсортированный: " + stringanswer);

        isSorted=false;
        while(!isSorted) {
            isSorted=true;
            for (int i = 1; i < arrayrandom.length; i++) {
                if (arrayrandom[i] < arrayrandom[i - 1]) {
                    int temp = arrayrandom[i];
                    arrayrandom[i] = arrayrandom[i - 1];
                    arrayrandom[i - 1] = temp;
                    isSorted=false;
                }
            }
        }

        stringanswer = "";
        for (int i = 0; i < arrayrandom.length; i++) {
            stringanswer += arrayrandom[i] + " ";

        }
        System.out.println("Рандомайзер 2 - отсортированный: " + stringanswer);


        //Задание 8
        System.out.println("Факториал числа 6: " + Factorial(6));
    }
    //
}


