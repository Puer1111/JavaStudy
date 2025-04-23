package javaMiddle.class4.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive --> Wrapper
        int value = 7;
        Integer boxedValue  = Integer.valueOf(value);

        // Wrapper --> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        // 수동으로 변동 하기 귀찮다. 자동으로 변형 해본다.
    }
}
