package ParAviary;

import ParAnimals.Animal;
import ParAnimals.Camivorous;
import ParAnimals.Herbivore;
import ParFood.Food;

public class CamivorousAnimalAviary extends Aviary {
    public CamivorousAnimalAviary(int animalsCapacity) {
        super(animalsCapacity);
    }

    @Override
    public void feedAnimals(Food food) {

    }

    @Override
    protected final boolean validateAnimal(Animal animal) {
        if (animal instanceof Herbivore) {
            System.out.println("Вольер хищников не предназначен для травоядных");
        }
        return animal instanceof Camivorous;
    }
}
