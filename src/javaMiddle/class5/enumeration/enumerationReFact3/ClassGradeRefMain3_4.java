package javaMiddle.class5.enumeration.enumerationReFact3;


public class ClassGradeRefMain3_4 {

    public static void main(String[] args) {

        int price = 10000;

        Grade[] grades = Grade.values();
        for(Grade grade : grades) {
            printDiscount(grade, price);
        }

    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.disCount(price));
    }

    //values()를 통해 Enum의 모든 값을 다 가져오고 반복문 통해 읽는다.
}
