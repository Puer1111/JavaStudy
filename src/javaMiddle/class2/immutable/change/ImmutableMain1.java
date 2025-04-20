package javaMiddle.class2.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

        // 불변 값을 변경해야 될 때도 있는데 그럴 때는 새로운 객체에 담아서 반환하면 된다.
    }
}
