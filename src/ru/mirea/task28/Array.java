package ru.mirea.task28;

public class Array {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 11499999);

        Auto.InnerNoStatic autoNoStatic = auto.new InnerNoStatic();
        System.out.println(autoNoStatic.getPrice());

        Auto.InnerStatic autoStatic = new Auto.InnerStatic();

        System.out.println(auto.getName());

        Auto autoAnonymus = new Auto("Mercedes", 35999999) {
            public String getName() {
                return "Anonymus";
            }
        };
        System.out.println(autoAnonymus.getName());
    }
}