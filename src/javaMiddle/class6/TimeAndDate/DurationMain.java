package javaMiddle.class6.TimeAndDate;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println(duration);

        LocalTime lt = LocalTime.of(1,0);
        System.out.println("lt = " + lt);

        // 계산
        LocalTime plus = lt.plus(duration);
        System.out.println("plus = " + plus);

        // 차이
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(10,0);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between.getSeconds()+"초");
        System.out.println("근무 시간: " + between.toHours()+"시간" + between.toMinutesPart()+ "분");

    }
}
