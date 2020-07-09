package ParAviary;

import ParAnimals.Animal;
import ParAnimals.Camivorous;
import ParAnimals.Herbivore;
import ParFood.Food;

public class HerbivoreAnimalAviary extends Aviary {
    public HerbivoreAnimalAviary(int animalsCapacity) {
        super(animalsCapacity);
    }

    @Override
    public void feedAnimals(Food food) {

    }

    @Override
    protected final boolean validateAnimal(Animal animal) {
        if (animal instanceof Camivorous) {
            System.out.println("Вольер травоядных не предназначен для хищников");
        }
        return animal instanceof Herbivore;
    }
}
