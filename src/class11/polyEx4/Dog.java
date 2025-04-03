package class11.polyEx4;

public class Dog extends AbstactAnimal {

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void move() {
        System.out.println("쫄랑쫄랑");
    }
}
