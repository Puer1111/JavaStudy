package javaBasic.class11.polyEx5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
