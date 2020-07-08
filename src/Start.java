import ParAnimals.*;
import ParFood.Food;
import ParFood.CamivorousFood;
import ParFood.Meet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Start {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Лёва", 1);
        Lion lion2 = new Lion("Стёпа", 3);
        Lion lion3 = new Lion("Варя", 2);
        Lion lion4 = new Lion("Толя", 6);
        Lion lion5 = new Lion("Зина", 4);

        lion1.display();
        lion1.eatMeet();

        AviaryCam lion = new AviaryCam(2);
        lion.addAnimal(lion1);
        lion.addAnimal(lion2);
        lion.addAnimal(lion3);
        lion.addAnimal(lion4);
        lion.addAnimal(lion5);
        System.out.println(lion.toString());









    }
}
