package javaMiddle.class2.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 사이드 이펙트 : 예견치 못한 곳에서 문제가 발생하는것
        // 사이드 이펙트의 예시이다.
        Address a =  new Address("서울");
        Address b = a;
        System.out.println("a = " + a );
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("부산 -> b ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    private static void change (Address address , String changeAddress){
        System.out.println("주소값을 변경한다  -> " + changeAddress);
        address.setValue(changeAddress);
    }
    // 객체를 공유하는 것을 막을 수 있는 방법은 없다.
    // 그러나 문제점은 객체를 공유하는 행위 가 아닌 객체의 값을 "변경" 하는것에 있다.
    // 따라서 변하지 못하게 만들어야한다.
}
