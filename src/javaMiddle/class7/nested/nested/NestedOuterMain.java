package javaMiddle.class7.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
//        NestedOuter nest = new  NestedOuter(); // 중첩 클래스 선언 해보려고 바깥 클래스 선언하지 않아도 됨.
        NestedOuter.Nested nested = new NestedOuter.Nested();  // 중첩 클래스 접근 법.
        nested.print();

        System.out.println("NestedClass : " + nested.getClass());
    }
}
