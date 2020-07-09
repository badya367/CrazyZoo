package ParAnimals;

import ParFood.CamivorousFood;
import ParFood.Food;
import ParFood.HerbivoreFood;

public abstract class Camivorous extends Animal {
    @Override
    public final void eat(Food food) {
        if (validateFood(food)) {
            confirm(food);
        }
    }

    public abstract void confirm(Food food);

    final boolean validateFood(Food food) {
        if (food instanceof HerbivoreFood) {
            System.out.println("Хищник не ест еду для травоядных");
            return false;
        }
        return true;
    }
}
