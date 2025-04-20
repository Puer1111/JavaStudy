package javaMiddle.class2.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b= 20;
        System.out.println(" 20 -> b " );
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a는 10 으로 정했고 b 는 a의 값을 복사해서 온것이기에 a 와 b 는 아예 다르다.
    }
}
