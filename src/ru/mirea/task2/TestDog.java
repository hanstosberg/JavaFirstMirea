package ru.mirea.task2;

public class TestDog {
    static Dog[] mass = new Dog[3];
    public static void main (String[] args) {
        mass[0] = new Dog("Billy", 1);
        mass[1] = new Dog("Tom", 3);
        mass[2] = new Dog("Jonny", 4);

        for (int i = 0; i < 3; i++) {
            System.out.println(mass[i].ToString());
        }
    }
}
