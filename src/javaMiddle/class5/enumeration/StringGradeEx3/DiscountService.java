package javaMiddle.class5.enumeration.StringGradeEx3;

public class DiscountService {

    public int disCount(Grade classgrade, int price){
        int discountPercent = 0;

        if(classgrade == Grade.BASIC){     // 참조값이 같음을 비교한다.
            discountPercent = 10;
        }
        else if(classgrade == Grade.GOLD){
            discountPercent = 20;
        }
        else if(classgrade== Grade.DIAMOND){
            discountPercent = 30;
        }
        else{
            System.out.println(classgrade + " : 할인 X ");
        }
        return price * discountPercent / 100;
    }
}
