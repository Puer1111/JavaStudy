package javaMiddle.class6.timeAndDate.ex1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test2 { // TestLoopPlus
    public static void main(String[] args) {
        LocalDate dt =  LocalDate.of(2024,1,1);
        for(int i = 0; i < 5; i++){
            LocalDate nextDate = dt.plus(2*i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + ":" + nextDate);
        }

    }
}
