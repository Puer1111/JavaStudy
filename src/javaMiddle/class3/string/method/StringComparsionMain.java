package javaMiddle.class3.string.method;

public class StringComparsionMain {
    public static void main(String[] args) {
        String str1 = "hello, Java";
        String str2 = "hello, java";
        String str3 = "hello, World";

        System.out.println("str1 equalsa str2 : "  + str1.equals(str2));
        System.out.println("str1 equalsa str2 : "  + str1.equalsIgnoreCase(str2));  // 대소문자 무시하고 동등한지

        System.out.println("'b' compareTo 'a' : "  + "b".compareTo("a"));  // 사전적으로 길이 비교.
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));  // 대소문자 구분 안하고 비교.

        System.out.println("str1 start with 'Hello' : "  + str1.startsWith("hello"));  // hello 로 시작하는지
        System.out.println("str1 end with 'Hello' : "  + str1.endsWith("Java"));  // hello 로 시작하는지
    }
}
