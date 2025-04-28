package javaMiddle.class6.timeAndDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // Formating: Date & Time -> String
        LocalDateTime now = LocalDateTime.of(2024,12,31,13,30,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("now = " + now);
        System.out.println("formattedDate = " + formattedDate);

        //Parsing String -> Date & Time
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString,formatter);
        System.out.println("dateTime = " + dateTime);
    }
}
