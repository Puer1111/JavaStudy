package javaMiddle.class5.enumeration.StringGradeEx0;

public class DiscountService {

    public int disCount(String grade, int price){
        int discountPercent = 0;
        if(grade.equals("Basic")){
            discountPercent = 10;
        }
        else if(grade.equals("GOLD")){
            discountPercent = 20;
        }
        else if(grade.equals("DIAMOND")){
            discountPercent = 30;
        }
        else{
            System.out.println(grade + " : 할인 X ");
        }
        return price * discountPercent / 100;
    }
}
