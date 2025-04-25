package javaMiddle.class6.TimeAndDate;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산
        LocalDate current = LocalDate.of(2030,1,1);
        LocalDate plus = current.plus(period);
        System.out.println("current = " + current);
        System.out.println("plus = " + plus);

        // 기간 차이
        LocalDate start = LocalDate.of(2023,1,1);
        LocalDate end = LocalDate.of(2023,4,2);

        Period between = Period.between(start, end);
        System.out.println("between = " + between);
        System.out.println("between = "+between.getMonths() + "개월" + between.getDays() + "일");
    }
}
