package javaMiddle.class2.immutable.ex;

public class ImmuableMyDateMain {
    public static void main(String[] args) {
        ImmuableMyDate date1 = new ImmuableMyDate(2024, 1, 1);
        ImmuableMyDate date2 = date1;

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);

        System.out.println("2025 -> date2");
        date2 = date2.withYear(2025);   // 항상 변환된 값 받아오는거 잊지 말기.
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
    }
}
