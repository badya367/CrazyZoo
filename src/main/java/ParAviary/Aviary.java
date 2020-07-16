package ParAviary;

import ParAnimals.Animal;
import ParFood.Food;

import java.util.Arrays;
import java.util.Comparator;

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
    //--------------------------------------
    //Сортировка животных в вольерах по весу
    //--------------------------------------
    public void sortByWeightAnimal() {
        Arrays.sort(aviary, 0, aviaryLength, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return -1;
                }
                if (o1.getWeight() < o2.getWeight()) {
                    return 1;
                }
                return 0;

            }
        });
    }
}
