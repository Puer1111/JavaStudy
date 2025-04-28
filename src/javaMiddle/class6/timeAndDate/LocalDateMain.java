package javaMiddle.class6.timeAndDate;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();  // 현재 날짜
        System.out.println("현재: " + now);

        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println("지정 날짜 : " + ofDate);

        //계산 (불변) --> 값을 받아야한다.
        ofDate = ofDate.plusDays(10);
        System.out.println("지정날짜 + 10 :" + ofDate);
    }
}
