package javaMiddle.class6.TimeAndDate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        // 날짜의 기간 구할떄 필요한 ChronoField 와 얼마만큼의 시간을 구할지의 ChronoUnit 이 필요

        LocalDateTime dt = LocalDateTime.of(2030,1,1,13,30,59);
        System.out.println("Year =  " + dt.get(ChronoField.YEAR));
        System.out.println("Month =  " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Day =  " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour =  " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute =  " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Second =  " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");    //위에 dt.get 이 너무 반복됨.
        System.out.println("Year = " + dt.getYear());
        System.out.println("Month = " + dt.getMonth()); // 이건 객체로 받는거라 영어로 나옴
        System.out.println("Month = " + dt.getMonthValue());
        System.out.println("Day = " + dt.getDayOfMonth());
        System.out.println("Hour = " + dt.getHour());
        System.out.println("Minute = " + dt.getMinute());
        System.out.println("Second = " + dt.getSecond());

        System.out.println("편의 메서드 없음");
        System.out.println("Minute_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("Second_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));


        
    }
}
