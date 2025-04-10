package javaBasic.class10.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조 - 자식 , 부모 클래스 둘다 존재하나 Child 타입이기에 Value 와 Method 둘다 Child 에서 먼저 찾는다.
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.parentMethod();

        // 부모 변수가 부모 인스턴스 참조 - Parent 인스턴스만 존재
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.parentMethod();

        // 부모 변수가 자식 인스턴스 참조 ( 다형적 참조 )
        Parent poly = new Child();   // poly 변수는 Parent 타입이기에 poly.value , poly.method()는 Parent 타입에서 기능을 찾아 실행.
        System.out.println("Parent -> Child");
        System.out.println("Value = " + poly.value); // 변수는 오버라이딩 X ,  poly.value를 Parent 타입에서 찾아서 실행.
        poly.parentMethod(); // 메서드 오버라이딩.   poly 는 Parent 타입이지만 **오버라이딩 된 메서드가 우선권을 가진다**  따라서 Child의 method 가 실행됨.
        // 당연히 인스턴스가 안에 존재해야한다. 부모 -> 자식 -> 손자 메서드의 경우 손자가 가장 우선순위다.
    }
}
