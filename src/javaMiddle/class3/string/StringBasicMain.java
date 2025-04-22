package javaMiddle.class3.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 기본적으로 기본형은 소문자 이지만 String 은 대문자 시작 즉 클래스이자 참조형이다. 따라서 객체 생성이 된다
        // str1 에는  String 인스턴스의 참조값만 들어갈 수 있는데 매우 자주 사용되기 떄문에 쌍따옴표로 문자열을 감싸면 str2와 같은 형태로 변경해준다.
        String str1 =  "hello";
        String str2 = new  String("hello");
    }
}
