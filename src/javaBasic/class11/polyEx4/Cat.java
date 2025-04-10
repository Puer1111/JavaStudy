package javaBasic.class11.polyEx4;

public class Cat extends AbstactAnimal {

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
        System.out.println("살금 살금");
    }
}
