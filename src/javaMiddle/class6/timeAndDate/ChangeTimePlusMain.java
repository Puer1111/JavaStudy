package javaMiddle.class6.timeAndDate;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        // 날짜와 시간 조작하기. ChronoFileld 필요
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("dt = " + dt);
        //1
        LocalDateTime plusDt1 = dt.plus(10 , ChronoUnit.MONTHS); // 원하는 년 월 일을 고를 수 있다.
        System.out.println("plusDt1 = " + plusDt1);
        //1 이 조금더 편해짐 2
        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);
        // 특정 시점의 기간 더함.
        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
