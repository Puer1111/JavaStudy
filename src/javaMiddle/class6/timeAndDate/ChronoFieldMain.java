package javaMiddle.class6.timeAndDate;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] fields = ChronoField.values();
        for (ChronoField field : fields) {
            System.out.println("values= " + field);
            System.out.println("range= " + field.range());   // 각 시간에 대한 것들의 범위를 볼 수 있다.
        }

        System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
