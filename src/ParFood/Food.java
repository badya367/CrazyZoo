package ParFood;

import ParAnimals.Animal;

public abstract class Food extends Animal {

    public String foodName;
    public int foodWeight;

    /*public String getFoodName() {
        return foodName;
    }

    public int getFoodWeight() {
        return foodWeight;
    }*/

    public Food(String foodName, int foodWeight) {
        this.foodName = foodName;
        this.foodWeight = foodWeight;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }
}
