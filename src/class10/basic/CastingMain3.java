package class10.basic;

//upcasting vs downcasting

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; //원래는 (Parent)child 라고 써야 하는데 생략 가능하다. 생략을 권장한다.
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
