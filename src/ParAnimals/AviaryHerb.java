package ParAnimals;

public class AviaryHerb extends Aviary {

    public AviaryHerb (int sizeAviary) {
        this.sizeAviary = sizeAviary;
    }


    public void addAnimal(Animal a) {
        if (result.size() <= sizeAviary) {
            this.result.add(a);
            System.out.println("Тровоядное добавлено");
        }
        else if (sizeAviary <0) {
            System.out.println("Неккоректный вольер, постройте заборчик хотя бы");
        }
        else {
            System.out.println("Вольер заполнен");
        }
    }
    @Override
    public String toString() {
        return "AviaryHerb{" +
                "result=" + result +
                '}';
    }
}
