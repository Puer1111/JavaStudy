package javaMiddle.class3.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);
        int result = adder.getValue();
        System.out.println("result : " + result);

        System.out.println("result : " + adder);
        System.out.println("result : " + adder2);
        System.out.println("result : " + adder3);
        // 다 같은 참조값을 반환하는걸 보여줌.
    }
}
