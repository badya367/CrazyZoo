package ParAnimals;

import ParFood.*;

import java.util.ArrayList;

public class Lion extends Camivorous {

    String name;
    int age;
    public Lion (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(Food food) {
        System.out.println(name + " покушал " + food.foodName + ": " + food.foodWeight + " кг");
        System.out.println("----------------------------");

    }

    public void eatMeet () {
        Meet meet = new Meet("мяско", 5);
        eat(meet);
    }

    public void display() {
        getName();
        System.out.println("----------------------------");
        getAge();
        System.out.println("----------------------------");
    }

    public String getName() {
        System.out.println("имя: " + name);
        return name;
    }

    public int getAge() {
        System.out.println("Возраст " + name + ": "+ age + " лет/год");
        return age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
