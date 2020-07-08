package ParAnimals;

public class AviaryCam extends Aviary{

    public AviaryCam (int sizeAviary) {
        this.sizeAviary = sizeAviary;
    }
    @Override
    public void addAnimal(Animal a) {
        if (result.size() <= sizeAviary) {
            this.result.add(a);
            System.out.println("Хищник добавлен");
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
        return "AviaryCam{" +
                "result=" + result +
                '}';
    }


}
