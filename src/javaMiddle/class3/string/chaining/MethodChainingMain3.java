package javaMiddle.class3.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result : " + result);

        // 참조값에 dot 하면 메소드 호출이 가능한데 add메서드가 자기자신을 반환하기에 가능하다.
        // 이런식으로 쭉 늘어지는게 chain 같아서 methodChain이다.
    }
}
