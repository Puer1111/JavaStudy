package javaBasic.class11.polyEx3;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstactAnimal[] animal = {new Cat(), new Dog(),new Cow()};
        for(AbstactAnimal a : animal) {
            a.sound();
        }
    }
}
