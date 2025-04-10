package javaBasic.class11.polyEx4;

public class Cow extends AbstactAnimal {

    @Override
    public void sound() {
        System.out.println("moo");
    }

    @Override
    public void move() {
        System.out.println("성큼성큼");
    }
}
