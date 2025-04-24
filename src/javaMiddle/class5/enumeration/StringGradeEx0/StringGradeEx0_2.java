package javaMiddle.class5.enumeration.StringGradeEx0;

public class StringGradeEx0_2 {
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
        
        // 단점: 문자열은 오타가 발생하기 쉽고 유효하지 않은 값이 입력될 수 있고 대소문자에 의해 일관성이 떨어짐
        // String 사용 시 타입 안정성 부족 문제 : 값의 제한 부족 ( TuesDay 를 Funday 등 잘못 입력 ) , 컴파일 오류 감지 불가 ( 컴파일에선 에러가 잡히지 않고 런타임에서 발견되기에 디버깅 어려움 )
        // String 사용 시 정확한 문자 전달 불가능.
        // 해결 법 : 문자 상수를 쓴다. --> StringGrade 확인.
    }
}
