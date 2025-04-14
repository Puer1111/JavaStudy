package javaMiddle.class1.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍1" , 2);
        Dog dog2 = new Dog("멍멍2" , 5);

        System.out.println("1. 단순 기능 호출  toString()");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2.println 호출  toString()");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);


        System.out.println("3. Object 다형성 활용");
        ObjectPrinter objectPrinter = new ObjectPrinter();
        objectPrinter.print(car);
        objectPrinter.print(dog1);
        objectPrinter.print(dog2);

        //참조값 보기
        System.out.println("참조값 보기");
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue);

        //Car 의 경우 toString 을 재정의 하지 않았다 따라서 참조값 주소 그대로 나오고 Dog 는 재정의 해서 해당 객체 상태를 볼 수 있다.
//        ObjectPrinter의 경우 Object 타입을 가지고 있기에 Car , Dog 다 받을 수 있으며 메서드 내부에서 toString() 호출 한다. 그 다음 자식의 재정의 된 메소드가 있는지 확인한다.
        // Car 는 없지만 Dog 는 있기 때문에 오버라이딩 되서 dog.toString() 을 출력한다.
        // 현재 Dog 는 재정의 했기에 참조 주소를 알수 없지만 만약 할고 싶다면 Integer.toHexString(System.identityHashCode(dog1)) 이런식으로 하면 된다.
    }
}
