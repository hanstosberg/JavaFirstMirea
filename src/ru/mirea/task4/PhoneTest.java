package ru.mirea.task4;

public class PhoneTest {
    public static void main(String[] args) {


        Phone obj1 = new Phone(8965526, 251, "Zet");
        Phone obj2 = new Phone(64674632, 249, "Yota");
        Phone obj3 = new Phone(5566786, 231, "Noko");

        System.out.println(obj1.toString());
        obj1.receiveCall("Bob ");
        System.out.println(obj1.getNumber());
        System.out.println(obj2.toString());
        obj2.receiveCall("Sam ");
        System.out.println(obj2.getNumber());
        System.out.println(obj3.toString());
        obj3.receiveCall("Will ");
        System.out.println(obj3.getNumber());


        obj2.receiveCall(6958496, "John");

    }
}