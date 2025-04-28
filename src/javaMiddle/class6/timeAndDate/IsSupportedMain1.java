package javaMiddle.class6.timeAndDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 년 월 일만 있는 LocalDate 에서 시간을 꺼내니 지원하지 않는다.
    }
}
