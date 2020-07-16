package ParFood.SpecificFood;

import ParFood.HerbivoreFood;

public class Feed extends HerbivoreFood {
    String foodName = "корм";

    @Override
    public String toString() {
        return foodName;
    }
}
