package ru.mirea.task2;

public class Dog {

    private String name;
    private int age;
    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int  getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>=0) {
            this.age = age;
        }
        else{
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }
    public int HumanAge(){
        int human = age * 7;
        return human;
    }
    public String ToString(){
        return "Имя собаки: "+ name+", Возраст собаки: "+age+", Возраст собаки в «человеческом» возрасте: "+ HumanAge();
    }

}
