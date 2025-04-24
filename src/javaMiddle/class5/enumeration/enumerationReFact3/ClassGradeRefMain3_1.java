package javaMiddle.class5.enumeration.enumerationReFact3;


public class ClassGradeRefMain3_1 {

    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();

    int basic = discountService.disCount(Grade.BASIC, price);
    int gold = discountService.disCount(Grade.GOLD,price);
    int diamond = discountService.disCount(Grade.DIAMOND,price);

    System.out.println("BASIC 할인: " + basic );
    System.out.println("GOLD 할인: " + gold );
    System.out.println("DIAMOND 할인: " + diamond );

    // 할인율을 Grade에서 하니까 DisCountService가  필요 없어짐.

    }
}
