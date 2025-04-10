package javaMiddle.class1.object.poly;

public class ObjectPolyExam2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();   // Object 인스턴스 만들 수 있음.

        Object[] objArr = {dog, car, obj};

        size(objArr);
    }
    private static void size(Object[] objArr){
        System.out.println("전달된 객체의 수 : "  + objArr.length);
    }
    // Object 배열에는 어떤 타입이든 담을 수 있다.
    // objArr[1] 에는 dog 2에는 Car 3에는 object 가 들어감.
}
