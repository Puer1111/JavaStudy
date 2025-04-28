package javaMiddle.class6.timeAndDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain {
    public static void main(String[] args) {
        // 포맷팅: 날짜를 문자로

        LocalDate date = LocalDate.of(2024,12,30);
        System.out.println("date = " + date);  // 2024-12-30 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate); // 2024년 12월 30일

        // Parsing : String -> Date
        String input = "2030년 01월 30일";
        LocalDate ParsedDate = LocalDate.parse(input,formatter);
        System.out.println("ParsedDate = " + ParsedDate);
    }
}
