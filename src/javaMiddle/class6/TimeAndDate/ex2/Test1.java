package javaMiddle.class6.TimeAndDate.ex2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalender(year,month);
    }
    private static void printCalender(int year,int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year,month,1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월 ~ 일 --> 달력에서의 첫날 전 빈 공백 길이 구하기 월1(1%7 = 1) 화2 (2%7)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0;  i< offsetWeekDays; i++) {
            System.out.print("   ");

        }
        LocalDate dayIterator = firstDayOfMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)) {     // 달력의 일자를 다음달 바로 전까지.
            System.out.printf("%2d ",dayIterator.getDayOfMonth());  // %2d는 각 요일의 칸에 한자릿수들은 오른쪽으로 붙을 수 있게 함.
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
