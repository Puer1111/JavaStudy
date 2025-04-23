package javaMiddle.class4.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive --> Wrapper
        int value = 7;
        Integer boxedValue  = value;  // 오토박싱(AutoBoxing);
        // Wrapper --> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(AutoUnboxing);

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        // ValueOf나 intValue 안붙혀도 자바가 알아서 컴파일 과정에서 바꿔준다. 의도가 명확함.
    }
}
