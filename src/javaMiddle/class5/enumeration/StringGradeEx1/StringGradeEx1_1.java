package javaMiddle.class5.enumeration.StringGradeEx1;

import javaMiddle.class5.enumeration.StringGradeEx0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService dS = new DiscountService();

        int basic = dS.disCount(StringGrade.BASIC,price);
        int gold= dS.disCount(StringGrade.GOLD,price);
        int diamond = dS.disCount(StringGrade.DIAMOND,price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("BASIC 등급의 할인 금액: " + gold);
        System.out.println("BASIC 등급의 할인 금액: " + diamond);

        // 오타나 없는 등급에 대해선 1차적으로 막았다 생각 되지만 문자열 자체의 입력은 막을 수 없다.
    }
}
