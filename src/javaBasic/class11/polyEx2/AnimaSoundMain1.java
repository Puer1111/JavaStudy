package javaBasic.class11.polyEx2;

public class AnimaSoundMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        sound(dog);
        sound(cat);
        sound(cow);
    }
    private static void sound(Animal animal){
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }
    // 메소드 과정 : sound에 들어가는 매개변수인 Animal의 sound를 호출했지만 **메소드 오버라이딩의 경우 자식의 메소드를 우선순위로 출력하기 때문에 가능** 하다.
    // 과정: Sound(dog) --> sound 메소드의 매개변수 Animal animal = new Dog(); 이런식으로 만든다.
    // Dog 인스턴스에는 Animal 과 Dog 가 있고 animal.sound()메소드를 Animal 에서 먼저 찾지만, 메소드 오버라이딩에 의해 오버라이딩한 메소드를 우선순위로 호출한다.
    // 따라서 Dog.sound 호출.

}
