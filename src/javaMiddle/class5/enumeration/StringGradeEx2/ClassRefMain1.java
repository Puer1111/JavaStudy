package javaMiddle.class5.enumeration.StringGradeEx2;

public class ClassRefMain1 {
    public static void main(String[] args) {
        System.out.println("Class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("Class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("Class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("Ref Basic =  " + ClassGrade.BASIC);
        System.out.println("Ref Gold =  " + ClassGrade.GOLD);
        System.out.println("Ref Diamond =  " + ClassGrade.DIAMOND);

        // 각 클래스 경로와 참조값 주소를 알 수 있다.
    }
}
