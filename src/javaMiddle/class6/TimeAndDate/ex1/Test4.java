package javaMiddle.class6.TimeAndDate.ex1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Test4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate first = date.with(TemporalAdjusters.firstDayOfMonth());
        DayOfWeek firstDay = date.getDayOfWeek(); // 답
        LocalDate last = date.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek lastDay = last.getDayOfWeek(); // 답
        System.out.println("firstDayOfWeek: "+ first.getDayOfWeek());
        System.out.println("lastDayOfWeek:"+ last.getDayOfWeek());
        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}
