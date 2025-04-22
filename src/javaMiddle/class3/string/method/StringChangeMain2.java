package javaMiddle.class3.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "        Java Programming         ";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거 (trim) : " + strWithSpaces.trim()+"'"); // 단순 공백 제거
        System.out.println("공백 제거 (strip) : " + strWithSpaces.strip()+"'"); // 공백과 유니코드 공백 포함 제거 Java11 부터 가능
        System.out.println("앞 공백 제거(Strip)" + strWithSpaces.stripLeading()+"'");
        System.out.println("뒷 공백 제거(Strip)" + strWithSpaces.stripTrailing()+"'");
    }
}
