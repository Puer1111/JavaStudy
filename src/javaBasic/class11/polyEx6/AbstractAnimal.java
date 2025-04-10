package javaBasic.class11.polyEx6;

public abstract class AbstractAnimal {
    // 추상 메소드가 있다면 추상 클래스로 선언해야함.
    public abstract void sound();  // 일반적으로 메소드는 바디에 내용이 있어야 하는데 abstract 의 경우 내용이 없어야한다.

    public void move(){
        System.out.println("동물이 움직입니다.");
    };
}

