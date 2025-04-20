package javaMiddle.class2.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println(obj1.getValue());
        // add 메소드에서 새 객체에 대한 값을 받아서 써야하는데 받는 곳이 없기에 초기값인 10 만 나옴.
    }
}
