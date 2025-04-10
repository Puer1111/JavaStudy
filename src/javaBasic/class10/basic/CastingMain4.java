package javaBasic.class10.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();  // 에러는 보이지 않지만 classCastException  런타임 오류가 남.
        // Parnet 인스턴스 생성하면 자식 상속 안 보이니까 child 인스턴스 생성되지 않고 있지도 않은 child로 다운캐스팅 하려하니 예외처리가 난다.

        // 런타임 오류 vs 컴파일 오류
        // 런타임 : 실행 중 오류
        // 컴파일 : 실행 전 변수 명 , 잘못된 클래스 이름 등등 오류.

    }
}
