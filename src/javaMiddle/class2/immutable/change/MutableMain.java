package javaMiddle.class2.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        // 계산 이후의 값은 사라짐.  --> 클래스의 value 가 10 에서 30으로 바뀜.
        System.out.println("obj = " + obj.getValue());
    }

}
