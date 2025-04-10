package javaMiddle.class1.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
// 묵시적 : 컴파일 과정에 생략 되어있는것
// 명시적 : 개발자가 직접 표시한것.
public class Parent extends Object{ // 이런식으로 숨겨져 있는 상속이 있다.

    public void parentMethod(){
        System.out.println("Parent. parentMethod");
    }
}
