package ru.mirea.task27;

import java.util.*;


public class Array {
    public static void main(String[] args) {
        // Task1
        System.out.println("[+] Task1: ");
        Map<String, String> names = new HashMap<>();
        names.put("Иванов", "Илья");
        names.put("Шварев", "Матвей");
        names.put("Зеневич", "Данила");
        names.put("Колчевская", "Мария");
        names.put("Черешнев", "Владислав");
        names.put("Савельев", "Роман");
        names.put("Величко", "Геннадий");
        names.put("Зайцев", "Кирилл");
        names.put("Радченко", "Александр");
        names.put("Елизаров", "Максим");
        System.out.println("[+] Not sorted: ");
        System.out.println(names.toString());
        HashMap<String, String> map = new HashMap<String, String>();
        Set<String> keys = names.keySet(); // The set of keys in the map.
        Iterator<String> keyIter = keys.iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = names.get(key);
            map.put(value, key);
        }
        System.out.println("[+] Sorted: ");
        System.out.println(map.toString());




        Map<String,ArrayList<String>> cities = new HashMap();

        String russia = "Россия";
        ArrayList<String> citiesOfRussia = new ArrayList<>();
        citiesOfRussia.add("Москва");
        citiesOfRussia.add("Санкт-Петербург");
        citiesOfRussia.add("Владивосток");
        citiesOfRussia.add("Нижний Новгород");
        citiesOfRussia.add("Артем");
        cities.put(russia, citiesOfRussia);

        String germany = "Америка";
        ArrayList<String> citiesOfUSA = new ArrayList<>();
        citiesOfUSA.add("Нью-Йорк");
        citiesOfUSA.add("Вашингтон");
        citiesOfUSA.add("Лас-Вегас");
        citiesOfUSA.add("Майями");
        citiesOfUSA.add("Чикаго");
        cities.put(germany, citiesOfUSA);

        String france = "Италия";
        ArrayList<String> citiesOfItaly = new ArrayList<>();
        citiesOfItaly.add("Рим");
        citiesOfItaly.add("Неаполь");
        citiesOfItaly.add("Генуя");
        citiesOfItaly.add("Венеция");
        citiesOfItaly.add("Милан");
        cities.put(france, citiesOfItaly);

        String china = "Япония";
        ArrayList<String> citiesOfJapan = new ArrayList<>();
        citiesOfJapan.add("Токио");
        citiesOfJapan.add("Киото");
        citiesOfJapan.add("Осака");
        citiesOfJapan.add("Нара");
        citiesOfJapan.add("Наэба");
        cities.put(china, citiesOfJapan);

        String sweden = "Чехия";
        ArrayList<String> citiesOfCzech = new ArrayList<>();
        citiesOfCzech.add("Прага");
        citiesOfCzech.add("Брно");
        citiesOfCzech.add("Оломоуц");
        citiesOfCzech.add("Либерец");
        citiesOfCzech.add("Острава");
        cities.put(sweden, citiesOfCzech);


        System.out.println("[+] Task2: ");
        System.out.println(cities.toString());
    }
}