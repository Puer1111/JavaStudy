package javaMiddle.class5.enumeration.enumerationReFact3;


public class ClassGradeRefMain3_2 {

    public static void main(String[] args) {

    int price = 10000;

    System.out.println("BASIC 할인: " + Grade.BASIC.disCount(price));
    System.out.println("GOLD 할인: " + Grade.GOLD.disCount(price));
    System.out.println("DIAMOND 할인: " + Grade.DIAMOND.disCount(price));

    }
    // 출력 부분 자체 중복도 줄여보자.
}
