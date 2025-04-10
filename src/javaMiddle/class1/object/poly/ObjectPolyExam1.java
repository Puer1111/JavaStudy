package javaMiddle.class1.object.poly;

public class ObjectPolyExam1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object obj){
//        obj,sound();  Object 에는 car 와 dog 가 없기 때문에 컴파일 에러남.
//        obj.move();

        // 고로 다운 캐스팅 해야함.
        if(obj instanceof Dog dog){ // 이게 ((Dog)obj.sound)(); 랑 같음.
            dog.sound();
        }
        else if(obj instanceof Car car){
            car.move();
        }

        // Object는 최상위 이기 때문에 자식인 Dog 와 Car 의 메소드를 찾을 수 없다. 따라서 다운캐스팅을 통해서 찾아야한다.
        // 다운캐스팅 보다는 메소드 오버라이딩을 사용해야한다.
    }
}
