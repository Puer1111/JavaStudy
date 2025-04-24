package javaMiddle.class5.enumeration.StringGradeEx2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
//    ClassGrade classGrade =  new ClassGrade();      // 객체를 생성할 수 없게 막아야한다.
//    int result = discountService.disCount(classGrade, price);
//    System.out.println("new Class: " + result);

    int basic = discountService.disCount(ClassGrade.BASIC, price); // 이런식으로 쓰게 확실히 유도 되어야함.
    }
}
