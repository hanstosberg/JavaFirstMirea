package ru.mirea.task4;

public class Phone {
    private int number;
    private double weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, double weight, String model) {
        this(number,model);
        this.weight = weight;
    }


    public int getNumber() {
        return number;
    }
    public void receiveCall(String name) {
        System.out.println(name+ "звонит.");
    }
    public void receiveCall(int number,String name) {
        System.out.println(name+" "+number + " звонит.");
    }

    public void sendMessage(int number) {
        System.out.println("Сообщение отправлено: " + number);
    }

    @Override
    public String toString() {
        return "Phone " +
                "number = " + number +
                ", weight = " + weight +
                ", model = '" + model + '\'';
    }
}