package class11.polyEx2;

public class AnimaSoundMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        Animal[] animals = {dog, cat, cow}; // 이제는 상속 받기 때문에 타입을 통일 할 수 있다.  Animal[0] animal = dog 이런식.

        for(Animal animal : animals){
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }


}
