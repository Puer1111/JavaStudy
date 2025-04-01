package class10.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();  // 부모 변수가 자식 인스턴스 참조 ( 다형적 참조 )
        // 자식의 *기능* 은 호출 할 수 없다.
        //poly.childMethod();

        // 다운 캐스팅 ( 부모 타입 -> 자식 타입 )
        Child child = (Child) poly;  // poly 를 child 화 시켜버림
        child.childMethod();

        // 변수에 담아 두는것 조차 귀찮음 . 바로 다운 캐스팅 한다.
        // 일시적 다운 캐스팅 - 해당 메서드를 호출 하는 순간만 다운 캐스팅
        ((Child)poly).childMethod();
    }
}
