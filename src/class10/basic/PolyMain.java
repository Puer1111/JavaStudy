package class10.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모가 부모 인스턴스 참조. 메모리에 parent 만 있음
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 -> 자식 참조
        // 자식이 인스턴스 생성했기에 메모리에 child 와 parent 다 있음.
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 -> 자식 인스턴스 참조( 다형적 참조 )
        System.out.println("Parnet -> Child");
        Parent poly = new Child();   // 부모는 자식을 참조 할 수 있다 반대는 불가능.
        poly.parentMethod();
        // 자식의 기능 호출 불가능.
        // poly.childMethod(); Parent 타입은 Parent 만 알기 떄문에 자식 메소드 호출 불가능.
        // 상속의 기본은 부모 방향으로 올라갈 순 있지만 자식방향으로 내려갈 순 없다.
    }
}
