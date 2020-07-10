package ParAnimals;

import ParFood.EnumFood.EnumAllFood;
import ParFood.Food;

import java.util.UUID;

public abstract class Animal {
    private String id;
    private int weight = 0;



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getId() {
        if (id == null) {
            id= UUID.randomUUID().toString();
        }
            return id;
    }

    public abstract void eat(Food food);
    public  void eat(EnumAllFood enumFoodHerbivore) {
        eat(enumFoodHerbivore.getPreferences());
    }
}
