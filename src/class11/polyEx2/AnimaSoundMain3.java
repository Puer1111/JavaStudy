package class11.polyEx2;

public class AnimaSoundMain3 {
    public static void main(String[] args) {
//      AnimalSoundMain2 를 개선한다.
        Animal[] animals = {new Dog(), new Cat(), new Cow()}; // 인스턴스 한번에 생성.

        for(Animal animal : animals){
            sound(animal);
        }

    }
    private static void sound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    // 이렇게 개선해도 단점이 존재한다.
    // 1 . Animal 클래스를 가지고 인스턴스를 생성할 수 있다. -> 필요가 없는 기능이지만 실수로라도 생성할 수 있다.
    // 2 . 메소드 오버라이딩을 하지 않을 수도 있다. --> ex ) 배열 안에 새로운 인스턴스를 또 넣었는데 해당 클래스에는 오버라이딩을 하지 않아서 부모의 메소드가 호출된다.
    // 해결: 추상 메소드 , 추상 클래스를 사용한다. --> 추상 메소드가 있다면 무조건 추상클래스로 선언. 상속받은 추상 메소드는 **반드시** 오버라이딩 해야함. + 인스턴스 생성 불가능 하기에 Animal 생성 안됨.

}
