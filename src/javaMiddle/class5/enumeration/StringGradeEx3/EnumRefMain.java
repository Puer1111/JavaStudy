package javaMiddle.class5.enumeration.StringGradeEx3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Class Basic : " + Grade.BASIC.getClass());
        System.out.println("Class Gold : " + Grade.GOLD.getClass());
        System.out.println("Class Diamond : " + Grade.DIAMOND.getClass());

        System.out.println("Ref Basic : " + Grade.BASIC);
        System.out.println("Ref Gold : " + Grade.GOLD);
        System.out.println("Ref Diamond : " + Grade.DIAMOND);

        System.out.println("Ref Basic : " + refValue(Grade.BASIC));
        System.out.println("Ref Gold : " +  refValue(Grade.GOLD));
        System.out.println("Ref Diamond : " + refValue(Grade.DIAMOND));

        // 똑같이 나오는걸 볼 수 있다.
        //Enum 의 경우 toString을 자동으로 OverRiding 에서 이름 그대로 나와버린다.
        // 메서들들 통해 참조값 확인.
    }
    private static String refValue (Object Grade){
        return Integer.toHexString(System.identityHashCode(Grade));
    }
}
