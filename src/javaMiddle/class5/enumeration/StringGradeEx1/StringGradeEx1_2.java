package javaMiddle.class5.enumeration.StringGradeEx1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService dS = new DiscountService();
        // 실수로 존재하지 않는 등급 입력 시 : 없는 등급 OR 오타 OR 소문자
        int vip = dS.disCount("VIP",price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        int diamondd =  dS.disCount("DIAMONDD",price);
        System.out.println("diamondd : " + diamondd);

        int gold = dS.disCount("gold" , price);
        System.out.println("gold : " + gold);

        // 근본적인 문제는 해결되지 않기에 상수를 써달라고 주석을 달아놓거나 해야한다.
        // 결국 실수가 날수있는 명분이 남아있음. disCount 메서드에 String 이 들어올 수 없게 해야한다.
    }
}
