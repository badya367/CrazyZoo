package ParAnimals;

import ParFood.CamivorousFood;
import ParFood.Food;
import ParFood.HerbivoreFood;

public abstract class Herbivore extends Animal {
    @Override
    public final void eat(Food food) {
        if (validateFood(food)) {
            confirm(food);
        }
    }

    public abstract void confirm(Food food);

    final boolean validateFood(Food food) {
        if (food instanceof CamivorousFood) {
            System.out.printf("Травоядное не ест еду для хищников %s\n", food.toString());
            return false;
        }
        return true;
    }
}
