package javaMiddle.class5.enumeration.StringGradeEx2;


public class DiscountService {

    public int disCount(ClassGrade classgrade, int price){
        int discountPercent = 0;

        if(classgrade.equals(classgrade.BASIC)){     // 참조값이 같음을 비교한다.
            discountPercent = 10;
        }
        else if(classgrade.equals(classgrade.GOLD)){
            discountPercent = 20;
        }
        else if(classgrade.equals(classgrade.DIAMOND)){
            discountPercent = 30;
        }
        else{
            System.out.println(classgrade + " : 할인 X ");
        }
        return price * discountPercent / 100;
    }
}
