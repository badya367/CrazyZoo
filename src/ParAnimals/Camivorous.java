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
            try {
                throw new IllegalAccessException("Хищник не ест еду для травоядных");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            return false;
        }
        return true;
    }
}
