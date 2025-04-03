package class11.diamond;

public class DiamondMain {
    public static void main(String[] args) {
//        InterfaceA a = new InterfaceA() 인터페이스는 인스턴스 생성 불가능

        InterfaceA a = new Child();
        a.methodA();    // Child 인스턴스에 Interface와 Child 둘다 method 라는 메서드있지만 메소드 오버라이딩으로 자식 메소드 출력
        a.methodCommon(); // 동일.

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        // Child 인스턴스에 Child , InterfaceA , InterfaceB 클래스 3개가 다 있다.
        // methodA , methodB , methodCommon 호출했을떄 원래 타입은 Interface 지만 메소드 오버라이딩이기에 전부 다 자식의 메소드 내용을 출력한다.
    }
}
