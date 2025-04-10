package javaBasic.class10.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();  // 부모 변수가 자식 인스턴스 참조 ( 다형적 참조 )
        // 자식의 *기능* 은 호출 할 수 없다.
        //poly.childMethod();

        // 다운 캐스팅 ( 부모 타입 -> 자식 타입 )
        Child child = (Child) poly;  // poly 를 child 화 시켜버림
        child.childMethod();
    }
}
