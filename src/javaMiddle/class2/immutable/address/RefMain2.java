package javaMiddle.class2.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = " + a );
        System.out.println("b = " + b);

//        b.setValue("부산"); // setter가 없고 Final 이기 때문에 값을 바꿀 수 없다.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 불변 객체를 통해 객체를 새로 생성해야 한다는것을 알려주게 된다.

    }
}
