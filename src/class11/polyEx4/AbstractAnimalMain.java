package class11.polyEx4;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstactAnimal[] animal = {new Cat(), new Dog(),new Cow()};

        for(AbstactAnimal a : animal) {
            sound(a);
            move(a);
        }
    }
    private static void sound(AbstactAnimal a) {
        System.out.println("동물 소리 시작");
        a.sound();
        System.out.println("동물 소리 끝");
    }
    private static void move(AbstactAnimal a) {
        System.out.println("동물 움직이기 시작");
        a.move();
        System.out.println("동물 움직이기 끝");
    }
    //AbstractAnimal 의 경우 전부 추상 메소드이기에 순수 추상 클래스다 -- > 인스턴스 생성도 안되니 단지 다형성만을 위한 껍데기 이다.
}
