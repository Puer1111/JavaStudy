package javaMiddle.class6.timeAndDate.ex1;

import java.time.LocalDateTime;

public class Test1 {    // testPlus
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024,1,1,0,0,0);
        System.out.println("dt = " + dt);
        LocalDateTime dt1  = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + dt1);

    }
}
