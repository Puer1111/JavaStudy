package javaMiddle.class5.enumeration.StringGradeEx3;

public class ClassGradeEx3_2 {

    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
//  Grade grade = new Grade(); // private 생성자 했던것과 똑같이 객체 생성 안되는거 확인.

    int basic = discountService.disCount(Grade.BASIC, price);
    }
}
