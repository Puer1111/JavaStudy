package javaBasic.class11.polyEx5;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void move() {
        System.out.println("Dog move");
    }
}
