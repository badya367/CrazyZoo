package ParAviary;

import ParAnimals.Animal;
import ParFood.Food;

import java.util.Arrays;

public abstract class Aviary {

    private final Animal[] aviary;
    private int aviaryLength = 0;

    public Aviary(int animalsCapacity) {
        this.aviary = new Animal[animalsCapacity];
    }

    public final void addAnimal(Animal animal) {
        if (!validateAnimal(animal)) {
            return;
        }
        if (aviaryLength != aviary.length) {
            aviary[aviaryLength] = animal;
            aviaryLength++;
            System.out.format("Животное %s добавлен в вольер \n" +
                            "величина вольера: %d/%d\n",
                    animal.toString(),
                    //toString(),
                    aviaryLength,
                    aviary.length);
        } else {
            System.out.println("Вольер переполнен");
        }
    }

    public final void releaseAnimals() {
        for (int i = 0; i < aviaryLength; i++) {
            aviary[i] = null;
        }
        aviaryLength = 0;
        System.out.println(
                String.format("Животные выпущены из вольера %s", this.toString())
        );
    }

    public abstract void feedAnimals(Food food);

    protected abstract boolean validateAnimal(Animal animal);

    @Override
    public String toString() {
        return "Вольер:" +
                Arrays.toString(aviary) +
                ", aviaryLength=" + aviaryLength +
                '}';
    }
}
