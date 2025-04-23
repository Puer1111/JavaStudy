package javaMiddle.class4.wrapper.ex;

public class Test3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        //Integer -> int
        int intValue = integer1.intValue();
        // int -> Integer
        Integer integer2 = Integer.valueOf(intValue);

        // ParseInt : String -> int 조심해야함.

        System.out.println("integer1 = " + integer1);
        System.out.println("IntValue = " + intValue);
        System.out.println("integer2 = " + integer2);

    }
}
