package javaMiddle.class5.enumeration.StringGradeEx1;

public class DiscountService {

    public int disCount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)){       // 문자 상수 씀으로써 바로 문제 발견 가능.
            discountPercent = 10;
        }
        else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }
        else if(grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }
        else{
            System.out.println(grade + " : 할인 X ");
        }
        return price * discountPercent / 100;
    }
}
