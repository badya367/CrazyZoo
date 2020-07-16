package ParFood.SpecificFood;

import ParFood.HerbivoreFood;

public class Grass extends HerbivoreFood {
    String foodName = "травушку";

    @Override
    public String toString() {
        return foodName;
    }
}
