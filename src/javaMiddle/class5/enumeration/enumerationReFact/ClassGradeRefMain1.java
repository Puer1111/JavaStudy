package javaMiddle.class5.enumeration.enumerationReFact;

public class ClassGradeRefMain1 {

    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
    int basic = discountService.disCount(ClassGrade.BASIC, price);
    int gold = discountService.disCount(ClassGrade.GOLD,price);
    int diamond = discountService.disCount(ClassGrade.DIAMOND,price);

    System.out.println("BASIC 할인: " + basic );
    System.out.println("GOLD 할인: " + gold );
    System.out.println("DIAMOND 할인: " + diamond );

    }
}
