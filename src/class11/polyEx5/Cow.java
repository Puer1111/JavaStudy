package class11.polyEx5;

public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("moo");
    }
    @Override
    public void move() {
        System.out.println("Cow move");
    }
}
