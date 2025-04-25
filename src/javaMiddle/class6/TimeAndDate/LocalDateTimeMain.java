package javaMiddle.class6.TimeAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("현재: " + now);
        System.out.println("지정: " + of );

        // 날짜와 시간 분리
        LocalDate localDate = of.toLocalDate();
        LocalTime localTime = of.toLocalTime();
        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("LocalDateTime: " + localDateTime);

        // 계산(불변)
        LocalDateTime ofPlus = of.plusDays(1000);
        System.out.println("지정날짜 +1000일: " +  ofPlus);

        // 비교
        System.out.println("현재 날짜가 지정 날짜보다 이전인가? :  " + now.isBefore(ofPlus));
        System.out.println("현재 날짜가 지정 날짜보다 이후인가? :  " + now.isAfter(ofPlus));
        System.out.println("현재 날짜와 지정 날짜가 같은가? :  " +  now.isEqual(ofPlus));
    }
}
