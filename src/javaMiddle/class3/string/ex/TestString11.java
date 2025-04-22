package javaMiddle.class3.string.ex;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);}
}
