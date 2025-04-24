package javaMiddle.class5.enumeration.StringGradeEx2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
    int basic = discountService.disCount(ClassGrade.BASIC, price);
    int gold = discountService.disCount(ClassGrade.GOLD,price);
    int diamond = discountService.disCount(ClassGrade.DIAMOND,price);

    System.out.println("BASIC 할인: " + basic );
    System.out.println("GOLD 할인: " + gold );
    System.out.println("DIAMOND 할인: " + diamond );

    // 각 등급들의 discount 매개변수에 있는 참조값이 맞는지 discountService 조건문에서 비교한다.
    // classGrade.BASIC , GOLD , DIAMOND 가 각각 인스턴스를 생성하기에 동일한지 확인 가능해진다.

    // 생겨날 수 있을만한 문제점 : 메서드에 들어가는 타입을 보고 객체 를 생성하는건가? 할 수 있다. 이를 막기위해 생성자를 막는다.
    }
}
