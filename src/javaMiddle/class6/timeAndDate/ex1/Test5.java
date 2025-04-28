package javaMiddle.class6.timeAndDate.ex1;

import java.time.*;

public class Test5 { // TestZone
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
//        ZonedDateTime newYork =ZonedDateTime.of(LocalDate.of(2023,12,31),LocalTime.of(19,0), ZoneId.of("America/New_York"));

        System.out.println("Seoul: " + seoul);
        System.out.println("London: " + london);
        System.out.println("NewYork: " + newYork);

    }

}
