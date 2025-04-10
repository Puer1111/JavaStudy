package javaBasic.class11.polyEx6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        sound(dog);
        sound(bird);
        sound(chicken);

//        fly(dog); // dog 는 인터페이스 구현 X
        fly(bird);
        fly(chicken);
    }

    private static void sound(AbstractAnimal animal){
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 끝");
    }
    private static void fly(Fly fly){
        System.out.println("동물 날기 시작");
        fly.fly();
        System.out.println("동물 날기 끝");
    }
}
