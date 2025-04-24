package javaMiddle.class5.enumeration.enumerationReFact3;


public class ClassGradeRefMain3_3 {

    public static void main(String[] args) {

    int price = 10000;

    printDiscount(Grade.BASIC, price);
    printDiscount(Grade.GOLD, price);
    printDiscount(Grade.DIAMOND, price);

    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.disCount(price));
    }

    // Enum의 상수 이름인 name() 통해 메서드 호출로 줄인다.
    // 새로운 등급이 추가 되면 또 추가해야하는데 이를 커버해보자 --> 3_4
}
