package ParAnimals.SpecificAnimals;

import ParAnimals.Herbivore;
import ParFood.Food;

public class Lemur extends Herbivore {
    @Override
    public void confirm(Food food) {
        System.out.printf(name + " покушал %s\n", food.toString());
    }

    String name;


    public Lemur(String name) {
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
