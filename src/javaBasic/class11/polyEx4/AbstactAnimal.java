package javaBasic.class11.polyEx4;

public abstract class AbstactAnimal {
    // 추상 메소드가 있다면 추상 클래스로 선언해야함.
    public abstract void sound();  // 일반적으로 메소드는 바디에 내용이 있어야 하는데 abstract 의 경우 내용이 없어야한다.

    public abstract void move();
}

