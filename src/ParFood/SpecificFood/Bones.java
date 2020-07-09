package ParFood.SpecificFood;

import ParFood.CamivorousFood;

public class Bones extends CamivorousFood {
    String foodName = "кости";

    @Override
    public String toString() {
        return foodName;
    }
}