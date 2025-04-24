package javaMiddle.class5.enumeration.StringGradeEx0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService dS = new DiscountService();

        int basic = dS.disCount("Basic",price);
        int gold= dS.disCount("GOLD",price);
        int diamond = dS.disCount("DIAMOND",price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("BASIC 등급의 할인 금액: " + gold);
        System.out.println("BASIC 등급의 할인 금액: " + diamond);

        // 단점 : 없는 등급이나 오타 발생 시에도 작동한다.
    }
}
