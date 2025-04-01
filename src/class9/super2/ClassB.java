package class9.super2;

public class ClassB extends ClassA {
    public ClassB(int a){
        super();  // 부모의 기본 생성자 생략 가능.  --> classA();
        System.out.println("ClassB 생성자 = " + a);
    }
    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
