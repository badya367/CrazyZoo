package ParAnimals.SpecificAnimals;

import ParAnimals.Camivorous;
import ParFood.*;

import java.util.ArrayList;

public class Lion extends Camivorous {

    @Override
    public void confirm(Food food) {
        System.out.printf(name + " покушал %s\n", food.toString());
    }

    String name;


    public Lion(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("----------------------------");
        getName();
        System.out.println("----------------------------");
    }

    public String getName() {
        System.out.println("имя: " + name);
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
