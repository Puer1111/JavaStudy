package javaMiddle.class5.enumeration.ex2;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrade = AuthGrade.values();
        for (AuthGrade authGrade1 : authGrade) {
            printAuthGrade(authGrade1);
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.name() + " level = " + authGrade.getLevel() + " 설명: " + authGrade.getDescription());
    }
}
