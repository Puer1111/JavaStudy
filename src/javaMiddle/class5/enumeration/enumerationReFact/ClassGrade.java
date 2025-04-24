package javaMiddle.class5.enumeration.enumerationReFact;

public class ClassGrade {

    //Ex2 에서 discountService에 있는 회원등급에 따른 할인을 등급 클래스에서 관리한다.

    public static final ClassGrade BASIC = new ClassGrade(10);            // 인스턴스 생성과 동시에 생성자에 할인율을 넣음으로써 바꿀 수 없게 함.
    public static final ClassGrade GOLD = new  ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int disCountPercent;

    public ClassGrade(int disCounPercent) {
        this.disCountPercent = disCounPercent;
    }

    public int getDisCountPercent() {
        return disCountPercent;
    }
}
