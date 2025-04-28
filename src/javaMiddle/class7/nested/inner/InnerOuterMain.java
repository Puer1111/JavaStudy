package javaMiddle.class7.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();     // static 중첩과 다르게 바깥 클래스 인스턴스가 있어야함.
        InnerOuter.Inner inner = outer.new Inner();       // 내부 클래스는 인스턴스 속하기 때문에 바깥 클래스안에 있는 내부 클래스의 인스턴스를 명확히 해야함. 코드에 표시 되듯 참조값을 알고 있다.

        inner.print();
        System.out.println("Class = " + inner.getClass());


    }
}
