package ParFood.SpecificFood;

import ParFood.CamivorousFood;

public class Fish extends CamivorousFood {
    String foodName = "рыбку";

    @Override
    public String toString() {
        return foodName;
    }
}