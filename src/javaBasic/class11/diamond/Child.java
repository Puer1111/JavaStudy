package javaBasic.class11.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA()");
    }
    @Override
    public void methodB() {
        System.out.println("Child.methodB()");
    }
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon()");
    }  // 다중 상속에 같은 메소드가 있어도 어차피 메소드 오버라이딩은 자식의 메소드를 쓴다.
}
