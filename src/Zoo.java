import ParAnimals.*;
import ParAnimals.SpecificAnimals.Duck;
import ParAnimals.SpecificAnimals.Giraffe;
import ParAnimals.SpecificAnimals.Lion;
import ParAviary.CamivorousAnimalAviary;
import ParAviary.HerbivoreAnimalAviary;
import ParFood.EnumFood.EnumAllFood;
import ParFood.SpecificFood.Grass;
import ParFood.SpecificFood.Meet;

import java.sql.SQLOutput;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Лёва");
        Animal lion2 = new Lion("Стёпа");
        Animal lion3 = new Lion("Костя");

        lion.eat(new Meet()); // Хищник должен съесть мясо


        //создаём вольер с вместимостью на одного животного
        CamivorousAnimalAviary lionAviary = new CamivorousAnimalAviary(1);

        lionAviary.addAnimal(lion); //Хищник должен добавиться в вольер, выводится величина вольера
        lionAviary.addAnimal(lion2); //Выводится сообщение о том, что вольер переполнен

        HerbivoreAnimalAviary duckAviary = new HerbivoreAnimalAviary(5);
        Animal duck = new Duck("Настя 5");
        duckAviary.addAnimal(duck);
        duckAviary.addAnimal(lion3); //Сообщение о невозможности добавить хищника в вольер для травоядных
        System.out.println("------------------------------------------------------");
        System.out.println("Рефакторинг");
        System.out.println("______________________________________________________");

        //-----------------------------
        // after refactoring
        //-----------------------------
        // refactoring №1 - выбрасывание исключения при поедании еды не для того типа животного

        lion.eat(new Grass());

        // refactoring №2 - Занести еду в Enum (реализация: ParFood/EnumFood)

        lion2.eat(EnumAllFood.MEET);

        // refactoring №3 - Использовать три произвольных метода из утилитных классов

        // 1) вольер со случайным размером (использование утилитного метода)
        CamivorousAnimalAviary tigerAviary = new CamivorousAnimalAviary(new Random().nextInt(10));
        System.out.println(tigerAviary.toString());

        // 2)создание уникального id
        System.out.println(lion.getId());

        // 3) сортировка вольера

        Animal giraffe1 = new Giraffe("giraffe1 35");
        Animal giraffe2 = new Giraffe("giraffe2 50");
        Animal duck2 = new Duck("Duck 30");
        Animal duck3 = new Duck("d 5");

        giraffe2.setWeight(50);
        duck2.setWeight(30);

        duckAviary.addAnimal(giraffe1);
        duckAviary.addAnimal(giraffe2);
        duckAviary.addAnimal(duck2);
        duckAviary.addAnimal(duck3);

        System.out.println(duckAviary);
        duckAviary.sortByWeightAnimal();
        System.out.println(duckAviary);
    }
}
