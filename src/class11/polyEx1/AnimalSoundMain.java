package class11.polyEx1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");

        dog.sound();
        cat.sound();
        cow.sound();
        // 같은 메소드 여러번 중복.

    }
    private static void soundCow(Cow cow){
        cow.sound();
    } // 이런식으로 메소드로 하려해도 매개변수가 타입이 달라서 불가능하다.
    // For 문의 경우에도 배열을 반복하려면 타입을 정해야 하는데 타입이 다 달라서 불가능하다.

}


