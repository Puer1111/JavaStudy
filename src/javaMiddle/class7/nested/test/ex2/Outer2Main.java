package javaMiddle.class7.nested.test.ex2;

public class Outer2Main {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.Inner inner = outer.new Inner();
        inner.hello();
    }
}
