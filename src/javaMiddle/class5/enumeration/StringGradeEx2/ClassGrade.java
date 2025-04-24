package javaMiddle.class5.enumeration.StringGradeEx2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new  ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 각각의 인스턴스를 생성하고 final 통해 참조값 변경 X 만든다.

    private ClassGrade(){};

    // 이러한 정해진 객체만 사용하게 하는걸 타입 안전 열거형 이라고 한다.
    // 이러한 작성의 단점은 많은 코드를 적고 생성자를 막아야하는 긴 설정이 필요하다
    // 이를 보완하기 위한 Enum Type 이 있다.
}
