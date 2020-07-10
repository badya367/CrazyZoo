package ParFood.EnumFood;

import ParFood.Food;
import ParFood.SpecificFood.*;

public enum EnumAllFood {
    GRASS(new Grass()),
    FEED(new Feed()),
    CORN(new Corn()),
    MEET(new Meet()),
    FISH(new Fish()),
    BONES(new Bones());

    private final Food preferences;

    EnumAllFood(Food preferences) {
        this.preferences = preferences;
    }

    public Food getPreferences() {
        return preferences;
    }
}
