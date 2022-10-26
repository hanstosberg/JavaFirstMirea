package ru.mirea.task3;

public class Shells {
    public static void main(String[] args) {
        Double a = Double.valueOf(510);
        Double b = Double.valueOf("510");
        System.out.println("1) "+ a + "\n" +b);
        double c = Double.parseDouble("30");
        System.out.println("2) " + c);
        Double d = 8.5;
        d = Double.parseDouble(String.valueOf(d));
        System.out.println("3) " +d);
        double e;
        String s = Double.toString(3.14);
        e = Double.parseDouble(s);
        System.out.println("4) "+ e);
    }
}