package ParFood;

public abstract class CamivorousFood extends Food {


    public CamivorousFood(String foodName, int foodWeight) {
        super(foodName, foodWeight);
    }


    @Override
    protected void eat(Food food) {

    }
}

