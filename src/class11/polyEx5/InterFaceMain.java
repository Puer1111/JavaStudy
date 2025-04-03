package class11.polyEx5;

public class InterFaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal animal = new InterfaceAnimal(); 인터페이스니까 인스턴스 불가능
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }
        private static void soundAnimal(InterfaceAnimal animal){
            System.out.println("동물 테스트");
            animal.sound();
            System.out.println("동물 테스트 -완-");
        }
}
