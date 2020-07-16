package ParAnimals;

import Exceptions.IllegalFoodException;
import ParFood.CamivorousFood;
import ParFood.Food;


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
            throw new IllegalFoodException("Травоядное не ест еду для хищников");
        }
        return true;
    }
}
