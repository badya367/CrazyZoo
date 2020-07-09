import ParAnimals.*;
import ParAnimals.SpecificAnimals.Duck;
import ParAnimals.SpecificAnimals.Lion;
import ParAviary.CamivorousAnimalAviary;
import ParAviary.HerbivoreAnimalAviary;
import ParFood.SpecificFood.Grass;
import ParFood.SpecificFood.Meet;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Лёва");
        Animal lion2 = new Lion("Стёпа");
        Animal lion3 = new Lion("Костя");

        lion.eat(new Meet()); // Хищник должен съесть мясо
        lion.eat(new Grass()); // Хищник должен отказаться от травы

        CamivorousAnimalAviary lionAviary = new CamivorousAnimalAviary(1);
        //создаём вольер с вместимостью на одного животного
        lionAviary.addAnimal(lion); //Хищник должен добавиться в вольер, выводится величина вольера
        lionAviary.addAnimal(lion2); //Выводится сообщение о том, что вольер переполнен

        HerbivoreAnimalAviary duckAviary = new HerbivoreAnimalAviary(2);
        Animal duck = new Duck("Настя");
        duckAviary.addAnimal(duck);
        duckAviary.addAnimal(lion3); //Сообщение о невозможности добавить хищника в вольер для травоядных
    }
}
