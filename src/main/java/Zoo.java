import ParAnimals.*;
import ParAnimals.SpecificAnimals.Duck;
import ParAnimals.SpecificAnimals.Giraffe;
import ParAnimals.SpecificAnimals.Lion;
import ParAviary.CamivorousAnimalAviary;
import ParAviary.HerbivoreAnimalAviary;
import ParFood.EnumFood.EnumAllFood;
import ParFood.SpecificFood.Feed;
import ParFood.SpecificFood.Grass;
import ParFood.SpecificFood.Meet;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLOutput;
import java.util.Random;

public class Zoo {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        Animal lion = new Lion("Лёва");
        Animal lion2 = new Lion("Стёпа");
        Animal lion3 = new Lion("Костя");
        log.info("Объекты: "+ lion+ ", " + lion2+ ", " + lion3 + "- созданы" );
        lion.eat(new Meet());
        log.info("метод 'eat' отработал успешно");

        log.warn("ожидается ошибка 'IllegalAcessException'");
        lion.eat(new Feed());
        log.info("метод eat отработал корректно, животное отказалось от еды");


        Gson gson = new Gson();

        String lionSrlzt= gson.toJson(lion);
        Lion lionDsrlst = gson.fromJson(lionSrlzt, Lion.class);
        log.info("Данные lion после сериализации: " + lionSrlzt);
        log.info("Данные lion после десериализации: " + lionDsrlst);

        log.info("Сериализация и десериализция прошла успешно");

        log.info("программа успешно выполнена");

    }
}
