package javaBasic.class7.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s= "hello Java";
        DecoUtil1 util = new DecoUtil1();
        String deco = util.deco(s);
        System.out.println("before = " + s );
        System.out.println("after = " + deco );
    }
    // deco 메소드를 호출하기 위해 인스턴스를 생성 해야한다. deco는 멤버 변수도 없고 기능만 제공한다.
    // 인스턴스의 경우 인스턴스 변수를 사용하기 위한 목적이 큰데 메소드는 인스턴스 변수도 없고 기능만 제공한다.
    // 객체 생성의 의미가 적다.
    // 해결: DecoMain2 확인
}
