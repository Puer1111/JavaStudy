package javaBasic.class9.super2;

public class ClassC extends ClassB {

    public ClassC() {
//        super(); // 기본생성자의 경우 매개변수 없는 생성자가 하나도 없을 떄 자동 생성인데 classB에는 있기 떄문에 불가능하다.
        super(10,20); // 위와 동일.
        System.out.println("ClassC 생성자");
    }
}
